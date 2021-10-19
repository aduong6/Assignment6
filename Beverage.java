// TODO: Auto-generated Javadoc
/*
 * Programmer: Alan Duong
 */
/**
 * The Class Beverage.
 * Programmer: Alan Duong
 */
public abstract class Beverage {
	
	/** The beverage name. */
	private String beverageName;
	
	/** The type. */
	private TYPE type;
	
	/** The size. */
	private SIZE size;
	
	/** The base price. */
	private final double basePrice = 2.00;
	
	/** The size price. */
	private final double sizePrice = 1.00;

	/**
	 * Instantiates a new beverage.
	 *
	 * @param name the name
	 * @param size the size
	 * @param type the type
	 */
	public Beverage(String name, SIZE size, TYPE type) {
		this.beverageName = name;
		this.size = size;
		this.type = type;
	}
	
	/**
	 * Calc price.
	 *
	 * @return the double
	 */
	abstract double calcPrice();

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Beverage Name =" + beverageName + "\n" + "Type =" + type + "\n" + "Size =" + size;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null)
			return false;
		if (getClass() != object.getClass())
			return false;
		Beverage other = (Beverage) object;
		if (beverageName == null) {
			if (other.beverageName != null)
				return false;
		} else if (!beverageName.equals(other.beverageName))
			return false;
		if (size != other.size)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	/**
	 * Gets the beverage name.
	 *
	 * @return the beverage name
	 */
	public String getBeverageName() {
		return beverageName;
	}

	/**
	 * Sets the beverage name.
	 *
	 * @param name the new beverage name
	 */
	public void setBeverageName(String name) {
		this.beverageName = name;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public TYPE getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(TYPE type) {
		this.type = type;
	}

	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public SIZE getSize() {
		return size;
	}

	/**
	 * Sets the size.
	 *
	 * @param size the new size
	 */
	public void setSize(SIZE size) {
		this.size = size;
	}

	/**
	 * Gets the base price.
	 *
	 * @return the base price
	 */
	public double getBasePrice() {
		return basePrice;
	}

	/**
	 * Gets the size price.
	 *
	 * @return the size price
	 */
	public double getSizePrice() {
		return sizePrice;
	}

}