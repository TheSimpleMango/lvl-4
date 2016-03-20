import java.util.HashMap;

public class NumberCubeQuestion {

	public static int[] getCubeTosses(NumberCube numberCube, int length) {
		return numberCube.getValues();
	}

	public static Object getLongestRun(int[] testValues) {
		HashMap<Integer, Integer> runs = new HashMap<>();
		boolean stillRun;
		int index;
		int runLength = 0;
		for (int i = 0; i < testValues.length - 3; i++) {
			runLength = 1;
			stillRun = true;
			index = i;
			while (stillRun) {
				if (testValues[i] == testValues[i + runLength]) {
					runLength++;
				} else {
					runs.put(index, runLength);
					stillRun = false;
				}
			}
		}

		for (int i : testValues) {
			System.out.println(i + "; " + testValues[i]);
		}

		int longestRun = 0;
		int longestRunIndex = 0;
		for (int i : runs.keySet()) {
			if (runs.get(i) > longestRun) {
				longestRun = runs.get(i);
				longestRunIndex = i;
			}
		}
		if (longestRun > 1) {
			return longestRunIndex;
		}
		return -1;
	}
}