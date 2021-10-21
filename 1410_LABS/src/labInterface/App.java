package labInterface;

import java.util.ArrayList;
import java.util.Arrays;

public class App
{

	/**
	 * Tests the various classes that implement Flyable
	 * @param args
	 */
	public static void main(String[] args)
	{
		Plane myPlane = new Plane(4, "Boeing 747");
		System.out.printf("myPlane: %s%n", myPlane);

		Hangglider myHangglider = new Hangglider(true);
		System.out.printf("myHangglider: %s%n", myHangglider);

		Bird myBird = new Bird("Swallow");
		System.out.printf("myBird: %s%n", myBird);
		System.out.println();
		ArrayList<Flyable> flyingThings = new ArrayList<Flyable>(Arrays.asList(myPlane, myHangglider, myBird));
		
		for(Flyable flyingThing : flyingThings) {
			System.out.println(flyingThing.toString());
			flyingThing.launch();
			flyingThing.land();
			System.out.println();
		}
	}

}
