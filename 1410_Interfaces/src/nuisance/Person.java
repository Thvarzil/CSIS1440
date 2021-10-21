package nuisance;

/**
 * Represents a person
 * 
 * @author Lou LeBohec
 *
 */
public class Person {
	String name;
	int age;
	
	public Person(String myName, int myAge) {
		if(myAge>150||myAge<1) throw new IllegalArgumentException("Age must be between 1 and 150 inclusive.");
		else {
			name=myName;
			age=myAge;
		}
	}

	/** 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return this.getName()+"("+this.getAge()+")";
	}
	
	@Override
    public boolean equals(Object p) {
        if(p == null) return false;
        if(!(p instanceof Person)) return false;
        if(((Person)p).getName()==this.name&&this.age==((Person)p).getAge()) return true;
        else return false;
    }
}
