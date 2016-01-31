import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class lovelyPalindromesTest {

	@Test
	public void test() {
		assertEquals(161, palindromeFinder("words.txt"));
	}
	
	public boolean isPalindrome(String s){
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length()-(1+i))) {
				return false;
			}
		}
		return true;
	}
	public int palindromeFinder(String fileName){
		int counter = 0;
		File file = new File(fileName);
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String r = "asdf";
			while(r != null){
				if (isPalindrome(r)) {
					counter++;
					System.out.println(r);
				}
				r = br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return counter;
	}
}
