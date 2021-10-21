package m02;

/**
 * Represents a window
 * 
 * @author Lou LeBohec
 *
 */
public abstract class Window {
	double width;
	double height;
	boolean open;
	
	public Window(double width, double height) {
		this.width = width;
		this.height = height;
		this.open = false;
	}
	
	/**
	 * Opens the window
	 */
	public void open() {
		this.open = true;
	}
	
	/**
	 * Closes the window
	 */
	public void close() {
		this.open=false;
		
		System.out.println(String.format("Closing the %s.", this.getClass().getSimpleName()));
	}

	@Override
	public String toString() {
		if(open) {
			return String.format("(O) %s [%.1f x %.1f]", this.getClass().getSimpleName(),this.width,this.height);
		}
		else {
			return String.format("(C) %s [%.1f x %.1f]", this.getClass().getSimpleName(),this.width,this.height);
		}
	}
	
	
	
}
