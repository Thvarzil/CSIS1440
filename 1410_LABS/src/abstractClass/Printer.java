package abstractClass;

/**
 * @author Lou LeBohec
 *
 */
public abstract class Printer {
	public String model;
	public static int count;
	public int serialNumber;
	
	public Printer(String model) {
		this.model = model;
		Printer.count++;
		this.serialNumber = 12345+Printer.count;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the serialNumber
	 */
	public int getSerialNumber() {
		return serialNumber;
	}
	
	/**
	 * Reports that the Printer is printing, and reports the ink level.
	 * If the ink is empty, reports this instead.
	 */
	public abstract void print();
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+": "+this.model+" #"+this.serialNumber;
	}
	
	
	
}
