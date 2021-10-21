package labPolymorphism;

/**
 * Test app for the Dog class and subclasses
 * 
 * @author CSIS + Lou LeBohec
 *
 */
public class DogApp
{
    /**
     * Creates several Dogs and runs them through logic
     */
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Greyhound");
        System.out.println(myDog);
        actAsDog(myDog);

        SledDog mySledDog = new SledDog("Husky");
        System.out.println(myDog);
        actAsDog(mySledDog);

        CircusDog myCircusDog = new CircusDog("Terrier");
        System.out.println(myDog);
        actAsDog(myCircusDog);
        
        System.out.println("Using an Array");
        Dog[] dogs = new Dog[] {myDog,mySledDog,myCircusDog};
        for(Dog dog : dogs) {
        	System.out.println(dog);
        	if(dog instanceof SledDog) ((SledDog) dog).pullSled();
        	actAsDog(dog);
        }
    }

    /**
     * Standardizes info display for dogs. 
     * 
     * @param d the Dog to be displayed
     */
    private static void actAsDog(Dog d)
    {
    	//System.out.println(d.getClass().getSimpleName()+": "+d.getBreed());
        d.communicate();
        d.move();
        System.out.println();
    }
}
