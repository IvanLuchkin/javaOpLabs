import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the quantity of multipliers:" );
		int qnty = in.nextInt();
		
		if(qnty <= 0) {
			System.out.println("Error: natural number required!");
		} else {
			double num = 1.0;
			for (double k = 1; k <= qnty; k++) {
				num = num * ((2 * k) - 1) / (2 * k);
			}
			System.out.println("The result of the multiplication is: " + num);
		}	
	}
}
