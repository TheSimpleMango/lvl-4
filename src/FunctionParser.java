public class FunctionParser {
	public Integer[] getFunctionResultsArray(String string, int i, int j) {
		int re = Integer.parseInt("" + string.charAt(2));
		Integer[] y = new Integer[j - i + 1];
		int z = 1;
		for (int index = i; index <= j; index++) {
			z = 1;
			for (int k = 0; k < re; k++) {
			z *= index;
			}
			y[index - i] = z;
		}
		return y;
	}

}
