import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PythonChallenge {
	public static void main(String[] args) throws IOException {
		/*String z = "";
		char y = ' ';
		String x = "map";
		for (Character c : x.toCharArray()) {
			y = (char) (c + 2);
			System.out.println(y);
			z += y;
		}
		System.out.println(z);*/
		String x = "";
		int c = ' ';
		File f = new File("text");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			c = (int) sc.next;
			System.out.println(c);
			if (c > 65 && c < 122) {
				x += (char) c;
				System.out.println("asdf");
			}
		}
		System.out.println(x);
	}
}