package m01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * JUnit Tests for the two methods in the Module01 Class
 * 
 * @author anarion
 *
 */
class Module01Test {

	//transform1 tests
	@Test
	void transform1_SingleCharacterNotUScore() {
		assertEquals("@!",Module01.transform1("@"));
	}
	
	@Test
	void transform1_StringContainsUScore() {
		assertEquals("A@B@C!", Module01.transform1("a_b_c"));
	}
	
	@Test
	void transform1_ComplexString() {
		assertEquals("1A @ 2B @ 3C@4D@@5E!", Module01.transform1("1a @ 2B _ 3c@4D_@5e"));
	}
	
	@Test
	void transform1_BlankString() {
		assertEquals("!", Module01.transform1(""));
	}
	
	//transform2 tests
	@Test
	void transform2_OneItem() {
		assertEquals("1hi.",Module01.transform2(new String[] {"hi"}));
	}
	
	@Test
	void transform2_LessThan6Items() {
		assertEquals("3one.two.three.",Module01.transform2(new String[] {"one", "two", "three"}));
	}
	
	@Test
	void transform2_BlankString() {
		assertEquals("",Module01.transform2(new String[] {}));
	}
	
	@Test
	void transform2_BigArray() {
		assertEquals("#a.b.c.d.e.f.",Module01.transform2(new String[] {"a", "b", "c", "d", "e", "f"}));
	}

}
