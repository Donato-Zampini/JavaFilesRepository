// Celsius2Fahrenheit.java
import java.util.Scanner;

public class Celsius2Fahrenheit {
	public static void main (String[] args) {
		double f, c;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a temperature in Celsius: ");
		c = input.nextDouble();
		f = (9.0/5) * c + 32;
		System.out.println(c + " degrees Celsius is " + f + " degrees Fahrenheit.");
	}
}