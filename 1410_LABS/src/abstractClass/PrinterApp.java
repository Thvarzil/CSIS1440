package abstractClass;

public class PrinterApp {

	public static void main(String[] args) {
		Printer[] printers = new Printer[] {new InkjetPrinter("Canon TS202"), new LaserPrinter("Samsung Xpress")};
		
		for(Printer printer : printers) {
			System.out.println(printer.toString());
			for(int i=0;i<11;i++) {
				printer.print();
			}
			if (printer instanceof LaserPrinter) {
				((LaserPrinter) printer).refillToner();
				System.out.println("Remaining Toner: "+((LaserPrinter) printer).getRemainingToner());
			}else {
				((InkjetPrinter) printer).refillCartridge();
				System.out.println("Remaining Cartridge: "+((InkjetPrinter) printer).getRemainingCartridge());
			}
		}

	}

}
