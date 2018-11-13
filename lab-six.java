import java.util.Scanner;

public class Lab6 {
	
	public static double factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			double result = 1;
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		}
    }
	
	public static double calculate(int n, int k, double x) {
		double result = (Math.pow(-1, k)) * 
						(Math.pow((x / 2), ((2 * k) + n))) / 
						(factorial(k) * factorial(n + k));
		return result;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 'n':");
		int n = in.nextInt();
		System.out.println("Enter 'x':");
		double x = in.nextDouble();
		System.out.println("Enter the value of precision:");
		double precision = in.nextDouble();
		
		int k = 0;	
		double curRes = 0;
		
		do {
			curRes += calculate(n, k, x);
			k++;	
		} while(Math.abs(calculate(n, k, x)) > precision);
		System.out.println(curRes);
	}
}
