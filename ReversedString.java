// ReversedString.java Donato Zampini SB ID 114849209
import java.util.*;

public class ReversedString {
	public static void main(String[] args) {
		String s, o = "";
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string to be reversed: ");
		s = input.next();
		n = s.length();
		for(int i = 1; i <= n; i++)
			o = o + s.charAt(n-i);
		System.out.print("" + o);
	}
}