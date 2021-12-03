package wrapperClass;

import java.util.Arrays;
import java.util.Random;

public class DemoWrapperClass {
	private static Random rand = new Random();

	public static String minMax() {
		// returns all six number types and their ranges
		String result = new String();

		result += String.format("%-7s: [%d , %d]\n", "Byte", Byte.MIN_VALUE, Byte.MAX_VALUE);
		result += String.format("%-7s: [%d , %d]\n", "Short", Short.MIN_VALUE, Short.MAX_VALUE);
		result += String.format("%-7s: [%d , %d]\n", "Integer", Integer.MIN_VALUE, Integer.MAX_VALUE);
		result += String.format("%-7s: [%d , %d]\n", "Long", Long.MIN_VALUE, Long.MAX_VALUE);
		result += String.format("%-7s: [%g , %g]\n", "Float", Float.MIN_VALUE, Float.MAX_VALUE);
		result += String.format("%-7s: [%g , %g]", "Double", Double.MIN_VALUE, Double.MAX_VALUE);

		return result;
	}

	public static String numberRepresentations(int n) {
		// returns the base 10,16,8, and 2 versions of the provided number
		String hexadecimal = Integer.toString(n, 16);
		String octal = Integer.toString(n, 8);
		String binary = Integer.toString(n, 2);
		return String.format("%-8s %-8s %-8s %s", n, hexadecimal, octal, binary);
	}

	public static String charProperties(char c) {
		// returns the type of the character provided
		int ascii = Integer.valueOf(c);

		if (ascii == 32) {
			return String.format("%c white space", c);
		} else if (ascii >= 65 && ascii <= 90) {
			return String.format("%c uppercase letter", c);
		} else if (ascii >= 97 && ascii <= 122) {
			return String.format("%c lowercase letter", c);
		} else if(ascii>=48&&ascii<=57) {
			return String.format("%c number", c);
		}
		else
			return String.format("%c", c);
	}

	public static double parseSum(String[] numbers) {
		// adds the double value of the contents of a string[]
		double sum = 0.0;
		if (numbers!=null) {
			for (String number : numbers) {
				sum += Double.valueOf(number);
			}
		}

		return sum;
	}

	public static int getRandomThreeDigitNumber() {
		// provides a random number between 100 and 999

		return rand.nextInt(900) + 100;
	}

	public static char getRandomLetter() {
		// returns a random alphabetical character
		if (rand.nextBoolean()) {
			return (char) (rand.nextInt(26) + 97);
		} else {
			return (char) (rand.nextInt(26) + 65);
		}
	}

	/**
	 * Demonstrates the functionality provided in class DemoWrapperClass.
	 *
	 */
	public static void main(String[] args) {
		

		Random rand = new Random();

// Method minMax:
		System.out.println(minMax());
		System.out.println();

// Method numberRepresentations:
		int[] numbers = { 0, 9, 17, getRandomThreeDigitNumber(), 9876, 12345 };

		System.out.printf("%-7s %-7s %-6s %s%n", "Base 10", "Base 16", "Base 8", "Base 2");
		System.out.printf("%-7s %-7s %-6s %s%n", "-------", "-------", "------", "------");
		for (int n : numbers) {
			System.out.println(numberRepresentations(n));
		}
		System.out.println();

// Method charProperties:
		char[] characters = { '8', ' ', '#', 'a', 'M', getRandomLetter() };

		for (char c : characters) {
			System.out.println(charProperties(c));
		}
		System.out.println();

// Method parse:
		String[] numberArray = { "1.1", "2.5", "3.14", "40.04", "5.325", "63.5" };

		String[] wholeNumbers = new String[10];
		for (int i = 0; i < wholeNumbers.length; i++) {
			wholeNumbers[i] = "" + (rand.nextInt(90) + 10);
		}

		System.out.println(Arrays.deepToString(numberArray) + " .. sum = " + parseSum(numberArray));
	}
}