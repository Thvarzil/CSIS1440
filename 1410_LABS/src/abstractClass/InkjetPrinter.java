package abstractClass;

/**
 * @author Lou LeBohec
 *
 */
public class InkjetPrinter extends Printer {
	public int remainingCartridge;
	
	
	public InkjetPrinter(String model) {
		super(model);
		this.remainingCartridge=100;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		if(remainingCartridge<=0) {
			System.out.println("The toner is empty.");
		}else {
			remainingCartridge-=10;
			System.out.printf("%s is printing. Remaining toner: %d%%\n",this.getModel(),this.getRemainingCartridge());
		}
	}

	/**
	 * @return the remainingCartridge
	 */
	public int getRemainingCartridge() {
		return remainingCartridge;
	}
	
	/**
	 * Refills the cartridge, setting it to 100
	 */
	public void refillCartridge() {
		this.remainingCartridge=100;
	}

}
