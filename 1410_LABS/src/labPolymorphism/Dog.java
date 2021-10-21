package labPolymorphism;

/**
 * Simulates a dog
 * 
 * @author CSIS + Lou LeBohec
 *
 */
public class Dog
{
    private final String breed;

    /**
     * Constructs a new dog
     * @param b the breed of the dog
     */
    public Dog(String b)
    {
        breed = b;
    }

    /**
     * Makes the dog speak
     */
    public void communicate()
    {
        System.out.println("bark bark");
    }

    /**
     * Makes the dog run
     */
    public void move()
    {
        System.out.println("run");
    }

    public String getBreed()
    {
        return breed;
    }
    
    /**
     *Returns a formatted String displaying the object's class and breed
     */
    @Override
    public String toString() {
    	return this.getClass().getSimpleName()+ ": "+this.getBreed();
    }
}
