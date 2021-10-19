// TODO: Auto-generated Javadoc
/*
 * Programmer: Alan Duong
 */
/**
 * The Class Customer.
 */
public class Customer {
	
	/** The name. */
	private String name;
	
	/** The age. */
	private int age;

	/**
	 * Instantiates a new customer.
	 *
	 * @param name the name
	 * @param age the age
	 */
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Instantiates a new customer.
	 *
	 * @param other the other
	 */
	public Customer(Customer other) {
		this.name = other.getName();
		this.age = other.getAge();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer Name =" + name + "\n" + "Age =" + age;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
