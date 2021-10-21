package docComments;
/**
 * Tests the TripPlanner and Car classes.
 * @author anarion
 *
 */
public class TravelApp {
	public static void main(String[] args) {
		
		//Creates two instances of Car
		 
		Car m4 = new Car("BMW", "M4", 25);
		Car civic = new Car("Honda", "Civic", 42);
		
		//Prints the car information to verify the class
		System.out.println("Cars:");
		System.out.printf("%s %s, %dmpg%n", m4.getMake(),m4.getModel(),m4.getMpg());
		System.out.printf("%s %s, %dmpg%n%n", civic.getMake(),civic.getModel(),civic.getMpg());
		
		//Creates two instances of TripPlanner
		TripPlanner california = new TripPlanner("San Francisco","Los Angeles",382,m4);
		TripPlanner florida = new TripPlanner("Tampa", "Miami",280,civic);
		
		//Prints the TripPlanner information to verify the class
		System.out.println("California Trip:");
		System.out.println(california.toString());
		System.out.printf("fuel consumption: %.2f%n%n", california.fuelConsumption());
		
		System.out.println("Florida Trip:");
		System.out.println(florida.toString());
		System.out.printf("fuel consumption: %.2f%n%n", florida.fuelConsumption());
		
	}
}
