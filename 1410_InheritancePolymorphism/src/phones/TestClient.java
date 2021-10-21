package phones;

/**
 * Puts class Phone and subclasses through a series of manipulations and tests
 * 
 * @author Lou LeBohec
 */
public class TestClient {

	public static void main(String[] args) {
		RotaryPhone rPhone = new RotaryPhone("Model 500", new Dimension(143,208,119),Voltage.V110);
		PushButtonPhone pBPhone = new PushButtonPhone("Cortelco 2500", new Dimension(178,228,127),Voltage.DUAL);
		SmartPhone sPhone1 = new SmartPhone("Pixel3", new Dimension(145.6,68.2,7.9),128);
		SmartPhone sPhone2 = new SmartPhone("iPhone8", new Dimension(138.4,67.3,7.3),64);
		
		System.out.println("Various Phones:");
		System.out.println(rPhone);
		System.out.println(pBPhone);
		System.out.println(sPhone1);
		System.out.println(sPhone2);
		System.out.println();
		
		rPhone.plugIn();
		pBPhone.plugIn();
		
		if(Math.random()>=.5) rPhone.unplug();
		else pBPhone.unplug();
		
		Phone[] phones = new Phone[] {rPhone, pBPhone, sPhone1, sPhone2};
		System.out.println("Array Elements:");
		for(Phone phone : phones) {
			System.out.println(phone.toString());
			phone.call(8019574111L);
			if(phone instanceof SmartPhone) {
				System.out.println(((SmartPhone) phone).browse());
				System.out.println(((SmartPhone) phone).takePicture());
			}
			
		}
		
	}

}
