// PremiumAirlines.java
import java.util.*;

public class PremiumAirlines {
	public static void main (String[] args) {
		String s;
		int currentPoints;
		double price;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter membership level (Diamond/Platinum/Regular): ");
		s = input.next();
		System.out.print("Please enter the ticket price: ");
		price = input.nextDouble();
		System.out.print("Please enter the current point total: ");
		currentPoints = input.nextInt();
		if (currentPoints < 0 || price <= 0 || !s.equalsIgnoreCase("Diamond") && !s.equalsIgnoreCase("Platinum") && !s.equalsIgnoreCase("Regular"))
			System.out.print("One or more invalid inputs; please start again.");
		else if (s.equalsIgnoreCase("Diamond")) {
			if (price >= 5000)
				currentPoints += 35;
			else if (price >= 2000 && currentPoints > 300)
				currentPoints += 30;
			else if (price >= 500 && currentPoints >= 100)
				currentPoints += 10;
			else if (currentPoints >= 25)
				currentPoints += 2;
			System.out.print("Points: " + currentPoints);
		}
		else if (s.equalsIgnoreCase("Platinum")) {
			if (price >= 5000)
				currentPoints += 35;
			else if (price >= 2000)
				currentPoints += 20;
			System.out.print("Points: " + currentPoints);
		}
		else if (s.equalsIgnoreCase("Regular") && price >= 5000) {
			currentPoints += 5;
			System.out.print("Points: " + currentPoints);
		}
	}
}
