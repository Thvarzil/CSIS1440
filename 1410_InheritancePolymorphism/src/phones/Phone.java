package phones;

/**
 * Represents some type of phone
 * 
 * @author Lou LeBohec
 */
public abstract class Phone {
	String model;
	Dimension dimension;
	
	public Phone(String newModel, Dimension newDimension) {
		model = newModel;
		dimension = newDimension;
	}
	
	abstract String call(long number);

	@Override
	public String toString() {
		return "Phone [model=" + model + ", dimension=" + dimension + "]";
	}
	
	

}