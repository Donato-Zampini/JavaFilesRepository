// Discount.java
import java.util.Scanner;

public class Discount {
	public static void main (String[] args) {
		double price1, priceDisc, disc, finalP, cashOff;
		int amount, printDisc;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the fixed price of the game(s):");
		price1 = input.nextDouble();
		System.out.println("Enter the quantity of game(s) to be purchased:");
		amount = input.nextInt();
		if (amount < 10)
			disc = 0.0;
		else if (amount < 20)
			disc = 0.2;
		else if (amount < 50)
			disc = 0.3;
		else if (amount < 100)
			disc = 0.4;
		else
			disc = 0.5;
		if (disc == 0.0) {
			printDisc = 0;
			finalP = price1 * amount;
			System.out.println("\nDiscount: " + printDisc +"%");
			System.out.println("Discounted price: $" + price1);
			System.out.println("Discounted amount/ unit: $" + "0.00");
			System.out.println("Total price: $" + price1 + " * " + amount + " = $" + finalP);
		}
		else {
			printDisc = (int)(disc*100.0);
			priceDisc = (1-disc) * price1;
			finalP = amount * priceDisc;
			cashOff = disc * price1;
			System.out.println("\nDiscount: " + printDisc +"%");
			System.out.printf("Discounted price: $%.2f", priceDisc);
			System.out.printf("\nDiscounted amount/ unit: $%.2f", cashOff);
			System.out.printf("\nTotal price: $%.2f * %d = $%.2f", priceDisc, amount, finalP);
		}
	}
}