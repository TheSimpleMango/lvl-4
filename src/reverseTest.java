import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class reverseTest {

	@Test
	public void test() {
		assertEquals("frab", reverseMe("barf"));
	}
	
	public String reverseMe(String s){
		String newS = "";
		for (int i = 0; i < s.length(); i++) {
			newS += s.charAt((s.length()-1)-i);
		}
		System.out.println(newS);
		return newS;
	}
}
