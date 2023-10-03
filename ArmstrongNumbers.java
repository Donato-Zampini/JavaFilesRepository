// ArmstrongNumbers.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class ArmstrongNumbers {
	public static void main(String[] args) {
		int low, high;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lower limit: ");
		low = input.nextInt();
		System.out.print("Enter the upper limit: ");
		high = input.nextInt();
		String output = "The Armstrong numbers between "+low+" and "+high+" are: ";
		for(int x = low+1; x < high; x++) {
			if (check(x))
				output += x + " ";
		}
		System.out.print(output);
	}
	public static boolean check(int i) {
		int c = 0, a = 0, iTemp = i, t;
		while (iTemp >= 1) {
			c++;
			iTemp = iTemp / 10;
		}
		iTemp = i;
		for(int x=1; x<=c; x++) {
			t = iTemp % 10;
			iTemp = iTemp / 10;
			a += Math.pow(t, c);
		}
		if (a == i)
			return true;
		else
			return false;
		
	}
}
