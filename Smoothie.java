/*
 * Programmer: Alan Duong
 */
// TODO: Auto-generated Javadoc
/**
 * The Class Smoothie.
 */
public class Smoothie extends Beverage {
	
	/** The number of fruits. */
	private int numberOfFruits;
	
	/** The protien. */
	private boolean protien;
	
	/** The protein price. */
	private final double proteinPrice = 1.50;
	
	/** The fruit price. */
	private final double fruitPrice = 0.50;

	/**
	 * Instantiates a new smoothie.
	 *
	 * @param name the name
	 * @param size the size
	 * @param fruits the fruits
	 * @param protein the protein
	 */
	public Smoothie(String name, SIZE size, int fruits, boolean protein) {
		super(name, size, TYPE.SMOOTHIE);
		this.numberOfFruits = fruits;
		this.protien = protein;
	}

	/* (non-Javadoc)
	 * @see Beverage#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "\n" +
	           "Smoothie" + "\n" + "Fruits =" + numberOfFruits + "\n" + "Protein =" + protien + "\n" +
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
		Smoothie other = (Smoothie) object;
		if (Double.doubleToLongBits(fruitPrice) != Double.doubleToLongBits(other.fruitPrice))
			return false;
		if (numberOfFruits != other.numberOfFruits)
			return false;
		if (protien != other.protien)
			return false;
		if (Double.doubleToLongBits(proteinPrice) != Double.doubleToLongBits(other.proteinPrice))
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
			case SMALL: break;
			case MEDIUM: price += super.getSizePrice();
						 break;
			case LARGE: price += 2 * super.getSizePrice();
						break;
		}
		price += this.protien ? this.proteinPrice : 0.0;
		price += this.numberOfFruits * this.fruitPrice;
		return price;
	}

	/**
	 * Gets the number of fruits.
	 *
	 * @return the number of fruits
	 */
	public int getNumberOfFruits() {
		return numberOfFruits;
	}

	/**
	 * Sets the number of fruits.
	 *
	 * @param fruits the new number of fruits
	 */
	public void setNumberOfFruits(int fruits) {
		this.numberOfFruits = fruits;
	}

	/**
	 * Gets the protien.
	 *
	 * @return the protien
	 */
	public boolean getProtien() {
		return protien;
	}

	/**
	 * Sets the protien.
	 *
	 * @param protein the new protien
	 */
	public void setProtien(boolean protein) {
		this.protien = protein;
	}

	/**
	 * Gets the protein price.
	 *
	 * @return the protein price
	 */
	public double getProteinPrice() {
		return proteinPrice;
	}

	/**
	 * Gets the fruit price.
	 *
	 * @return the fruit price
	 */
	public double getFruitPrice() {
		return fruitPrice;
	}

}