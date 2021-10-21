package labPolymorphism;

/**
 * @author CSIS
 *
 */

public class CircusDog extends Dog
{
    /**
     * Constructs a new Circus Dog
     * @param b the breed of the Circus Dog
     */
    public CircusDog(String b)
    {
        super(b);
    }

    /**
     *Overrides the default move function for class Dog
     */
    @Override
    public void move()
    {
        System.out.println("tightrope walking");
    }
}
