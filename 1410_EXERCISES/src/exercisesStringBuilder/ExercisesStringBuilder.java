package exercisesStringBuilder;

public class ExercisesStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Challenge 1
		StringBuilder sb = new StringBuilder("Cats live");
		
		//Challenge 2
		sb.replace(0, 1, "r");
		sb.append(" on ");
		System.out.println(sb);
		
		//Challenge 3
		StringBuilder temp = new StringBuilder(sb);
		sb.append(temp.reverse());
		System.out.println(sb);
		
		//Challenge 4
		int doubleSpace = sb.indexOf("  ");
		sb.replace(doubleSpace, doubleSpace+2, " ");
		
		sb.replace(0, 1, "C").append(".");
		
		System.out.println(sb);
		
	}

}
