// ReverseNumber.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int i = input.nextInt();
		System.out.print(reverse(i));
		input.close();
	}
	public static int reverse(int n) {
		if (n <= 9)
			return n;
		else {
			return (int)(n%10 * Math.pow(10, (double)digits(n)) + reverse(n/10));
		}
	}
	public static int digits(int n) {
		int count = 0; int temp = n;
		while(temp > 0) {
			temp /= 10;
			count++;
		}
		return count-1;
	}
}
