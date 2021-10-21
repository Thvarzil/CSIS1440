package phones;

/**
 * Represents a rotary phone, a type of desk phone
 * 
 * @author Lou LeBohec
 */
public class RotaryPhone extends DeskPhone{

	public RotaryPhone(String newModel, Dimension newDimension, Voltage newVoltage) {
		super(newModel, newDimension, newVoltage);
		// TODO Auto-generated constructor stub
	}

	@Override
	String call(long number) {
		return "Rotating the dial to call "+number;
	}

}
