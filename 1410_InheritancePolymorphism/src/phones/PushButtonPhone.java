package phones;

/**
 * Represents a push button phone, a type of desk phone
 * 
 * @author Lou LeBohec
 *
 */
public class PushButtonPhone extends DeskPhone{

	public PushButtonPhone(String newModel, Dimension newDimension, Voltage newVoltage) {
		super(newModel, newDimension, newVoltage);
		// TODO Auto-generated constructor stub
	}

	@Override
	String call(long number) {
		return "Pushing buttons to call "+number;
	}

}
