package labels;
/**
 * Represents an address label including the full name of the resident and their address.
 * @author anarion
 *
 */
public class AddressLabel {
	private String firstName;
	private String lastName;
	private Address address;
	/**
	 * Constructor of class AdressLabel
	 * 
	 * @param firstName
	 * @param lastName
	 * @param address
	 */
	public AddressLabel(String firstName, String lastName, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "AddressLabel [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	
	/**
	 * Generates the shipping label in the following format:</br>
	 * {first name} {last name}</br>
	 * {street address}</br>
	 * {city}, {state} {zip}</br>
	 */
	public void printLabel() {
		System.out.printf("%s %s%n%s%n%s, %s %d", firstName,lastName,address.getStreet(),address.getCity(),address.getState(),address.getZip());
	}
	

}
