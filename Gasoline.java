// Gasoline.java
import java.util.*;

public class Gasoline {
	public static void main(String[] args) {
		double mins, speed, eff, consumed;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes:");
		mins = input.nextDouble();
		System.out.println("Enter the constant speed of the car (mph):");
		speed = input.nextDouble();
		System.out.println("Enter the fuel efficiency of the car (mpg):");
		eff = input.nextDouble();
		consumed = mins/60 * (speed/eff);
		System.out.println("Consumed gas for the period (in gallons):\n" + consumed);
	}
}