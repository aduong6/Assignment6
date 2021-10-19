// TODO: Auto-generated Javadoc
/*
 * Programmer: Alan Duong
 */
/**
 * The Class Alcohol.
 */
public class Alcohol extends Beverage {
	
	/** The Weekends. */
	private boolean Weekends;
	
	/** The Weekend price. */
	private final double WeekendPrice = 0.60;

	/**
	 * Instantiates a new alcohol.
	 *
	 * @param name the name
	 * @param size the size
	 * @param weekend the weekend
	 */
	public Alcohol(String name, SIZE size, boolean weekend) {
		super(name, size, TYPE.ALCOHOL);
		this.Weekends = weekend;
	}

	/* (non-Javadoc)
	 * @see Beverage#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "\n" + "Alcohol on Weekend = " + Weekends + "\n" + "WeekendPrice = " + WeekendPrice + "\n" +
				"Price = " + this.calcPrice();
	}

	/* (non-Javadoc)
	 * @see Beverage#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (!super.equals(object))
			return false;
		if (getClass() != object.getClass())
			return false;
		Alcohol other = (Alcohol) object;
		if (Weekends != other.Weekends)
			return false;
		if (Double.doubleToLongBits(WeekendPrice) != Double.doubleToLongBits(other.WeekendPrice))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see Beverage#calcPrice()
	 */
	@Override
	double calcPrice() {
		double price = 0.0;
		price += super.getBasePrice();
		switch (super.getSize()) {
			case SMALL:	break;
			case MEDIUM: price += super.getSizePrice();
						 break;
			case LARGE: price += 2 * super.getSizePrice();
						break;
		}
		price += this.Weekends ? this.WeekendPrice : 0.0;
		return price;
	}

	/**
	 * Checks if is weekend.
	 *
	 * @return true, if is weekend
	 */
	public boolean isWeekend() {
		return Weekends;
	}

	/**
	 * Sets the weekend.
	 *
	 * @param weekend the new weekend
	 */
	public void setWeekend(boolean weekend) {
		this.Weekends = weekend;
	}

	/**
	 * Gets the weekend price.
	 *
	 * @return the weekend price
	 */
	public double getWeekendPrice() {
		return WeekendPrice;
	}

}
