package labCollection;

import java.awt.Color;

/**
 * Represents a couch
 * @author Lou LeBohec
 *
 */
public class Couch {
	Color color;
	Materials material;
	/**
	 * @param color
	 * @param material
	 */
	public Couch(Color color, Materials material) {
		this.color = color;
		this.material = material;
	}
	
	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * @return the material
	 */
	public Materials getMaterial() {
		return material;
	}
	@Override
	public String toString() {
		return "Couch: #" + Integer.toHexString(color.getRGB()).substring(2) + " " + material.toString().toLowerCase();
	}
	
	
	
		
}
