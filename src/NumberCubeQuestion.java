import java.util.Random;

public class NumberCubeQuestion {

	public static int[] getCubeTosses(NumberCube numberCube, int length) {
		return numberCube.getValues();
	}

	public static Object getLongestRun(int[] testValues) {
		int[] indexes = testValues;
		int[] runs = testValues;
		int x = 1;
		int y = 0;
		for (int i = 0; i < testValues.length - 1; i++) {
			if (testValues[i] == testValues[i + 1]) {
				indexes[y] = i;
				System.out.println("index: " + indexes[y]);
				x += 1;
			} else {
				runs[y] = x;
				x = 1;
				y += 1;
			}
		}
		runs[y] = x;
		
		for (int i = 0; i <= y; i++) {
			System.out.println(runs[i]);
		}
		
		for (int i = 0; i <= y; i++) {
			System.out.println("indexes" + indexes[i]);
		}
		
		int a = 0;
		int lRun = runs[0];
		for (int i = 0; i <= y; i++) {
			System.out.println( "runs i: " + runs[i] + "/runs i + 1: "+ runs[i+1] + "/index of i: " + indexes[i]);
			if (runs[i] < runs[i + 1] && lRun < runs[i + 1]) {
				lRun = runs[i + 1];
				a = i+1;
			}
			System.out.println("lRun: " + lRun);
		}
		System.out.println("final lRun:" + lRun);
		if (lRun != 1) {
			return indexes[a] - lRun + 1;
		}
		return -1;
	}
}