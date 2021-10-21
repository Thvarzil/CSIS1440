package codingBat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CodingBatTest {

	@Test
	void wordEnds_WordInMiddle() {
		assertEquals("c13i", CodingBat.wordEnds("abcXY123XYijk", "XY"));
	}
	
	@Test
	void wordEnds_WordOnEnds() {
		assertEquals("13",CodingBat.wordEnds("XY123XY", "XY"));
	}
	
	@Test
	void wordEnds_WordOnEndsShareCharacter() {
		assertEquals("11",CodingBat.wordEnds("XY1XY", "XY"));
	}
	
	@Test
	void wordEnds_OnlyWord() {
		assertEquals("XY",CodingBat.wordEnds("XYXY", "XY"));
	}
	
	@Test
	void wordEnds_WordAlone() {
		assertEquals("",CodingBat.wordEnds("XY", "XY"));
	}
	
	@Test
	void wordEnds_WordNotIncluded() {
		assertEquals("",CodingBat.wordEnds("Hi", "XY"));
	}
	@Test
	void wordEnds_BlankString() {
		assertEquals("",CodingBat.wordEnds("", "XY"));
	}
	
	@Test
	void wordEnds_ShortWord_ShareCharacter() {
		assertEquals("cxziij",CodingBat.wordEnds("abc1xyz1i1j", "1"));
	}
	
	@Test
	void wordEnds_ShortWord() {
		assertEquals("cxz",CodingBat.wordEnds("abc1xyz1", "1"));
	}
	
	@Test
	void wordEnds_ShortWord_DoubledOnEnd() {
		assertEquals("cxz11",CodingBat.wordEnds("abc1xyz11", "1"));
	}
	
	@Test
	void wordEnds_WordOnEndsAgain() {
		assertEquals("11",CodingBat.wordEnds("abc1xyz1abc", "abc"));
	}
	
	@Test
	void wordEnds_ShortWord_MirroredString() {
		assertEquals("acac",CodingBat.wordEnds("abc1xyz1abc", "b"));
	}
	
	@Test
	void wordEnds_WordRepeated_SharedCharacter() {
		assertEquals("1111",CodingBat.wordEnds("abc1abc1abc", "abc"));
	}

}
