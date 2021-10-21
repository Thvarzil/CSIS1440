package m02;

/**
 * Represents a casement window, which is a type of window. This type of window can be french
 * 
 * @author Lou LeBohec
 *
 */
public class CasementWindow extends Window{
	boolean french;

	public CasementWindow(double width, double height, boolean french) {
		super(width, height);
		
		this.french = french;
	}
	
	@Override
	public void open() {
		super.open();
		
		if(this.french) {
			System.out.println("Opening both window panes.");
		}
		else {
			System.out.println("Opening the window pane.");
		}
	}
	
	/**
	 * Reports if the window is a french casement window or not
	 * @return whether it's french or not
	 */
	public boolean isFrench() {
		return this.french;
	}

	@Override
	public String toString() {
		if(this.french) {
			return (super.toString()+" *");
		}
		else {
			return super.toString();
		}
	}
	
	
	

}
