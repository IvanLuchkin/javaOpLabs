import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
		String err = "This point does not belong to the area";
		String cor = "This point belongs to the area";
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 'x' coordinate");
		double x = in.nextDouble();
		System.out.println("Enter the 'y' coordinate");
		double y = in.nextDouble();
		
		if (!(x < 0 && y > 0) &&
			(x * x + y * y) >= 9 &&
			(x >= -3) &&
			(x <= 3) &&
			(y >= -3) &&
			(y <= 3)
		) {
			System.out.println(cor);
		} else {
			System.out.println(err);
		}
	}

}
