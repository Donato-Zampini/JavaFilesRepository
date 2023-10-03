// ShowMeTheMoney.java
import java.util.*;

public class ShowMeTheMoney {
	public static void main(String[] args) {
		int lb, sh, pe, fa, rem, start;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in the number of farthings: ");
		start = input.nextInt();
		lb = start / 960;
		rem = start % 960;
		sh = rem / 48;
		rem = rem % 48;
		pe = rem / 4;
		fa = rem % 4;
		System.out.println("Pound Sterling " + lb + "\nShilling " + sh);
		System.out.print("Penny " + pe + "\nFarthings " + fa);
	}
}
