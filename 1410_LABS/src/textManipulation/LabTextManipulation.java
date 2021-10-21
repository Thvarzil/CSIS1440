package textManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LabTextManipulation {
	/**
	 * Collects a list of National Parks from the user, formats the entries, and
	 * prints them
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// Initializes global variables
		ArrayList<String> parks = new ArrayList<String>();
		BufferedReader parkReader = new BufferedReader(new InputStreamReader(System.in));
		boolean done = false;

		while (!done) {
			System.out.print("Please enter your favorite national park, or enter done when done.");

			String park = parkReader.readLine();
			/*
			 * Note that it seems strictly optimal, from a code length and data consistency
			 * standpoint, to add a line of code here that sets the user's string to all
			 * lower case, and trims off any leading or trailing empty space for
			 * cleanliness, but the assignment specified that all string editing should be
			 * done in method toFancyString.
			 * 
			 * The line that could have been used is park=park.toLowerCase().trim();
			 */

			// check for special characters, because users are silly
			if (!park.matches("^[a-zA-Z' ]+$")) {
				System.out.println(
						"This application doesn't support numbers or special characters except apostrophes. Please try again");
			}
			// check if user input matches 'done', case insensitive, else adds entry to
			// parks
			else if (park.trim().matches("(?i)done")) {
				done = true;
			} else {
				parks.add(park);
			}

		}

		System.out.println(toFancyString(parks));

	}

	/**
	 * Formats an ArrayList of Strings to capitalize the first letter of each word,
	 * and separate each entry with a pipe, finally returning the list as a single
	 * String
	 * 
	 * @param list the list of Strings to be formatted
	 * @return
	 */
	public static String toFancyString(ArrayList<String> list) {
		StringBuilder fancyString = new StringBuilder();
		// adds all list items forced to lower case to fancyString, separated by pipes
		for (String item : list) {
			fancyString.append(" | ");
			fancyString.append(item.toLowerCase().trim());
		}

		if (fancyString.length() != 0) {

			// deletes the first set of pipes
			fancyString.delete(0, 3);
			/*
			 * Capitalizes the first letter of each word. Loop is limited to length-1
			 * because the last letter does not need to be checked for a space, as there
			 * isn't a letter after it.
			 * 
			 * Capitalizes the first character separately, as it will not be caught by the
			 * loop
			 */
			fancyString.setCharAt(0, Character.toUpperCase(fancyString.charAt(0)));
			for (int i = 0; i < fancyString.length() - 1; i++) {
				// forces character to upper case if it is not a pipe and it is preceded by a
				// space
				if (fancyString.charAt(i) == ' ' && !(fancyString.charAt(i + 1) == '|')) {

					fancyString.setCharAt(i + 1, Character.toUpperCase(fancyString.charAt(i + 1)));
				}
			}
		}
		
		// returns fancyString as a String, to be printed in main
		return fancyString.toString();
	}

}
