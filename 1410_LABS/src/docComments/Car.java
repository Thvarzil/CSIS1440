package docComments;
/**
 * Represents a car of some kind
 * 
 * @author anarion
 *
 */
public class Car {
	private String make;
	private String model;
	private int mpg;
	/**
	 * Constructs a new car object with specified attributes
	 * @param make
	 * @param model
	 * @param mpg
	 */
	public Car(String make, String model, int mpg) {
		this.make = make;
		this.model = model;
		this.mpg = mpg;
	}
	/**
	 * Returns the manufacturer name
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * Returns the model name
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * Returns the gas efficiency
	 * @return the mpg
	 */
	public int getMpg() {
		return mpg;
	}
	
	
}
