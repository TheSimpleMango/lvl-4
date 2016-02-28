public class NumberCubeQuestion1 {

	public static int[] getCubeTosses(NumberCube numberCube, int length) {
		return numberCube.getValues();
	}

	public static Object getLongestRun(int[] testValues) {
		Asdf[] runs = new Asdf[testValues.length];
		boolean a = true;
		int x = 1;
		int y = 0;
		Asdf z = new Asdf();
		for (int i = 0; i < testValues.length - 1; i++) {
			if (testValues[i] == testValues[i + 1]) {
				if (a) {
					z.index = i;
				}
				a = false;
				x += 1;
			} else {
				z.runLength = x;
				runs[y] = z;
				x = 1;
				y += 1;
				a = true;
			}
		}
		
		for (int i = 0; i < y - 1; i++) {
			System.out.println(runs[i].runLength);
		}
		
		Asdf lRun = runs[0];
		for (int i = 0; i < y - 1; i++) {
			System.out.println( runs[i].runLength + " "+ runs[i+1].runLength);
			if (runs[i].runLength < runs[i + 1].runLength && lRun.runLength < runs[i + 1].runLength) {
				lRun = runs[i + 1];
			}
			System.out.println(lRun.runLength);
		}
		if (lRun.runLength != 1) {
			return lRun.index;
		}
		return -1;
	}
}

class Asdf {
	int index;
	int runLength;
}