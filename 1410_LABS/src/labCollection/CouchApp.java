package labCollection;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Tests the Couch class
 * @author Lou LeBohec
 *
 */
public class CouchApp {
	
	public static void main(String[] args) {
		Color[] colors = new Color[] {Color.BLACK,Color.BLUE,Color.DARK_GRAY,Color.GRAY,Color.GREEN,Color.LIGHT_GRAY,Color.RED,Color.WHITE};
		ArrayList<Couch> couches = new ArrayList<Couch>();
		
		for(Color color : colors) {
			couches.add(new Couch(color, Materials.VINYL));
			couches.add(new Couch(color, Materials.LEATHER));
			couches.add(new Couch(color, Materials.FABRIC));
		}
		
		ArrayList<Couch> favorites = new ArrayList<Couch>();
		favorites.add(new Couch(Color.RED,Materials.VINYL));
		favorites.add(new Couch(Color.BLACK,Materials.LEATHER));
		favorites.add(new Couch(Color.WHITE,Materials.FABRIC));
		
		displayInformation(couches, favorites);

		System.out.println("Removing all vinyl couches, cause it ain't the year 1992");
		couches.removeIf(c -> (c.getMaterial()==Materials.VINYL));
		
		System.out.println("Couches: ");
		for(Couch couch : couches) {
			System.out.println(couch);
		}
		
		displayInformation(couches, favorites);
		
		System.out.println(String.format("\nThere are %d couches.", couches.size()));
		
		System.out.println("Adding favorites to couches...");
		
		for(Couch couch : favorites) {
			couches.add(couch);
		}
		
		displayInformation(couches, favorites);
		
		HashSet<Couch> uniqueFurniture = new HashSet(couches);
		
		displayInformation(uniqueFurniture, favorites);
		
		
	}
	/**
	 * Displays information about hte provided collections of couches
	 * @param couches
	 * @param favorites
	 */
	private static void displayInformation(Collection<Couch> couches, ArrayList<Couch> favorites) {
		for(Couch couch : couches) {
			System.out.println(couch);
		}
		
		System.out.println(String.format("Number of elements in couches: %d", couches.size()));
		boolean allIn = true;
		for (Couch couch : favorites) {
			if(!couches.contains(couch)) {
				allIn=false;
			}
		}
		
		if(allIn) {
			System.out.println("They're all there");
		}
		else System.out.println("They're not all there");
		
	}
}

