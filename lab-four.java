import java.util.Scanner;

public class Lab4_1 {
	
	public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
        	res *= i;
        }
        return res;
    }
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 0 =< 'x' <= 2 parameter: ");
		final double x = input.nextDouble();
		if (x >= 0 || x <= 2) {
			
			double currentNum = 0;
			double e = 0.00001;
			double result = 0;
			double k = 1;
			int cNum = 1;
			
			do {
				result += currentNum;
				currentNum = (k * (x * x) - 1) / (1 + factorial(cNum));
				cNum *= 2;
				k++;
			} while (Math.abs(currentNum) > e); 	
			
			System.out.println("The result is: " + result);
			
		} else { 
			System.out.println("Error: wrong 'x'!");
		}
	}
}
