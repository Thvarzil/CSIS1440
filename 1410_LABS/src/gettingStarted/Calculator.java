package gettingStarted;

/**
 * Simple calculator that can add and subtract whole numbers.
 * It can also calculate the absolute value.
 * 
 * @author CSIS Starter Code
 *
 */
public class Calculator {
	
	/**
	 * Adds the numbers <code>a</code> and <code>b</code>.
	 * 
	 * @param a first addend
	 * @param b second addend
	 * @return sum of a and b
	 */
	public static int add(int a, int b) {
		return a + b;
	}
	
	/**
	 * Subtracts the number <code>b</code> from the number <code>a</code>.
	 * 
	 * @param a minuend
	 * @param b subtrahend
	 * @return difference between a and b
	 */
	public static int subtract(int a, int b) {
		return a - b;
	}
	
	/**
	 * Determines the absolute value of the argument <code>n</code>.
	 * If <code>n</code> is negative, the negation of <code>n</code> is returned. 
	 * Otherwise, <code>n</code> is returned.
	 * 
	 * @param n number
	 * @return absolute value of n
	 */
	public static int abs(int n) {
		return (n < 0 ) ? -n : n; 
	}
	
	public static void main(String[] args) {
		System.out.println("Testing the add function. The first output should be 3, the second 75, and the last 4.");
		System.out.printf("Add function test restults: 1+2=%d, -3+78=%d, 8+(-4)=%d%n", add(1,2),add(-3,78),add(8,-4));
		
		System.out.println("Testing the substract function. The first output should be 58, the second -11, and the last -88.");
		System.out.printf("Add function test restults: 73-15=%d, 17-28=%d, -73-15=%d%n", subtract(73,15),subtract(17,28),subtract(-73,15));
		
		System.out.println("Testing the absolute value function. The first output should be 28, the second 0, and the last 17.");
		System.out.printf("Add function test restults: |-28|=%d, |0|=%d, |17|=%d%n", abs(-28),abs(0),abs(17));
		
	}
}
