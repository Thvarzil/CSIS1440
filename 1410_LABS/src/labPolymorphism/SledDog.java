package labPolymorphism;

/**
 * @author CSIS
 *
 */
public class SledDog extends Dog
{
    /**
     * Constructs a new SledDog
     * @param b the breed of the SledDog
     */
    public SledDog(String b)
    {
        super(b);
    }

    /**
     * Makes the dog pull the sled
     */
    public void pullSled()
    {
        System.out.println("pulling the sled");
    }
}
