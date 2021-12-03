package collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Tests the functions of the GenericCollections class
 * @author Lou LeBohec
 *
 */
public class GenericCollectionsTest {
	public static ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	@BeforeEach
	void initTestList() {
		testList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	}
	@Test
	void lettersAndNumbers_nullInput_returnNull() {
		assertNull(GenericCollections.lettersAndNumbers(null));
	}
	
	@Test
	void lettersAndNumbers_emptyString_returnEmptyString() {
		assertEquals(new ArrayList<String>(),(GenericCollections.lettersAndNumbers(new ArrayList<Character>())));
	}
	
	@Test
	void lettersAndNumbers_onlySpecChar_returnEmptyString() {
		assertEquals(new ArrayList<String>(),(GenericCollections.lettersAndNumbers(new ArrayList<Character>(Arrays.asList('.','@','$','%')))));
	}
	
	@Test
	void lettersAndNumbers_upperAndLower() {
		assertEquals(new ArrayList<String>(Arrays.asList("L(l)","U(f)","L(e)","U(y)")), GenericCollections.lettersAndNumbers(Arrays.asList('l','F','e','Y')));
	}
	
	@Test
	void lettersAndNumbers_numbers() {
		assertEquals(new ArrayList<String>(Arrays.asList("N(1)","N(2)","N(3)","N(4)")), GenericCollections.lettersAndNumbers(Arrays.asList('1','2','3','4')));
	}
	
	@Test
	void lettersAndNumbers_lettersAndNumbers() {
		assertEquals(new ArrayList<String>(Arrays.asList("N(1)","L(f)","N(2)","U(y)")), GenericCollections.lettersAndNumbers(Arrays.asList('1','f','2','Y')));
	}
	
	@Test
	void lettersAndNumbers_lettersAndSpecChar() {
		assertEquals(new ArrayList<String>(Arrays.asList("U(f)","N(3)","U(y)")), GenericCollections.lettersAndNumbers(Arrays.asList('%','F','3','Y','.')));
	}
	
	@Test
	void lettersAndNumbers_allCombined() {
		assertEquals(new ArrayList<String>(Arrays.asList("L(l)","U(f)","L(e)","N(5)","U(y)")), GenericCollections.lettersAndNumbers(Arrays.asList('l','F','%','e','5','Y')));
	}
	//Test modify()
	@Test
	void modify_nullList() {
		assertThrows(NullPointerException.class,()->{GenericCollections.modify(null);});
	}
	
	@Test
	void modify_emptyList() {
		assertEquals(13,GenericCollections.modify(new ArrayList<Integer>()));
	}
	
	@Test
	void modify_allThrees() {
		assertEquals(13, GenericCollections.modify(new ArrayList<Integer>(Arrays.asList(3,6,9))));
	}
	
	@Test
	void modify_allThreesOverlapMultiples() {
		assertEquals(13, GenericCollections.modify(new ArrayList<Integer>(Arrays.asList(3,6,9,12,15))));
	}
	
	@Test
	void modify_notAllThreesOverlapMultiples() {
		assertEquals(14, GenericCollections.modify(new ArrayList<Integer>(Arrays.asList(4,4,16,28,72))));
	}
	
	@Test
	void modify_notAllThrees() {
		assertEquals(15, GenericCollections.modify(new ArrayList<Integer>(Arrays.asList(28,72,107))));
	}
	
	@Test
	void modify_negativeInput() {
		assertEquals(16, GenericCollections.modify(new ArrayList<Integer>(Arrays.asList(-22,-53,-91))));
	}
	
	@Test
	void modify_negativeThrees() {
		assertEquals(15, GenericCollections.modify(new ArrayList<Integer>(Arrays.asList(-14,-15,-29,72))));
	}
	//test removeEveryNthElement
	@Test
	void removeEveryNthElement_nullList() {
		assertThrows(NullPointerException.class, ()->{GenericCollections.removeEveryNthElement(null,5);});
	}
	@Test
	void removeEveryNthElement_nIsZero() {
		assertThrows(IllegalArgumentException.class, ()->{GenericCollections.removeEveryNthElement(testList,0);});
	}
	@Test
	void removeEveryNthElement_nIsOne() {
		GenericCollections.removeEveryNthElement(testList, 1);
		assertEquals(0, testList.size());
	}
	@Test
	void removeEveryNthElement_nIsLargerThanListSize() {
		
		GenericCollections.removeEveryNthElement(testList, 55);
		assertEquals(9, testList.size());
	}
	@Test
	void removeEveryNthElement_nIsSmallerThanListSize() {
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(1,2,4,5,7,8));
		GenericCollections.removeEveryNthElement(testList, 3);
		assertEquals(result, testList);
	}
	@Test
	void removeEveryNthElement_nIsNegative() {
		assertThrows(IllegalArgumentException.class, ()->{GenericCollections.removeEveryNthElement(testList,-10);});
	}
	@Test
	void removeEveryNthElement_nIsEqualToListSize() {
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		GenericCollections.removeEveryNthElement(testList, 9);
		assertEquals(result,testList);
	}
	@Test
	void removeEveryNthElement_OtherReasonableN() {
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(1,2,3,5,6,7,9));
		GenericCollections.removeEveryNthElement(testList, 4);
		assertEquals(result, testList);
	}
	
	
}
