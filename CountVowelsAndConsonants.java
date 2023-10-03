// CountVowelsAndConsonants
import java.util.*;

public class CountVowelsAndConsonants {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		int vowels = 0, consonants = 0;
		for(int i= 0; i<s.length(); i++) {
			char c = Character.toLowerCase(s.charAt(i));
			if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u')
				vowels++;
			if(Character.isLetter(c) && !(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'))
				consonants++;
		}
		System.out.println("The number of vowels is "+vowels);
		System.out.print("The number of consonants is "+consonants);
	}
}
