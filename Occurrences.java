// Occurrences.java by Donato Zampini SB ID 114849209

public class Occurrences {
	public static void main(String[] args) {
		char[] chars = {'a','b','a','b','a','a','b','c'};
		System.out.println(count(chars,'a'));
		System.out.println(count(chars,'b'));
		System.out.println(count(chars,'c'));
		System.out.println(count(chars,'d'));
	}
	public static int count(char[] chars, char ch) {
		return count(chars, ch, chars.length-1);
	}
	public static int count(char[] chars, char ch, int high) {
		if (high == 0) {
			if(chars[0] == ch)
				return 1;
			else
				return 0;
		}
		else if(chars[high] == ch)
			return 1 + count(chars, ch, high-1);
		else
			return count(chars, ch, high-1);
	}
}
