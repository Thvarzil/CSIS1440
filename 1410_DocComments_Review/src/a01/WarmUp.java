package a01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Initial team exercise for CSIS 1410, reviewing lessons thus far
 * 
 * @author anarion and Zeke
 *
 */
public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(3,4);
		Point p2 = new Point(3,6);
		Point p3 = new Point(1,1);
		Point p4 = new Point(-3,-2);
		Point p5 = new Point(1,2);
		Point p6 = new Point(-3,4);
		Point p7 = new Point(5,-6);
		Point p8 = new Point(7,8);
		String[] empty= new String[0];
		String[] one= new String[] {"One"};
		String[] several = new String[] {"One", "Two", "Three"};
		Point[] points = new Point[]{p5,p6,p7,p8};
		ArrayList<String> syllables = new ArrayList<String>(List.of("beau","ti","ful"));
		ArrayList<Point> pointList = new ArrayList<Point>(List.of(p1, p2, p3, p4, p5, p6, p7, p8));
		
		
		System.out.println("The distance between p1 and p2 is "+distance(p1,p2));
		System.out.println("The distance between p3 and p4 is "+distance(p3,p4));
		System.out.printf("the greatest distance between p1,p2,p3 is %.2f%n", greatestDistanceFromOrigin(p1,p2,p3));
		System.out.printf("The area of p1 is %.2f%n", area(p1));
		System.out.printf("The area of p2 is %.2f%n", area(p2));
		for(int n:firstEightMultiples(3)) {
			System.out.printf("%d, ", n);
		}
		System.out.println();
		firstAndLastToXXX(empty);
		firstAndLastToXXX(one);
		firstAndLastToXXX(several);
		System.out.println(Arrays.toString(empty));
		System.out.println(Arrays.toString(one));
		System.out.println(Arrays.toString(several));
		System.out.println(content(points));
		System.out.println(hyphenate(syllables));
		System.out.println(moreOfTheSame('x').toString());
		System.out.println(take(pointList, 4).toString());
		
		
	}
	
	/**
	 * Returns the distance between two provided Cartesian coordinates
	 * 
	 * @param p1 the first set of coordinates
	 * @param p2 the second set of coordinates
	 * @return the distance as a double
	 */
	public static double distance(Point p1, Point p2) {
		return p1.distance(p2);
	}
	
	
	/**
	 * Returns the greatest distance from the origin of three Cartesian coordinates
	 * 
	 * @param p1
	 * @param p2
	 * @param p3
	 * @return the distance as a double
	 */
	public static double greatestDistanceFromOrigin(Point p1, Point p2, Point p3) {
		double[] distances = new double[] {p1.distance(),p2.distance(),p3.distance()};
		double greatestDistance = 0;
		
		for(double distance:distances) {
			if(distance>greatestDistance) {
				greatestDistance = distance;
			}
		}
		
		return greatestDistance;
	}
	
	/**
	 * Returns the area of a box with a corner set to 0,0 and the opposite corner set to a given point
	 * @param p the given cartesian coordinates
	 * @return the area as a double
	 */
	public static double area(Point p) {
		return (p.getX()*p.getY());
	}
	
	public static int[] firstEightMultiples(int n) {
		int[] multiples = new int[8];
		
		for(int i=0;i<multiples.length;i++) {
			multiples[i]=n*(i+1);
		}
		
		return multiples;
	}
	
	/**
	 * Changes the first and last element of an array of strings to XXX
	 * @param strings the array of strings
	 */
	public static void firstAndLastToXXX(String[] strings) {
		if(strings.length>0) {
			strings[0]="XXX";
			strings[strings.length-1]="XXX";
		}
	}
	
	/**
	 * Returns the contents of an array of points as a formatted string
	 * @param points
	 * @return
	 */
	public static String content(Point[] points) {
		String s = "";
		
		for(Point p:points) {
			s=s+p.toString()+".";
		}
		if(s.length()>0) {
			s=s.substring(0,s.length()-1);
		}
		return s;
	}
	
	/**
	 * Returns the contents of an array of syllables as a single hyphenated string
	 * 
	 * @param strings the array of syllables
	 * @return the hyphenated string
	 */
	public static String hyphenate(ArrayList<String> strings) {
		String t = "";
		
		for(String s:strings) {
			t=t+s+"-";
		}
		if(t.length()>0) {
			t=t.substring(0,t.length()-1);
		}
		return t;
	}
	
	/**
	 * Returns an array of strings containing an increasing number of the provided character 
	 * @param c the character to be multiplied
	 * @return the array of strings
	 */
	public static ArrayList<String> moreOfTheSame(char c){
		String chars = "";
		ArrayList<String> result = new ArrayList<String>();
		
		for(int i=0;i<5;i++) {
			chars=chars+String.valueOf(c);
			result.add(chars);
		}
		
		return result;
	}
	
	/**
	 * Returns a subset of the provided list of points, up to the provided number of points
	 * @param list the list of points
	 * @param n the number of points to be returned
	 * @return the ArrayList of points selected
	 */
	public static ArrayList<Point> take(ArrayList<Point> list, int n){
		if (n < 0 || n > list.size())
			   throw new IllegalArgumentException("The list doesn't have " + n + " elements.");
		
		ArrayList<Point> result = new ArrayList<Point>();
		for(int i=0;i<n;i++) {
			result.add(list.get(i));
		}
		
		return result;
	}

}
