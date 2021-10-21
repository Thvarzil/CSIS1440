package recursion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HarmonicTest {
	private final double DELTA = 0.000000001;
	@Test
	void harmonic_ZeroInput_ThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {Recursion.harmonic(0);});
	}
	
	@Test
	void harmonic_PositiveInput() {
		assertEquals(2.28333333333,Recursion.harmonic(5),DELTA);
	}
	
	@Test
	void harmonic_NegativeInput() {
		assertEquals(-2.28333333333,Recursion.harmonic(-5),DELTA);
	}
	
	@Test
	void harmonic_LargePositiveInput() {
		assertEquals(6.79282342999,Recursion.harmonic(500),DELTA);
	}
	
	@Test
	void harmonic_LargeNegativeInput() {
		assertEquals(-6.79282342999,Recursion.harmonic(-500),DELTA);
	}
	

}
