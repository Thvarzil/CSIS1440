package labInterface;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PlaneTest {
	
	private static ByteArrayOutputStream message;
	private static PrintStream consoleOutput;
	private Plane plane = new Plane(2, "Citation Longitude");

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		consoleOutput = System.out;
		
		message = new ByteArrayOutputStream();
		PrintStream newOutput = new PrintStream(message);
		System.setOut(newOutput);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.setOut(consoleOutput);
	}

	@Test
	void toString_validateOutput() {
		assertEquals("Citation Longitude with 2 engines", plane.toString());
	}
	
	@Test
	void launch_validateOutput() {
		plane.launch();
		
		String expected = "Rolling until take-off "+System.lineSeparator();
		String actual = message.toString();
		
		assertEquals(actual, expected);
		
		message.reset();
	}
	
	@Test
	void land_ValidateOutput() {
		plane.land();
		
		String expected = "Rolling to a stop"+System.lineSeparator();
		String actual = message.toString();
		
		assertEquals(actual, expected);
		
		message.reset();
	}

}
