package labInterface;

/**
 * Represents the flight-related attributes of an object
 * 
 * @author anarion
 *
 */
public interface Flyable {
	/**
	 * Describes how the flyable takes off
	 */
	void launch();
	/**
	 * Describes how the flyable lands
	 */
	void land();
}
