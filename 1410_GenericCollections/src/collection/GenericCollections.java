package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class GenericCollections {
	/**
	 * Returns a list describing the elements of hte input list
	 * @param list
	 * @return the descriptions
	 */
	public static List<String> lettersAndNumbers(List<Character> list) {
		if (list != null) {
			ArrayList<String> result = new ArrayList<String>();
			for (Character chars : list) {
				int ascii = Character.getNumericValue(chars);
				if (Character.isLowerCase(chars)) {
					result.add("L(" + chars + ")");
				} else if (Character.isUpperCase(chars)) {
					result.add("U(" + Character.toLowerCase(chars) + ")");
				} else if (ascii <= 9 && ascii >= 0) {
					result.add("N(" + chars + ")");
				}
			}
			return result;
		} else
			return null;
	}

	/**
	 * Modifies a list of integers
	 * @param list
	 * @return the number elements
	 */
	public static int modify(List<Integer> list) {
		if (list == null) {
			throw new NullPointerException("List cannot be empty");
		} else {
			list.removeIf(n -> (n % 3 == 0));
			for (int i = 1; i < 6; i++) {
				for (int j = 4; j < 7; j++) {
					list.add(j * i);
				}
			}

			Collections.sort(list);

			HashSet<Integer> set = new HashSet<Integer>(list);

			return set.size();
		}

	}

	/**
	 * Removes every nth element
	 * @param list
	 * @param n
	 */
	public static void removeEveryNthElement(List<?> list, int n) {
		if (n < 1) {
			throw new IllegalArgumentException("n must be 1 or higher");
		} else if (list == null) {
			throw new NullPointerException("list cannot be null");
		} else if(n==list.size()) {
			list.remove(n-1);
		}
		else if (n < list.size()) {
			int removals = 0;
			int size = list.size();
			for (int i = n-1; i < size; i += n) {
				list.remove(i-removals);
				removals++;
			}
		}

	}
}
