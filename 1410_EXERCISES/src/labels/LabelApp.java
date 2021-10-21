package labels;
/**
 * 		
 * @author anarion
 *
 */
public class LabelApp {
	public static void main(String[] args) {
		
		Address address1 = new Address("860 E 300 S #4", "Salt Lake City", State.UT, 84102);
		Address address2 = new Address("860 E 300 S #19", "Salt Lake City", State.UT, 84102);
		
		System.out.println(address1);
		System.out.println(address2);
		System.out.println();
		
		AddressLabel label = new AddressLabel("Louis", "LeBohec", address1);
		System.out.println(label);
		label.printLabel();
		
		System.out.println();
		System.out.println();
		System.out.printf("street: %s%ncity: %s%nstate: %s%nzip: %d%n", address1.getStreet(),address1.getCity(),address1.getState(),address1.getZip());
		
	}
	
	
}
