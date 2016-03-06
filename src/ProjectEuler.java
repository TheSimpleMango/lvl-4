import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjectEuler {
	// names 22
	public static void main(String[] args) throws FileNotFoundException {
		int total = 0;
		File f = new File("p022_names.txt");
		Scanner s = new Scanner(f);
		String names = "";
		ArrayList<String> nArray = new ArrayList<String>();
		while (s.hasNextLine()) {
			names += s.nextLine();
		}
		String[] namesA = names.split(",");
		for (String string : namesA) {
			nArray.add(string);
		}
		nArray = sort(nArray);
		int x = 0;
		for (String string : namesA) {
			total += count(string, x);
			x++;
		}
	}
	public static ArrayList sort(ArrayList x){
		return x;
	}
	public static int count(String s, int x){
		int y = 0;
		for (Character c : s.toCharArray()) {
			y += 0 - 65 + (int) c;
		}
		return y*x - 68;
	}
	
}
