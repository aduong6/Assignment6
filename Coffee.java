// TODO: Auto-generated Javadoc
/*
 * Programmer: Alan Duong
 */
/**
 * The Class Coffee.
 */
public class Coffee extends Beverage {
	
	/** The extra shot. */
	private boolean extraShot;
	
	/** The extra syrup. */
	private boolean extraSyrup;
	
	/** The shot price. */
	private final double shotPrice = 0.50;
	
	/** The syrup price. */
	private final double syrupPrice = 0.50;

	/**
	 * Instantiates a new coffee.
	 *
	 * @param name the name
	 * @param size the size
	 * @param shots the shots
	 * @param syrup the syrup
	 */
	public Coffee(String name, SIZE size, boolean shots, boolean syrup) {
		super(name, size, TYPE.COFFEE);
		this.extraShot = shots;
		this.extraSyrup = syrup;
	}

	/* (non-Javadoc)
	 * @see Beverage#calcPrice()
	 */
	@Override
	double calcPrice() {
		double price = 0.0;
		price += super.getBasePrice();
		switch (super.getSize()) {
			case SMALL: break;
			case MEDIUM: price += super.getSizePrice();
						 break;
			case LARGE: price += 2 * super.getSizePrice();
						break;
		}
		price += this.extraShot ? this.shotPrice : 0.0;
		price += this.extraSyrup ? this.syrupPrice : 0.0;
		return price;
	}

	/* (non-Javadoc)
	 * @see Beverage#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "\n" +
			   "Coffee extraShot =" + extraShot + ", extraSyrup =" + extraSyrup + "\n" +
			   "Price =" + this.calcPrice();
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
		Coffee other = (Coffee) object;
		if (extraShot != other.extraShot)
			return false;
		if (extraSyrup != other.extraSyrup)
			return false;
		return true;
	}
	
	/**
	 * Gets the extra shot.
	 *
	 * @return the extra shot
	 */
	public boolean getExtraShot() {
		return extraShot;
	}

	/**
	 * Sets the extra shot.
	 *
	 * @param extraShot the new extra shot
	 */
	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}

	/**
	 * Gets the extra syrup.
	 *
	 * @return the extra syrup
	 */
	public boolean getExtraSyrup() {
		return extraSyrup;
	}

	/**
	 * Sets the extra syrup.
	 *
	 * @param extraSyrup the new extra syrup
	 */
	public void setExtraSyrup(boolean extraSyrup) {
		this.extraSyrup = extraSyrup;
	}

	/**
	 * Gets the shot price.
	 *
	 * @return the shot price
	 */
	public double getShotPrice() {
		return shotPrice;
	}

	/**
	 * Gets the syrup price.
	 *
	 * @return the syrup price
	 */
	public double getSyrupPrice() {
		return syrupPrice;
	}	

}
