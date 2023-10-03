// CarInsurance.java
import java.util.*;

public class CarInsurance {
	public static void main (String[] args) {
		double pre;
		int age;
		String s;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the premium price of the auto insurance policy: ");
		pre = input.nextDouble();
		System.out.print("Please enter the age of the insured: ");
		age = input.nextInt();
		System.out.print("Please enter the sex of the insured (Male or Female): ");
		s = input.next();
		if (pre <= 0 || age < 18 || s.equalsIgnoreCase("Male") == false && s.equalsIgnoreCase("Female") == false)
			System.out.print("Premium: -1.0 (One or more invalid inputs)");
		else if (age < 21 || age >= 60) {
			if (age < 21 && s.equalsIgnoreCase("Male"))
				System.out.print("Premium: " + pre);
			else if (age < 21 && s.equalsIgnoreCase("Female"))
				System.out.print("Premium: " + pre * 0.9);
			if (age >= 60)
				System.out.print("\nPremium: " + pre);
		}
		else if (age >= 21 && age < 30)
			System.out.print("Premium: " + pre * 0.75);
		else if (age >= 30 && age < 60) {
			if (s.equalsIgnoreCase("Male"))
				System.out.print("Premium: " + pre * 0.6);
			else
				System.out.print("Premium: " + pre * 0.7);
		}
	}
}