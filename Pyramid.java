// Pyramid.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int num = input.nextInt();
		for(int i = 0; i < num; i++) {
			for(int j = num-i; j > 1; j--) {
				System.out.print("\t");
			} //Format each line's start
			for(int n = 0; n < (i+1); n++) {
				System.out.printf("%d",(int)Math.pow(2.0, (double)n));
				if (i != 0)
					System.out.print("\t");
			} //Left side of the pyramid
			for(int x = i - 1; x > -1; x--) {
				System.out.printf("%d",(int)Math.pow(2.0, (double)x));
				if (x != 0)
					System.out.print("\t");
			} //Right side of the pyramid
			if (i != num-1)
				System.out.print("\n"); //Start line for next level
		}
	}
}