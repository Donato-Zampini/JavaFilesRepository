// BinaryToDecimal.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		String bin;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integer in binary format: ");
		bin = input.nextLine();
		System.out.print("Decimal: "+bin2Dec(bin));
	}
	public static int bin2Dec(String bin) {
		char[] ints = new char[bin.length()];
		int num = 0;
		ints = bin.toCharArray();
		for(int i = 0; i < ints.length; i++) {
			if(ints[i] == '1')
				num += (int)(Math.pow(2, ints.length-(i+1)));
		}
		return num;
	}
}
