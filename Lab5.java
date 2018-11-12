/*
   19. 	Натуральне число називається досконалим, якщо воно дорівнює 
  		сумі всіх своїх дільників, за винятком самого себе, 
  		наприклад, 6=1+2+3. Дано натуральні числа a і b (a ≤ b). 
  		Отримати всі досконалі числа, які належать інтервалу [a, b]. 
 		Дано натуральне число  n. 
 */

import java.util.Scanner;

public class Lab5 { 
	
	public static boolean isPerfect(int i) {
		int sum = 0;
		for (int j = 1; j < i; j++) {
			if (i % j == 0) {
				sum += j;
			}
		}
		return (sum == i);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 'a':");
		int a = in.nextInt();
		System.out.println("Enter 'b':");
		int b = in.nextInt();
		
		if ((a >= 1) &&
		    (b >= 1) &&
		    (a <= b)
		) {
			for (int i = a; i <= b; i++) {
				if ( isPerfect(i) ) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("Error: incorrect input.");
		}
	}
