package recursion;

public class Recursion {

	/**
	 * Calculates the sum of the digits in a given number
	 * 
	 * @param n the number to be analyzed
	 * @return the sum of the digits
	 */
	public static int sumOfDigits(int n) {
		if(n<0) {
			n*=-1;
		}
		if(n>10) {
			char[] numbers = Integer.toString(n).toCharArray();
			String newN = new String();
			for(int i=0;i<numbers.length-1;i++) {
				newN+=numbers[i];
			}
			return Integer.decode(Character.toString(numbers[numbers.length-1]))+sumOfDigits(Integer.decode(newN));
		}
		else return n;
	}

	/**
	 * Returns the input String moved to upper case, with a space between each character
	 * 
	 * @param str the String to be modified
	 * @return the modified String
	 */
	public static String toUpper(String str) {
		if(str.length()<=1) {
			return str.toUpperCase();
		}
		else {
			return Character.toUpperCase(str.charAt(0))+" "+toUpper(str.substring(1));
		}
	}

	/**
	 * Counts the number of instances of :) in the provided array of chars, starting at the provided index
	 * 
	 * @param chars the characters to be analyzed
	 * @param index the index to start with
	 * @return the number of smiles
	 */
	public static int countSmiles(char[] chars, int index) {
		
		
		if(chars.length>index+1) {
			if(chars[index]==':'&&chars[index+1]==')') {
				return 1+countSmiles(chars,index+1);
			}
			else {
				return countSmiles(chars,index+1);
			}
			
		}
		else {
			return 0;
		}
		
		
		
	}
	/**
	 * Calculates the harmonic of a given number
	 * 
	 * @param n the number
	 * @return the harmonic 
	 */
	public static double harmonic (int n) {
		   if (n == 0)
		      throw new IllegalArgumentException("The argument n can't be zero.");

		   if (n == 1)
		      return 1;
		   else if (n < 0)
		      return -1 * harmonic(-n);
		   else // n > 1
		      return 1.0/n + harmonic (n - 1);
		} 
	

}
