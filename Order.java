/*
 * Programmer: Alan Duong
 */
import java.util.ArrayList;
import java.util.Random;
// TODO: Auto-generated Javadoc
/**
 * The Class Order.
 */
public class Order implements OrderInterface, Comparable<Order> {
	
	/** The order no. */
	private int orderNo;
	
	/** The order time. */
	private int orderTime;
	
	/** The order day. */
	private DAY orderDay;
	
	/** The customer. */
	private Customer customer;
	
	/** The beverages. */
	private ArrayList<Beverage> beverages;

	/**
	 * Instantiates a new order.
	 *
	 * @param time the time
	 * @param day the day
	 * @param customer the customer
	 */
	public Order(int time, DAY day, Customer customer) {
		Random rand = new Random();
		this.orderNo = rand.nextInt(90000-10000)+10000;
		this.orderTime = time;
		this.orderDay = day;
		this.customer = new Customer(customer);
		this.beverages = new ArrayList<Beverage>();
	}

	/* (non-Javadoc)
	 * @see OrderInterface#isWeekend()
	 */
	@Override
	public boolean isWeekend() {
		switch (this.orderDay) {
			case SATURDAY:
			case SUNDAY: return true;
			default: return false;
		}
	}

	/* (non-Javadoc)
	 * @see OrderInterface#getBeverage(int)
	 */
	@Override
	public Beverage getBeverage(int itemNo) {
		return this.beverages.get(itemNo);
	}

	/* (non-Javadoc)
	 * @see OrderInterface#addNewBeverage(java.lang.String, SIZE, boolean, boolean)
	 */
	@Override
	public void addNewBeverage(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		this.beverages.add(new Coffee(bevName, size, extraShot, extraSyrup));

	}

	/* (non-Javadoc)
	 * @see OrderInterface#addNewBeverage(java.lang.String, SIZE)
	 */
	@Override
	public void addNewBeverage(String bevName, SIZE size) {
		this.beverages.add(new Alcohol(bevName, size, this.isWeekend()));

	}

	/* (non-Javadoc)
	 * @see OrderInterface#addNewBeverage(java.lang.String, SIZE, int, boolean)
	 */
	@Override
	public void addNewBeverage(String bevName, SIZE size, int numOfFruits, boolean addPRotien) {
		this.beverages.add(new Smoothie(bevName, size, numOfFruits, addPRotien));

	}

	/* (non-Javadoc)
	 * @see OrderInterface#calcOrderTotal()
	 */
	@Override
	public double calcOrderTotal() {
		double total = 0.0;
		for (Beverage bev: this.beverages) {
			total += bev.calcPrice();
		}
		return total;
	}

	/* (non-Javadoc)
	 * @see OrderInterface#findNumOfBeveType(TYPE)
	 */
	@Override
	public int findNumOfBeveType(TYPE type) {
		int result = 0;
		for (Beverage bev: beverages) {
			if (bev.getType() == type) {
				result++;
			}
		}
		return result;
	}
	
	/**
	 * Gets the total items.
	 *
	 * @return the total items
	 */
	public int getTotalItems() {
		return this.beverages.size();
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Order o) {
		if (this.orderNo > o.getOrderNo()) {
			return 1;
		} else if(this.orderNo < o.orderNo) {
			return -1;
		} else {
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Order" + "\n" + "OrderNo =" + orderNo + "\n" + "OrderTime =" + orderTime + "\n" + "OrderDay =" + orderDay + "\n" + "Customer ="
				+ customer + "\n" + "Beverages =" + beverages + "\n" + "OrderTotal=" + this.calcOrderTotal();
	}

	/**
	 * Gets the order no.
	 *
	 * @return the order no
	 */
	public int getOrderNo() {
		return orderNo;
	}

	/**
	 * Sets the order no.
	 *
	 * @param orderNumber the new order no
	 */
	public void setOrderNo(int orderNumber) {
		this.orderNo = orderNumber;
	}

	/**
	 * Gets the order time.
	 *
	 * @return the order time
	 */
	public int getOrderTime() {
		return orderTime;
	}

	/**
	 * Sets the order time.
	 *
	 * @param orderTime the new order time
	 */
	public void setOrderTime(int orderTime) {
		this.orderTime = orderTime;
	}

	/**
	 * Gets the order day.
	 *
	 * @return the order day
	 */
	public DAY getOrderDay() {
		return orderDay;
	}

	/**
	 * Sets the order day.
	 *
	 * @param orderDay the new order day
	 */
	public void setOrderDay(DAY orderDay) {
		this.orderDay = orderDay;
	}

	/**
	 * Gets the customer.
	 *
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * Sets the customer.
	 *
	 * @param customer the new customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * Gets the beverages.
	 *
	 * @return the beverages
	 */
	public ArrayList<Beverage> getBeverages() {
		return beverages;
	}

	/**
	 * Sets the beverages.
	 *
	 * @param beverages the new beverages
	 */
	public void setBeverages(ArrayList<Beverage> beverages) {
		this.beverages = beverages;
	}

}