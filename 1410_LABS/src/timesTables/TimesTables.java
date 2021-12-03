package timesTables;

import java.io.*;

/**
 * Prints times tables into a file
 * @author Lou Lebohec
 *
 */
public class TimesTables {

	public static void main(String[] args) {
		
		File tables = new File("./src/timesTables/TimesTables.txt");
		try (PrintWriter file = new PrintWriter(tables);){
			for(int i = 1;i<10;i+=2) {
				createLine(i,file);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	/**
	 * Prints a block of the times tables 
	 * @param number
	 * @param file
	 */
	private static void createLine(int number, PrintWriter file) {
		
		for(int i = 1; i<11;i++) {
			String line = String.format("%d * %-2d = %d\t%d * %-2d = %d",number,i,i*number,number+1,i,(number+1)*i);
			file.println(line);
		}
		file.println();
		
		
	}

}
