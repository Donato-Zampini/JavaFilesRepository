// SumDigits.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class SumDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		System.out.print(sumDigits(n));
		input.close();
	}
	public static int sumDigits(long n) {
		if(n <= 9)
			return (int)n;
		else
			return (int)n%10 + sumDigits(n/10);
	}
}
