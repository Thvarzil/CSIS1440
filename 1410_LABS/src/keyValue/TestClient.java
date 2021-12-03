package keyValue;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * Tests the KeyValuePair class
 * @author Lou Lebohec
 *
 */
public class TestClient {

	public static void main(String[] args) {
		System.out.println("Part 1:\n_________________");
		KeyValuePair<String, Integer> city1 = new KeyValuePair<>("SLC", 189899);
		KeyValuePair<String, Integer> city2 = new KeyValuePair<>("NY", 8244910);
		System.out.println(city1);
		System.out.println(city2);
		System.out.println(city1.equals(city2));
		KeyValuePair<String,Integer> city3 = city2;
		System.out.println(city2.equals(city3));
		System.out.println();
		System.out.println("Part 2:\n_________________");
		KeyValuePair<String, Integer> city4 = new KeyValuePair<>("LA", 38199702);
		KeyValuePair<String, Integer> city5 = new KeyValuePair<>("SF", 812826);
		ArrayList<KeyValuePair<String,Integer>> cities = new ArrayList<KeyValuePair<String,Integer>>(Arrays.asList(city1, city2, city3, city4, city5));
		System.out.println("Original List:");
		for(KeyValuePair<String, Integer> city : cities) {
			System.out.println(city);
		}
		
		cities.sort(null);
		System.out.println();
		System.out.println("Sorted List:");
		for(KeyValuePair<String, Integer> city : cities) {
			System.out.println(city);
		}
		System.out.println();
		System.out.println("Part 3:\n_________________");
		System.out.println("Cities with margin 5");
		printWithMargin(cities, 5);
		HashSet<KeyValuePair<Integer, String>> countries = new HashSet<>(
				Arrays.asList(new KeyValuePair<Integer, String>(30, "Greece"), 
						new KeyValuePair<Integer, String>(33, "France"), 
						new KeyValuePair<Integer, String>(43, "Austria")));
		System.out.println("Countries with margin 3");
		printWithMargin(countries, 3);
	}
	
	/**
	 * Prints a collection with a specified margin
	 * @param <T>
	 * @param collection
	 * @param indentation
	 */
	public static <T> void printWithMargin(Collection<T> collection, int indentation) {
		for(T item : collection) {
			for(int i = 0; i<indentation;i++) {
				System.out.print(" ");
			}
			System.out.print(item+"\n");
		}
	}

}
