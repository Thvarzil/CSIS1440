package m01;

/**
 * Package built for the Module 1 Test for CSIS 1440 at SLCC
 * 
 * @author anarion
 *
 */
public class Module01 {

	public static void main(String[] args) {
		
		//Progress tests for transform1 and transform2
		System.out.println(transform1("a_b_c"));
		System.out.println(transform2(new String[] {"one", "two", "three"}));

	}

	/**
	 * Modifies the input String to set all letters uppercase, replace all instances
	 * of _ with @, and adds and ! at the end.
	 * 
	 * @param str the String to be transformed
	 * @return the transformed String
	 */
	public static String transform1(String str) {

		String result = str.toUpperCase();
		result = result.replaceAll("[_]", "@");

		return result + "!";
	}

	/**
	 * Modifies an array of strings, combining them separated by ., adds the length
	 * of the input to the beginning if it is less than 6, or an # if greater. If
	 * the input array is empty, returns an empty String
	 * 
	 * @param str the input array of Strings
	 * @return the completed String
	 */
	public static String transform2(String[] str) {
		String result = new String();
		if (str.length == 0)
			return "";
		else {
			if (str.length <= 5) {
				result += str.length;

			} else
				result += "#";

			for (String entry : str) {
				result += entry;
				result += ".";
			}

		}
		return result;
	}

}
