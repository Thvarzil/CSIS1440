package codingBat;

public class CodingBat {
	public static String wordEnds(String str, String word) {
		String result = "";
		  for(int i=0;i<str.length();i++){
		    if(str.substring(i).startsWith(word)){
		      if(i>0) {
		    	  result+=str.charAt(i-1);
		      }
		      if(i<str.length()-word.length()) {
		    	  result+=str.charAt(i+word.length());
		      }
		      
		    }
		   
		  }
		  return result;
	}
}
