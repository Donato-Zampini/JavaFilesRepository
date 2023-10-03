// IsLeapYear.java
import java.util.*;

public class IsLeapYear {
	public static void main(String[] args) {
		int year, check1, check2, check3;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in a year: ");
		year = input.nextInt();
		check1 = year % 400;
		check2 = year % 100;
		check3 = year % 4;
		if (check1 == 0 || check2 != 0 && check3 == 0)
			System.out.print(year + " is a leap year");
		else
			System.out.print(year + " is not a leap year");
	}
}
