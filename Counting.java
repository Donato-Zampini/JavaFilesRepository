// Counting.java Donato Zampini SB ID 114849209
import java.util.*;

public class Counting {
	public static void main(String[] args) {
		int i = -1, t = 0, c = 0, p = 0, n = 0;
		double o;
		Scanner input = new Scanner(System.in);
		while (i != 0) {
			if(c==0)
				System.out.print("Enter the first number, or 0 to exit: ");
			else
				System.out.print("Enter the next number, or 0 to exit: ");
			i = input.nextInt();
			c++;
			t += i;
			if(i<0)
				n++;
			else if (i>0)
				p++;
		}
		c--;
		o = (double) t / (double) c;
		System.out.print("Count: " +c);
		System.out.print("There were " + p + " positive integers and ");
		System.out.println(n + " negative integers");
		System.out.print("The sum is " + t + " and the average is " + o);
	}
}
