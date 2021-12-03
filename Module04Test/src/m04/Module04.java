package m04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Contains methods for the module 4 exam for CSIS 1410 at SLCC
 * 
 * @author Lou LeBohec
 *
 */
public class Module04 {
	/**
	 * Returns a formated list of numbers contained in the input list, excluding negatives or numbers over 50 
	 * @param numberList the input list
	 * @return the formatted List<String>
	 */
	public static List<String> toStringList(List<Integer> numberList){
		ArrayList<String> result = new ArrayList<>();
		for(Integer number : numberList) {
			if(number<10&&number>0) {
				
				result.add(Integer.toBinaryString(number));
			}
			else if(number>=10&&number<=50) {
				result.add("("+number+")");
			}
		}
		Collections.reverse(result);
		
		return result;
	}
	
	/**
	 * Transforms a List<Double> by removing negatives and duplicates, dividing by two, and sorting the list
	 * @param numberList
	 */
	public static void transform(List<Double> numberList) {
		numberList.removeIf(d -> (d<0));
		HashSet<Double> noDupes = new HashSet<>();
		for(Double number : numberList) {
			noDupes.add(number/2);
		}
		
		numberList.clear();
		
		numberList.addAll(noDupes);
		
		Collections.sort(numberList);
		
	}
}
