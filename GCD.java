// GCD.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int int1, int2;
		System.out.print("Enter the first integer: ");
		int1 = input.nextInt();
		System.out.print("Enter the second integer: ");
		int2 = input.nextInt();
		input.close();
		while(int2 != 0) {
			int t = int2;
			int2 = int1 % int2;
			int1 = t;
		}
		System.out.print("The greatest common divisor is: "+int1);
	}
}
