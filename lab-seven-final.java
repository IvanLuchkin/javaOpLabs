	import java.util.Scanner;
	
	public class Lab7 {
		
		public static void stats(int a, int b, int k, int n) {
			int[] days = new int[n];
			
			if (k > n) {
				System.out.println("No information");
			} else {
				for (int i = 0; i < k; i++) {
					days[i] = ((int)(Math.random() * 2));
					if (days[i] == 0) {
						a -= 1;
					} else {
						a += 2;					
					}			
				}
			}
			
			if (a > b) {
				System.out.println(0 + " , the snail is on the ground");
			} else {
				System.out.println(a);
			}
		}
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the number of days:");
			int n = in.nextInt();
			System.out.println("Enter the number of days to observe:");
			int k = in.nextInt();
			System.out.println("Enter the initial position:");
			int a = in.nextInt();
			System.out.println("Enter the height of the tree:");
			int b = in.nextInt();
			
			stats(a,b, k, n);
		}
	
	}

