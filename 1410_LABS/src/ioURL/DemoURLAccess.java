package ioURL;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Reads Julius Ceasar and prints it to console and to a file
 * @author Lou Lebohec
 *
 */
public class DemoURLAccess {

	public static void main(String[] args) {
		String urlString = "https://www.gutenberg.org/files/46768/46768-0.txt";
		File file = new File("./src/ioURL/JuliusCaesar.txt");
		final int PAGE_LENGTH = 35;
		
		try {
			URL url = new URL(urlString);
			try(InputStream stream = url.openStream();
					BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
					BufferedWriter writer = new BufferedWriter(new FileWriter(file));
					){
				String line;
				int i = 0;
				while((line = reader.readLine()) != null) {
					i++;
					System.out.println(line);
					writer.write(line+"\n");
					
					if(i==PAGE_LENGTH) {
						System.out.println("Press Enter to Continue");
						System.in.read();
						
						i=0;
					}
				}
			}
			
		}catch(MalformedURLException e) {
			System.out.println("We encountered a problem regarding the following URL:\n"+urlString+
					"\nEither no legal protocol could be found or the String could not be parsed");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Attempting to open a stream from the URL "+urlString+" caused a problem");
			e.printStackTrace();
		}

	}

}
