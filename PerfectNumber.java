// PerfectNumber.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int i, c = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the upper limit: ");
		i = input.nextInt();
		System.out.print("The perfect numbers below "+i+" are: ");
		for(int j = 1; j < i; j++) {
			for(int x = 1; x < j; x++) {
				if(j%x == 0)
					c += x;
			}
			if (c == j)
				System.out.print(j + " ");
			c = 0;
		}
	}
}
