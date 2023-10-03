// Eggs.java
import java.util.*;

public class Eggs {
	public static void main(String[] args) {
		int eggs, doz, sing;
		double price, dPrice, sPrice;
		Scanner input = new Scanner(System.in);
		System.out.print("Number of eggs in the order: ");
		eggs = input.nextInt();
		doz = eggs / 12;
		sing = eggs % 12;
		dPrice = (double)doz * 3.25;
		sPrice = (double)sing * 0.45;
		price = dPrice + sPrice;
		System.out.print("You ordered " + eggs + " eggs. ");
		System.out.print("That's " + doz + " dozen (" + doz + " x 12 = " + doz*12 + " eggs) ");
		System.out.printf("at $3.25 per dozen (" + doz + " x $3.25 = $%.2f) ",dPrice);
		System.out.printf("\nand " + sing + " loose eggs at 45 cents (" + sing + " x 45c = $%.2f) ",sPrice);
		System.out.printf("for a total of $%.2f ($%.2f + $%.2f = $%.2f).",price,dPrice,sPrice,price);
	}
}
