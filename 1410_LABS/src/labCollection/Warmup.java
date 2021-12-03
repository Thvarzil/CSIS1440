package labCollection;

import java.util.ArrayList;

public class Warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 2;i<51;i+=2) {
			numbers.add(i);
		}
		System.out.print("Numbers: ");
		for (Integer i : numbers) {
			System.out.print(i+" ");
		}
		System.out.print("\nRemoving all multiples of three...\nNumbers: ");
		numbers.removeIf(n -> (n%3==0));
		for (Integer i : numbers) {
			System.out.print(i+" ");
		}
	}

}
