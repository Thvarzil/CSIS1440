package phones;

/**
 * Represents a smart phone, a subclass of Phone
 * 
 * @author Lou LeBohec
 */
public class SmartPhone extends Phone{
	int storage;
	
	public SmartPhone(String newModel, Dimension newDimension, int newStorage) {
		super(newModel, newDimension);
		if(newStorage>0) {
			storage = newStorage;
		}
		else throw new IllegalArgumentException("Storage needs to be assigned a positive value.");
	}
	
	@Override
	public String call(long number) {
		return "Calling "+number+" by selecting the number";
	};
	
	/**
	 * Browses the web
	 * @return confirmation that the web is being browsed
	 */
	public String browse() {
		return "Browsing the web";
	}
	
	/**
	 * Takes a picture
	 * @return the type of picture taken
	 */
	public String takePicture() {
		if(Math.random()>.5) {
			return "Taking a horizontal picture";
		}
		else return "Taking a vertical picture";
	}

	@Override
	public String toString() {
		return model + " " + dimension + " "+storage+"GB";
	}
	
	
	
}
