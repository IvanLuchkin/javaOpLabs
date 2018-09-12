import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        System.out.println("Enter the degree measurement: ");
	        int deg = in.nextInt();
	        double rad = (deg/180)*Math.PI;
	        System.out.println(rad);	        
	}

}
