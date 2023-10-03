// ReverseDisplay.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class ReverseDisplay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int i = input.nextInt();
		reverseDisplay(i);
		input.close();
	}
	public static void reverseDisplay(int n) {
		if(Math.abs(n) <= 9)
			System.out.print(n);
		else {
			System.out.print(n%10);
			reverseDisplay(n/10);
		}
	}
}
