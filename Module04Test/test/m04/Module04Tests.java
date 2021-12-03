package m04;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * Tests the methods of class Module04
 * @author Lou Lebohec
 *
 */
public class Module04Tests {
	@Test
	void toStringList_excludeOutOfRange_parseBinary(){
		assertEquals(new ArrayList<String>(Arrays.asList("1001", "111")),Module04.toStringList(new ArrayList<Integer>(Arrays.asList(7, -7, 500, 0, 9))));
	}
	
	@Test
	void toStringList_parseTwoDigitNumbers() {
		assertEquals(new ArrayList<String>(Arrays.asList("(10)", "(20)", "(30)", "(40)")), Module04.toStringList(new ArrayList<Integer>(Arrays.asList(40,30,20,10))));
	}
	
	@Test
	void transform_excludeNegatives() {
		ArrayList<Double> testInput = new ArrayList<>(Arrays.asList(-10.0,2.0,7.0,-85.0,10.0));
		Module04.transform(testInput);
		
		assertEquals(new ArrayList<Double>(Arrays.asList(1.0,3.5,5.0)), testInput);
	}
	
	@Test
	void transform_sortInput_eliminateDuplicates() {
		ArrayList<Double> testInput = new ArrayList<>(Arrays.asList(10.0,2.0,7.0,85.0,10.0));
		Module04.transform(testInput);
		
		assertEquals(new ArrayList<Double>(Arrays.asList(1.0,3.5,5.0,42.5)), testInput);
	}
}
