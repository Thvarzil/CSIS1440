package unitTesting;

import java.math.BigDecimal;

/**
 * @author anarion
 *
 */
public class TreasureChest {
	private int gold;
	private static final BigDecimal GOLD_PER_COIN = new BigDecimal(0.9675);
	private static BigDecimal goldPrice = new BigDecimal(20.6718);
	
	public TreasureChest(int goldCoins) {
		if(goldCoins<0) {
			throw new IllegalArgumentException("You can't have less than zero coins");
		}
		this.gold = goldCoins;
	}
	
	/**
	 * @return the gold
	 */
	public int getGold() {
		return gold;
	}
	/**
	 * @return the goldPrice
	 */
	public static BigDecimal getGoldPrice() {
		return goldPrice;
	}
	
	/**
	 * @param goldPrice the goldPrice to set
	 */
	public static void setGoldPrice(BigDecimal goldPrice) {
		if(goldPrice.compareTo(BigDecimal.ZERO)<0) {
			throw new IllegalArgumentException("Price can't be negative");
		}
		TreasureChest.goldPrice = goldPrice;
	}
	
	public void addGold(int numberOfCoins) {
		if(numberOfCoins<0) {
			throw new IllegalArgumentException("Seems like you meant to removeCoins()");
		}
		
		this.gold+=numberOfCoins;
	}
	
	public int removeGold(int numberOfCoins) {
		if(numberOfCoins<0 || numberOfCoins>this.gold) {
			throw new IllegalArgumentException("Seems like you meant to addCoins()");
		}
		this.gold-=numberOfCoins;
		
		return this.gold;
	}
	
	public BigDecimal valueInDollars() {
		
		return goldPrice.multiply(BigDecimal.valueOf(this.gold).multiply(GOLD_PER_COIN));
	}
	@Override
	public String toString() {
		return "TreasureChest [gold=" + gold + "]";
	}
	
	
}
