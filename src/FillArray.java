
public class FillArray {
	public FillArray() {
		String[][] arr = new String[12][80];
		fillArray(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}

	public void fillArray(String[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				if (i == 0 || j == 0 || i == x.length - 1 || j == x[0].length - 1) {
					x[i][j] = "X";
				} else {
					x[i][j] = "O";
				}
			}
		}
	}

	public static void main(String[] args) {
		FillArray x = new FillArray();
	}
}