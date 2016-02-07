
public class addingMatrices {
	public static void main(String[] args) {
		int[][] matrix1 = new int[2][3];
		matrix1[0][0] = 1;
		matrix1[0][1] = 2;
		matrix1[0][2] = 3;
		matrix1[1][0] = 4;
		matrix1[1][1] = 5;
		matrix1[1][2] = 6;
		int[][] matrix2 = new int[2][3];
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j] = 1;
			}
		}
		int[][] matrixSum = new int[matrix1.length][matrix1[0].length];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		for (int i = 0; i < matrixSum.length; i++) {
			for (int j = 0; j < matrixSum[i].length; j++) {
				System.out.println(matrixSum[i][j]);
			}
		}
	}
}
