package nuisance;

/**
 * Represents a Pesky Mosquito, a particularly annoying type of Mosquito
 * 
 * @author Lou LeBohec
 *
 */
public class PeskyMosquito extends Mosquito {

	public PeskyMosquito(String newSpecies) {
		super(newSpecies);
	}
	
	/**
	 * Represents the mosquito biting someone
	 * @return confirmation that someone has been bitten
	 */
	public String bite() {
		return "sucking blood";
	}

}
