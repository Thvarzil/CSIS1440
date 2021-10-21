package m02;

/**
 * Test application for the Window class and subclasses
 * 
 * @author Lou Lebohec
 *
 */
public class Module02 {

	public static void main(String[] args) {
		Window[] windows = {
				   new SlidingWindow(24, 36, "up"),
				   new CasementWindow(50, 28.5, true),
				   new SlidingWindow(30.5, 30.5, "left"),
				   new CasementWindow(14, 24, false)
				};
		
		for(Window window : windows) {
			System.out.println(window.toString());
			window.open();
			if(window instanceof CasementWindow) {
				if(((CasementWindow)window).isFrench()) {
					System.out.println("Enjoying the unobstructed view!");
				}
				else {
					System.out.println(window.toString());
				}
			}
			else {
				System.out.println(window.toString());
			}
			window.close();
			System.out.println();
		}

	}

}
