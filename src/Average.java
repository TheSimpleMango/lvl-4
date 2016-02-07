import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many numbers will be averaged?");
		int[] ints = new int[s.nextInt()];
		System.out.println("Enter each number on a seperate line.");
		for (int i = 0; i < ints.length; i++) {
			ints[i] = s.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < ints.length; i++) {
			sum += ints[i];
		}
		System.out.println(sum/ints.length);
	}
}
