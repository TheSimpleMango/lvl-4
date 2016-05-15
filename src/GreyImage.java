
public class GreyImage {
	static int[][] x;

	public static int[][] createTestArray() {
		int[][] arr = { { 255, 184, 178, 84, 129 }, { 84, 255, 255, 130, 84 }, { 78, 255, 0, 0, 78 }, { 84, 130, 255, 130, 84 } };
		x = arr.clone();
		return x;
	}

	public int[][] getPixelValues() {
		return x;
	}

	public void setPixelValues(int[][] arr) {
		this.x = arr;
	}

	public int countWhitePixels() {
		int y = 0;
		for (int[] is : x) {
			for (int i : is) {
				if (i == 255) {
					y++;
				}
			}
		}
		return y;
	}

	public static boolean areSame(int[][] afterCallToProcessImage, int[][] afterCallToProcessImage2) {
		for (int i = 0; i < afterCallToProcessImage.length; i++) {
			for (int j = 0; j < afterCallToProcessImage[0].length; j++) {
				if (afterCallToProcessImage[i][j] != afterCallToProcessImage2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	public void processImage() {
		for (int i = 0; i < (x.length - 2); i++) {
			for (int j = 0; j < (x[0].length - 2); j++) {
				x[i][j] = x[i][j] - x[i + 2][j + 2];
				if (x[i][j] < 0) {
					x[i][j] = 0;
				}
			}
		}
	}

}
