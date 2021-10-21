package nuisance;

import java.util.List;

/**
 * Represents a butterfly, which is a type of insect
 * 
 * @author Lou LeBohec
 *
 */
public class Butterfly extends Insect{
	final List<String> colors;
	
	public Butterfly(String newSpecies, List<String> newColors) {
		super(newSpecies);
		colors = newColors;		
	}
	
	/**
	 * Copy Constructor
	 * 
	 * @param butterfly to be copied
	 */
	public Butterfly(Butterfly butterfly) {
		this(butterfly.getSpecies(), butterfly.getColors());
	}

	/**
	 * @return the colors
	 */
	public List<String> getColors() {
		return colors;
	}

	@Override
	public String toString() {
		return species+" " + colors + "";
	}
	
	
	
}
