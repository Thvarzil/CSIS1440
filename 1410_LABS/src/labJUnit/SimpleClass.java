package labJUnit;

/**
 * Simple class to demonstrate automated testing with JUnit Jupiter (JUnit 5).
 * 
 * @author anarion
 *
 */
public class SimpleClass {

   /**    
   * Determines whether a given year is a leap year.    
   * <p>    
   * @param y year     
   * @return true if <code>year</code> is a leap year and false otherwise.    
   * @throws IllegalArgumentException if <code>year</code> is not positive.   
   */
   public static boolean isLeapYear(int year) { 
	  //Testing for invalid input
	  if(year<=0) {
		  throw new IllegalArgumentException("The year must be greater than zero");
	  }
	  
	  //Leap year determination logic
      if(year%4==0) {
    	  if(year%100!=0) {
    		  return true;
    	  }
    	  else {
    		  if(year%400==0) {
    			  return true;
    		  }
    		  else return false;
    	  }
      }
      else return false;
      
   }
}