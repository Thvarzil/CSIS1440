package docComments;
/**
 * 
 * Represents a trip being taken, including the departure, arrival, distance, and vehicle used.
 * 
 * @author anarion
 *
 */
public class TripPlanner {
	private String departure;
	private String arrival;
	private int distance;
	private Car car;
	
	/**
	 *
	 * Constructs a trip object.
	 *
	 * @param departure
	 * @param arrival
	 * @param distance
	 */
	public TripPlanner(String departure, String arrival, int distance, Car car) {
		this.departure = departure;
		this.arrival = arrival;
		this.distance = distance;
		this.car = car;
	}
	/**
	 * Calculates the total fuel usage based on the distance and fuel efficiency
	 * 
	 * @param distance
	 * @param mpg
	 * @return
	 */
	public double fuelConsumption() {
		
		
		
		return (double)distance/(double)car.getMpg();
	}
	
	@Override
	public String toString() {
		return "TripPlanner [departure=" + departure + ", arrival=" + arrival + ", distance=" + distance + ", car="+car.getModel()+"]";
	}
	

};
