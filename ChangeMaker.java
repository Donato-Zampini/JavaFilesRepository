// ChangeMaker.java V2
import java.util.Scanner;

public class ChangeMaker {
	public static void main (String [] args) {
		int hundos, fifs, twenties, tens, fives, singles, left, qrts, dms, ncs, pens;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount: ");
		int change = (int)(input.nextDouble() * 100);
		hundos = change / 10000;
		left = change % 10000;
		fifs = left / 5000;
		left = left % 5000;
		twenties = left / 2000;
		left = left % 2000;
		tens = left / 1000;
		left = left % 1000;
		fives = left / 500;
		left = left % 500;
		singles = left / 100;
		left = left % 100;
		qrts = left / 25;
		left = left % 25;
		dms = left / 10;
		left = left % 10;
		ncs = left / 5;
		pens = left % 5;
		if (hundos != 0)
			System.out.println(hundos + " $100 bills");
		if (fifs != 0)
			System.out.println(fifs + " $50 bills");
		if (twenties != 0)
			System.out.println(twenties + " $20 bills");
		if (tens != 0)
			System.out.println(tens + " $10 bills");
		if (fives != 0)
			System.out.println(fives + " $5 bills");
		if (singles != 0)
			System.out.println(singles + " $1 bills");
		if (qrts != 0)
			System.out.println(qrts + " quarters");
		if (dms != 0)
			System.out.println(dms + " dimes");
		if (ncs != 0)
			System.out.println(ncs + " nickels");
		if (pens != 0)
			System.out.println(pens + " pennies");
	}
}