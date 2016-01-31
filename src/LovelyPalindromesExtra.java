import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class LovelyPalindromesExtra {
	public static void main(String[] args) {
		int counter = 0;
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> reverseWords = new ArrayList<String>();
		File f = new File("words.txt");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String r = br.readLine();
			while(r != null){
				words.add(r);
				r = br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (String string : words) {
			Stack<Character> stringStack = new Stack<>();
			String newString = "";
			for (Character character : string.toCharArray()) {
				stringStack.push(character);
			}
			int stringStackLength = stringStack.size();
			for (int i = 0; i < stringStackLength; i++) {
				newString += stringStack.pop();
			}
			reverseWords.add(newString);
		}
		for (String reverseString : reverseWords) {
			for (String string : words) {
				if (reverseString.equals(string)) {
					System.out.println(string + "; " + reverseString);
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
}
