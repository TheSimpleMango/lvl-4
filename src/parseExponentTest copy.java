import static org.junit.Assert.*;

import org.junit.Test;

public class parseExponentTest {

	@Test
	public void test() {
		assertEquals(4, parseExponent("2^2"));
		assertEquals(64, parseExponent("2^6"));
		assertEquals(27, parseExponent("3^3"));
		assertEquals(81, parseExponent("9^2"));
		assertEquals(1679616, parseExponent("6^8"));
	}
	
	public int parseExponent(String s){
		String[] s1 = s.split("\\^");
		System.out.println(s1[0]);
		int x = Integer.parseInt(s1[0]);
		int y = Integer.parseInt(s1[1]);
		int z = 1;
		for (int i = 0; i < y; i++) {
			z *= x;
		}
		return z;
	}
}
