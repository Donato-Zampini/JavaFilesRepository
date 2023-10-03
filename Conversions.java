// Conversions.java Donato Zampini SB ID 114849209
import java.util.*;

public class Conversions {
	public static void main(String[] args) {
		String s = "H";
		double in, out;
		Scanner input = new Scanner(System.in);
		while (!s.equals("G")) {
			System.out.println("A - convert pounds to kilos");
			System.out.println("B - convert kilos to pounds");
			System.out.println("C - convert kiolmeters to miles");
			System.out.println("D - convert miles to kilometers");
			System.out.println("E - convert Celsius to Fahrenheit");
			System.out.println("F - convert Fahrenheit to Celsius");
			System.out.println("G - Exit");
			System.out.print("Enter your option: ");
			s = input.next().toUpperCase();
			switch (s) {
			case "A" : System.out.print("Enter a quantity in pounds: ");
			in = input.nextDouble();
			out = in / 2.2;
			System.out.print(in+" pounds is "+out+" kgs\n");
			break;
			case "B" : System.out.print("Enter a quantity in kgs: ");
			in = input.nextDouble();
			out = in * 2.2;
			System.out.print(in+" kgs is "+out+" pounds\n");
			break;
			case "C" : System.out.print("Enter a quantity in kilometers: ");
			in = input.nextDouble();
			out = in * 0.62;
			System.out.print(in+" kilometers is "+out+" miles\n");
			break;
			case "D" : System.out.print("Enter a quantity in miles: ");
			in = input.nextDouble();
			out = in / 0.62;
			System.out.print(in+" miles is "+out+" kilometers\n");
			break;
			case "E" : System.out.print("Enter a quantity in Celsius: ");
			in = input.nextDouble();
			out = (9.0/5) * in + 32;
			System.out.print(in+" Celsius is "+out+" Fahrenheit\n");
			break;
			case "F" : System.out.print("Enter a quantity in Fahrenheit: ");
			in = input.nextDouble();
			out = (in - 32) * (5.0/9.0);
			System.out.print(in+" Fahrenheit is "+out+" Celsius\n");
			break;
			case "G" : System.out.print("Good bye!");
			break;
			default : System.out.print("Invalid option entered\n");
			break;
			}
		}
	}
}
