package unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreasureChestTest {
	private TreasureChest treasure;
	private TreasureChest empty;
	@BeforeEach
	void setUp() throws Exception {
		treasure = new TreasureChest(10);
		empty = new TreasureChest(0);
	}
	
	@Test
	void TreasureChest_PosNumOfCoins_AllCoinsPresent() {
		assertEquals(10,treasure.getGold());
	}
	
	@Test
	void TreasureChest_NoCoins_AllCoinsPresent() {
		assertEquals(0,empty.getGold());
	}
	
	@Test
	void TreasureChest_NegNumOfCoins_ThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {new TreasureChest(-2);});
	}

	@Test
	void setGoldPrice_NegValue_ThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {TreasureChest.setGoldPrice(BigDecimal.valueOf(-1));});
	}
	
	@Test
	void setGoldPrice_PosValue_Updates() {
		TreasureChest.setGoldPrice(BigDecimal.valueOf(23));
		assertEquals(BigDecimal.valueOf(23), TreasureChest.getGoldPrice());
	}

	@Test
	void addGold_NegNumOfCoins_ThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {treasure.addGold(-2);});
	}
	
	@Test
	void addGold_NoCoins_SameChest() {
		
		treasure.addGold(0);
		
		assertEquals(10,treasure.getGold());
	}
	
	@Test
	void addGold_PosNumOfCoins_CoinsAdded() {
		treasure.addGold(2);
		assertEquals(12,treasure.getGold());
	}
	
	@Test
	void removeGold_NegNumOfCoins_ThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {treasure.removeGold(-2);});
	}
	
	@Test
	void removeGold_NoCoins_SameChest() {
		
		assertEquals(10,treasure.removeGold(0));
	}
	
	@Test
	void removeGold_PosNumOfCoins_CoinsAdded() {
		
		assertEquals(8,treasure.removeGold(2));
	}

	

	@Test
	void ValueInDollars() {
		assertEquals(new BigDecimal(200),treasure.valueInDollars(),0.001);
	}

	@Test
	void toString_PositiveNumerOfCoins_DefaultToString() {
		assertEquals("TreasureChest [gold=10]",treasure.toString());
	}
	
	@Test
	void toString_NoCoins_DefaultToString() {
		assertEquals("TreasureChest [gold=0]",empty.toString());
	}

}
