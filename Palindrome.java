// Palindrome.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String s = input.nextLine();
		if(checkPal(s))
			System.out.print("Input string "+s+ " is a palindrome");
		else
			System.out.print("Input string "+s+ " is NOT a palindrome");
	}
	public static String reverse(String s) {
		int n = s.length();
		String o = "";
		for(int i = 1; i <= n; i++)
			o = o + s.charAt(n-i);
		return o;
	}
	public static String removeSpaces(String s) {
		return s.replaceAll(" ", "");
	}
	public static boolean checkPal(String s) {
		String c = reverse(removeSpaces(s));
		String c2 = removeSpaces(s);
		if (c.equalsIgnoreCase(c2))
			return true;
		else
			return false;
	}
}