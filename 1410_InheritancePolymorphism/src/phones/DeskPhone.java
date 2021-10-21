package phones;

/**
 * Represents a desk phone, a subclass of Phone
 * 
 * @author Lou LeBohec
 */
public abstract class DeskPhone extends Phone{
	Voltage voltage;
	boolean connected;
	
	
	public DeskPhone(String newModel, Dimension newDimension, Voltage newVoltage) {
		super(newModel, newDimension);
		
		voltage = newVoltage;
		connected = false;
	}
	
	/**
	 * Connects the phone
	 */
	public void plugIn() {
		connected = true;
	}
	
	/**
	 * Disconnects the phone 
	 */
	public void unplug() {
		connected = false;
	}

	/**
	 * @return the connected
	 */
	public boolean isConnected() {
		return connected;
	}

	@Override
	public String toString() {
		String connectionInfo;
		if(connected) {
			connectionInfo = "connected";
		}
		else connectionInfo = "not connected";
		return model+" "+dimension+" "+voltage+" "+connectionInfo;
	}
	
	

}
