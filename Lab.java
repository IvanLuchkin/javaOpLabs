import java.util.Scanner;
public class Lab {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        System.out.println("Enter the x^2 coefficient: ");
	        int a = in.nextInt();
	        if (a == 0)
	        	System.out.println("The x^2 coefficient can`t be equal to zero.");
	        else {
	        	System.out.println("Enter the x coefficient: ");
	        	int b = in.nextInt();
	        	System.out.println("Enter the x^0 coefficient: ");
	        	int c = in.nextInt();
	        	System.out.println(a+"x^2 + "+ b +"x + " + c);
	        	int discriminant = b*b - 4*a*c;
	        	double sol1 = ((-b) + Math.sqrt(discriminant))/2*a;
	        	double sol2 = ((-b) - Math.sqrt(discriminant))/2*a;
	        	if (discriminant < 0) 
	        		System.out.println("No real solutions");
	        	else if (discriminant == 0)
	        		System.out.println("The only solution is:" + sol1);		
	        	else {
	        			System.out.println("The first solution is:" + sol1);
	        			System.out.println("The second solution is:" + sol2);    
	        	}
	        }
	}

}
