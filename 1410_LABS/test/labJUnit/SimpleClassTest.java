package labJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleClassTest {
	
	@Test
	void isLeapYear_YearIsMultipleOf4ButNotOf100_True() {
		assertTrue(SimpleClass.isLeapYear(2024), "Years divisible by 4 but not 100 should be leap years");
	}
	
	@Test
	void isLeapYear_YearIsMultipleOf100ButNotOf400_False() {
		assertFalse(SimpleClass.isLeapYear(1900), "Years divisible by 100 but not 400 should not be leap years");
	}
	
	@Test
	void isLeapYear_YearIsMultipleOf400_True() {
		assertTrue(SimpleClass.isLeapYear(2000), "Years divisible by 400 should be leap years");
	}
	
	@Test
	void isLeapYear_YearIsNotMultipleOf4_False() {
		assertFalse(SimpleClass.isLeapYear(2021), "Years not divisible by 4 are not leap years");
	}
	
	@Test
	void isLeapYear_YearIsZero_ThrowsIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> {SimpleClass.isLeapYear(0);});
	}
	
	@Test
	void isLeapYear_YearIsNegative_ThrowsIllegalArgumentException() {
		//using the year of the Battle of Thermopylae for funsies
		assertThrows(IllegalArgumentException.class, () -> {SimpleClass.isLeapYear(-480);});
	}
	
	

}
