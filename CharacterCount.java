// CharacterCount.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class CharacterCount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string on this line: ");
		String s = input.nextLine();
		System.out.print("Enter the character to be searched for: ");
		String c1 = input.next();
		char c = c1.charAt(0);
		int i = count(s,c);
		System.out.print("In the string \""+s+"\" there are/is "+i+" instance(s)"
				+" of \""+c+"\"");
	}
	public static int count(String s, char c) {
		s = s.toLowerCase();
		c = Character.toLowerCase(c);
		char d;
		int t = 0;
		for(int i = 0; i < s.length(); i++) {
			d = s.charAt(i);
			if (d == c)
				t++;
		}
		return t;
	}
}
