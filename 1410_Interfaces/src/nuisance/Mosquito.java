package nuisance;

/**
 * Represents a Mosquito, which is an Insect and also a Nuisance
 * 
 * @author Lou LeBohec
 *
 */
public class Mosquito extends Insect implements Nuisance {
	

	public Mosquito(String newSpecies) {
		super(newSpecies);
	}

	@Override
	public String annoy() {
		return "buzz buzz buzz";
	}
	
	/**
	 * Represents the Mosquito buzzing around
	 * @return
	 */
	public String buzz() {
		return this.getSpecies()+" buzzing around";
	}

}
