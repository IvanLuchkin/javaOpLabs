import java.util.*;

public class Lab8 {
	
	public static int[][] fillMatrix(int[][] matrix){
		for (int i = 0; i < matrix.length; i++) {						// Filling the matrix with numbers
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 200 - 100);
				System.out.print(matrix[i][j] + "\t"); 
			}
			System.out.println();
		}
		return matrix;
	}
	
	public static double[] createNewMatrix(int[][] matrix) {
		double [] X = new double [matrix.length];						// Calculating the components of the resulting array (vector) X[]
		for (int i = 0; i < matrix.length; i++) {
			double sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}		
			X[i] = sum / matrix[i].length;
		}
		return X;
	}
	
	public static double[] matrixSort(double[] matrix) {
		int last = matrix.length;										// Sorting X[]
		for (boolean sorted = last == 0; !sorted; --last) {
		    sorted = true;
		    for (int i = 1; i < last; ++i) {
		        if (matrix[i-1] < matrix[i]) {                
		            sorted = false;
		            double tmp = matrix[i - 1];
		            matrix[i-1] = matrix[i];
		            matrix[i] = tmp;
		        }
		    }               
		}
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i] + " ");
		}
		return matrix;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);				// Matrix size input
		System.out.println("Enter the quantity of rows: ");
		int n = in.nextInt();
		System.out.println("Enter the quantity of columns ");
		int m = in.nextInt();
		int [][] matrix = new int [n][m];
		
		fillMatrix(matrix);
		
		matrixSort(createNewMatrix(matrix));
		
	}

}
