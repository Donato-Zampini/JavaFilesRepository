// GasRefillCalculator.java
import java.util.*;

public class GasRefillCalculator {
	public static void main(String[] args) {
		double d, mpg, p, pTotal;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the distance (in miles):");
		d = input.nextDouble();
		System.out.println("Enter the fuel efficiency (in mpg):");
		mpg = input.nextDouble();
		System.out.println("Enter the price of fuel per gallon:");
		p = input.nextDouble();
		pTotal = (d / mpg) * p;
		System.out.println("The price for the trip is:\n$" + pTotal);
	}
}
