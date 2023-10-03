// Anagrams.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1, s2;
		System.out.print("Enter the first string: ");
		s1 = input.nextLine();
		System.out.print("Enter the second string: ");
		s2 = input.nextLine();
		if(anagram(s1,s2))
			System.out.print(s1+" and "+s2+" are anagrams");
		else
			System.out.print(s1+" and "+s2+" are NOT anagrams");
	}
	public static boolean anagram(String s1, String s2) {
		String sa = removeSpaces(s1);
		String sb = removeSpaces(s2);
		sa = sa.toLowerCase();
		sb = sb.toLowerCase();
		char[] ca = new char[sa.length()];
		ca = sa.toCharArray();
		char[] cb = new char[sb.length()];
		cb = sb.toCharArray();
		sort(ca);
		sort(cb);
		if(ca.length != cb.length)
			return false;
		if(java.util.Arrays.equals(ca, cb))
			return true;
		else
			return false;
	}
	public static String removeSpaces(String s) {
		return s.replaceAll(" ", "");
	}
	public static void sort(char[] c) {
		char currentMin = ' ';
		int currentMinIndex = 0;
		for (int i = 0; i < c.length; i++) {
			currentMin = c[i];
			currentMinIndex = i;
			for (int x = i+1; x < c.length; x++) {
				if (currentMin > c[x]) {
					currentMin = c[x];
					currentMinIndex = x;
				}
			}
			if (currentMinIndex != i) {
				c[currentMinIndex] = c[i];
				c[i] = currentMin;
			}
		}
	}

}
