package phones;

/**
 * Describes the height, width, and depth of a phone
 * 
 * @author Lou LeBohec
 */
public class Dimension {
	double height;
	double width;
	double depth;
	
	public Dimension(double newHeight,double newWidth,double newDepth) {
		if(newHeight>0&&newWidth>0&&newDepth>0) {
			height = newHeight;
			width = newWidth;
			depth = newDepth;
		}
		else throw new IllegalArgumentException("The height, width, and depth of a dimension needs to be positive.");
	}

	@Override
	public String toString() {
		
		return String.format("(%.1f x %.1f x %.1f)",height, width, depth);
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @return the depth
	 */
	public double getDepth() {
		return depth;
	}
	
	
}

