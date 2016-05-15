
public class FactorialRecursion {
	int y;
	int x;

	public FactorialRecursion(int i) {
		y = i;
		x = i;
	}

	public void factorial() {
		System.out.println(y);
		y *= --x;
		if (x > 1) {
			factorial();
		}
	}

	public static void main(String[] args) {
		FactorialRecursion x = new FactorialRecursion(6);
		x.factorial();
	}
}
