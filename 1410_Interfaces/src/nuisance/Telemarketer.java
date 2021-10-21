package nuisance;

/**
 * Represents a telemarketer, an annoying type of person
 * 
 * @author Lou LeBohec
 */
public class Telemarketer extends Person implements Nuisance {

	public Telemarketer(String myName, int myAge) {
		super(myName, myAge);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String annoy() {
		return this.name+" annoys by giving a sales pitch";
	}
	
	/**
	 * Makes the telemarketer give a sales pitch
	 * @return
	 */
	public String giveSalesPitch() {
		return this.name+" pressures others to buy stuff";
	}
}
