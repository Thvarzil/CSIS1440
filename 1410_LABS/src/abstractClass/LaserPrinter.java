package abstractClass;

/**
 * @author Lou LeBohec
 *
 */
public class LaserPrinter extends Printer {
	public int remainingToner;
	
	public LaserPrinter(String model) {
		super(model);
		this.remainingToner = 100;
	}

	@Override
	public void print() {
		if(remainingToner<=0) {
			System.out.println("The toner is empty.");
		}else {
			remainingToner-=10;
			System.out.printf("%s is printing. Remaining toner: %d%%\n",this.getModel(),this.getRemainingToner());
		}
	}

	/**
	 * @return the remainingToner
	 */
	public int getRemainingToner() {
		return remainingToner;
	}
	
	/**
	 * Refills the toner, setting it to 100
	 */
	public void refillToner() {
		this.remainingToner=100;
	}

}
