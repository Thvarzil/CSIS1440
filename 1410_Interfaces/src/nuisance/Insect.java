package nuisance;

/**
 * Represents an insect
 * 
 * @author Lou LeBohec
 *
 */
public class Insect {
	String species;
	
	public Insect(String newSpecies) {
		species = newSpecies;
	}

	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+": "+this.getSpecies();
	}
	
	
}
