import java.util.Scanner;
import java.util.Arrays;

public class Lab9 {
	
	static public int checkFreq(String s) {
		char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int count = 1;
        int max = 0;
        char c = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                if (count > max) {
                    c = arr[i];
                    max = count;
                }
            } else {
                count = 1;
            }
        }
        if (max > 1) {
            System.out.println("Symbol " + c + " repeats " + max + " times");
        } else {
        	System.out.println("Every symbol in the line is unique.");
        	}
            return max;
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the line of symbols: ");
		String input = in.nextLine();
		checkFreq(input);
	}

}
