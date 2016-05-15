import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MoreTests {

	@Test
	public void MultTest() {
		assertEquals("10 x 0 = 0", multiply(10, 0));
		assertEquals("10 x 10 = 100", multiply(10, 10));
		assertEquals("8 x 11 = 88", multiply(8, 11));
	}

	public String multiply(int x, int y) {
		return x + " x " + y + " = " + (x * y);
	}

	@Test
	public void PrimeTest() {
		assertTrue(isPrime(3));
		assertTrue(isPrime(5));
		assertTrue(isPrime(541));
		assertFalse(isPrime(4));
		assertFalse(isPrime(12));
		assertFalse(isPrime(527));
	}

	public boolean isPrime(int x) {
		if (x % 2 == 0)
			return false;
		for (int i = 3; i * i < x; i += 2)
			if (x % i == 0)
				return false;
		return true;
	}

	@Test
	public void SquareTest() {
		assertTrue(isSquare(4));
		assertTrue(isSquare(144));
		assertTrue(isSquare(64));
		assertTrue(isSquare(10201));
		assertTrue(isSquare(1));
		assertFalse(isSquare(3));
		assertFalse(isSquare(22));
		assertFalse(isSquare(143));
	}

	public boolean isSquare(int x) {
		if (Math.sqrt(x) == Math.floor(Math.sqrt(x))) {
			return true;
		}
		return false;
	}

	@Test
	public void CubeTest() {
		assertTrue(isCube(27));
		assertTrue(isCube(216));
		assertTrue(isCube(729));
		assertTrue(isCube(1));
		assertFalse(isCube(3));
		assertFalse(isCube(22));
		assertFalse(isCube(143));
	}

	public boolean isCube(double x) {
		if (Math.cbrt(x) == Math.floor(Math.cbrt(x))) {
			return true;
		}
		return false;
	}
}
