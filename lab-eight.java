import java.util.*;

public class Lab8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);				// Matrix size input
		System.out.println("Enter the quantity of rows: ");
		int n = in.nextInt();
		System.out.println("Enter the quantity of columns ");
		int m = in.nextInt();
		int [][] matrix = new int [n][m];
		
		for (int i = 0; i < n; i++) {						// Filling the matrix with numbers
			for (int j = 0; j < m; j++) {
				matrix[i][j] = (int)(Math.random() * 200 - 100);
				System.out.print(matrix[i][j] + "\t"); 
			}
			System.out.println();
		}
		
		double [] X = new double [n];						// Calculating the components of the resulting array (vector) X[]
		for (int i = 0; i < n; i++) {
			double sum = 0;
			for (int j = 0; j < m; j++) {
				sum += matrix[i][j];
			}		
			X[i] = sum / m;
		}
		
		int last = n;										// Sorting X[]
		for (boolean sorted = last == 0; !sorted; --last) {
		    sorted = true;
		    for (int i = 1; i < last; ++i) {
		        if (X[i-1] < X[i]) {                
		            sorted = false;
		            double tmp = X[i - 1];
		            X[i-1] = X[i];
		            X[i] = tmp;
		        }
		    }               
		}
		
		System.out.print("X( ");							// Results output
		for (int i = 0; i < n; i++) {
			System.out.print(X[i] + " ");
		}
		System.out.print(" )");
		
	}

}
