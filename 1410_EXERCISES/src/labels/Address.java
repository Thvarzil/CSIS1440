package labels;
/**
 * US Address that is not a PO Box
 * 
 * @author anarion
 *
 */
public class Address {
	
	private String street;
	private String city;
	private State state;
	private int zip;
	
	/**
	 * Constructor initializes the fields
	 * @param street	Street address
	 * @param city
	 * @param state		US State
	 * @param zip		5-digit ZIP Code
	 */
	public Address(String street, String city, State state, int zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	/**
	 * Returns the street address
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Returns the city or town
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Returns the US State
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * Returns the ZIP Code
	 * @return the zip
	 */
	public int getZip() {
		return zip;
	}
	
	
}
