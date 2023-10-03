// DecimalToBinary.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integer in deciml format: ");
		int n = input.nextInt();
		System.out.print("Binary: "+dec2Bin(n));
	}
	public static String dec2Bin(int n) {
		int temp=n, x=0, bin=0, i=0;
		do {
			x = temp%2;
			temp = temp / 2;
			bin += x * (Math.pow(10,i));
			i++;
		} while(temp>0);
		return ("("+bin+")_2");
	}
}
