import java.util.ArrayList;
// TODO: Auto-generated Javadoc
/*
 * Programmer: Alan Duong
 */
/**
 * The Class BevShop.
 */
public class BevShop implements BevShopInterfce {
	
	/** The number of alcohol drinks. */
	private int numberOfAlcoholDrinks;
	
	/** The orders. */
	private ArrayList<Order> orders;
	
	/** The current order. */
	private Order currentOrder;

	/**
	 * Instantiates a new bev shop.
	 */
	public BevShop() {
		orders = new ArrayList<Order>(); 
	}

	/* (non-Javadoc)
	 * @see BevShopInterfce#validTime(int)
	 */
	@Override
	public boolean validTime(int time) {
		if (time < MIN_TIME || time > MAX_TIME) {
			return false;
		} else {
			return true;
		}
		
	}

	/* (non-Javadoc)
	 * @see BevShopInterfce#eligibleForMore()
	 */
	@Override
	public boolean eligibleForMore() {
		if (currentOrder.findNumOfBeveType(TYPE.ALCOHOL) < MAX_ORDER_FOR_ALCOHOL) {
			return true;
		} else {
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see BevShopInterfce#validAge(int)
	 */
	@Override
	public boolean validAge(int age) {
		if (age < MIN_AGE_FOR_ALCOHOL) {
			return false;
		} else {
			return true;
		}
	}

	/* (non-Javadoc)
	 * @see BevShopInterfce#startNewOrder(int, DAY, java.lang.String, int)
	 */
	@Override
	public void startNewOrder(int time, DAY day, String customerName, int customerAge) {
		currentOrder = new Order(time, day, new Customer(customerName, customerAge));
		orders.add(currentOrder);

	}

	/* (non-Javadoc)
	 * @see BevShopInterfce#processCoffeeOrder(java.lang.String, SIZE, boolean, boolean)
	 */
	@Override
	public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		this.currentOrder.addNewBeverage(bevName, size, extraShot, extraSyrup);
	}

	/* (non-Javadoc)
	 * @see BevShopInterfce#processAlcoholOrder(java.lang.String, SIZE)
	 */
	@Override
	public void processAlcoholOrder(String bevName, SIZE size) {
		currentOrder.addNewBeverage(bevName, size);
	}

	/* (non-Javadoc)
	 * @see BevShopInterfce#processSmoothieOrder(java.lang.String, SIZE, int, boolean)
	 */
	@Override
	public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtien) {
		currentOrder.addNewBeverage(bevName, size, numOfFruits, addProtien);
	}

	/* (non-Javadoc)
	 * @see BevShopInterfce#findOrder(int)
	 */
	@Override
	public int findOrder(int orderNo) {
		for (int i = 0; i < orders.size(); i++) {
			if (orders.get(i).getOrderNo() == orderNo) {
				return i;
			}
		}
		return -1;
	}

	/* (non-Javadoc)
	 * @see BevShopInterfce#totalOrderPrice(int)
	 */
	@Override
	public double totalOrderPrice(int orderNo) {
		return orders.get(findOrder(orderNo)).calcOrderTotal();
	}

	/* (non-Javadoc)
	 * @see BevShopInterfce#totalMonthlySale()
	 */
	@Override
	public double totalMonthlySale() {
		double total = 0.0;
		for (Order o: orders) {
			total += o.calcOrderTotal();
		}
		return total;
	}

	/* (non-Javadoc)
	 * @see BevShopInterfce#sortOrders()
	 */
	@Override
	public void sortOrders() {
		orders.sort(null);
	}

	/* (non-Javadoc)
	 * @see BevShopInterfce#getOrderAtIndex(int)
	 */
	@Override
	public Order getOrderAtIndex(int index) {
		return orders.get(index);
	}
	
	/**
	 * Total num of monthly orders.
	 *
	 * @return the int
	 */
	public int totalNumOfMonthlyOrders() {
		return orders.size();
	}
	
	/**
	 * Checks if is max fruit.
	 *
	 * @param i the i
	 * @return true, if is max fruit
	 */
	public boolean isMaxFruit(int i) {
		return (MAX_FRUIT == i);
	}
	
	/**
	 * Gets the max order for alcohol.
	 *
	 * @return the max order for alcohol
	 */
	public int getMaxOrderForAlcohol() {
		return MAX_ORDER_FOR_ALCOHOL;
	}
	
	/**
	 * Gets the min age for alcohol.
	 *
	 * @return the min age for alcohol
	 */
	public int getMinAgeForAlcohol() {
		return MIN_AGE_FOR_ALCOHOL;
	}

	/**
	 * Gets the num of alcohol drink.
	 *
	 * @return the num of alcohol drink
	 */
	public int getNumOfAlcoholDrink() {
		return numberOfAlcoholDrinks;
	}

	/**
	 * Sets the num of alcohol drink.
	 *
	 * @param numOfAlcoholDrink the new num of alcohol drink
	 */
	public void setNumOfAlcoholDrink(int numOfAlcoholDrink) {
		this.numberOfAlcoholDrinks = numOfAlcoholDrink;
	}


	/**
	 * Gets the orders.
	 *
	 * @return the orders
	 */
	public ArrayList<Order> getOrders() {
		return orders;
	}

	/**
	 * Sets the orders.
	 *
	 * @param orders the new orders
	 */
	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}

	/**
	 * Gets the current order.
	 *
	 * @return the current order
	 */
	public Order getCurrentOrder() {
		return currentOrder;
	}

	/**
	 * Sets the current order.
	 *
	 * @param currentOrder the new current order
	 */
	public void setCurrentOrder(Order currentOrder) {
		this.currentOrder = currentOrder;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BevShop numberOfAlcoholDrink =" + numberOfAlcoholDrinks + "\n" + "Orders =" + orders + "\n" + "CurrentOrder ="
				+ currentOrder + "\n" + "TotalMonthlySale=" + totalMonthlySale();
	}

}