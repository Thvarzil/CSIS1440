package m02;

/**
 * Represents a sliding window, which is a type of window.
 * 
 * @author Lou LeBohec
 *
 */
public class SlidingWindow extends Window{
	String direction;
	
	public SlidingWindow(double width, double height, String direction) {
		super(width, height);
		
		this.direction = direction;
	}

	@Override
	public void open() {
		super.open();
		
		System.out.println("Opening the window sliding it "+this.direction+".");
	}
	
	
}
