// RandomString.java Donato Zampini SB ID 114849209
import java.util.Scanner;

public class RandomString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the random string: ");
		int num = input.nextInt();
		System.out.print("Enter \"l\" for lower case, or \"u\" for upper case: ");
		char c = input.next().charAt(0);
		System.out.print(randomString(num,c));
		input.close();
	}
	public static String randomString(int len, char ulCase) {
		String s="";
		if(ulCase == 'u')
			for(int i = 0; i<len; i++)
				s += Character.toUpperCase((char) (97+(100*Math.random()%26)));
		else if (ulCase == 'l')
			for(int i = 0; i<len; i++)
				s += Character.toLowerCase((char) (97+(100*Math.random()%26)));
		return s;
	}
}
