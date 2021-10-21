package nuisance;

/**
 * Represents a friend, which is a type of person
 * 
 * @author Lou LeBohec
 */
public class Friend extends Person{
	Hobby hobby;
	
	public Friend(String myName, int myAge, Hobby hobby) {
		super(myName, myAge);
		this.hobby=hobby;
	}
	
	/**
	 * Makes the friend chill
	 * @return confirmation that the friend is chilling
	 */
	public String chill() {
		return name+" is chilling";
	}
	
	/**
	 * Returns the friends being played with and the activity
	 * @param friends
	 * @return
	 */
	public String play(Friend[] friends) {
		if(friends.length<=0) return "playing "+hobby;
		else if(friends.length==1) return "playing "+hobby+" with "+friends[0].getName()+".";
		else if(friends.length==2) return "playing "+hobby+" with "+friends[0].getName()+" and "+friends[1].getName()+".";
		else {
			String result = "playing "+hobby+" with ";
			for(int i=0;i<friends.length-1;i++) {
				result+=friends[i].getName()+", ";
			}
			result+="and "+friends[friends.length-1].getName()+".";
			return result;
		}
	}

	@Override
	public String toString() {
		return this.name+"("+this.age+") "+this.hobby;
	}
	
	/**
	 * @return the hobby
	 */
	public Hobby getHobby() {
		return hobby;
	}

	@Override
	public boolean equals(Object p) {
		if(super.equals(p)&&((Friend)p).getHobby()==this.getHobby()) return true;
		else return false;
	}
	

}
