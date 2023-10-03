// PopulationEstimates.java
import java.util.*;

public class PopulationEstimates {
	public static void main(String[] args) {
		int y, p;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		y = input.nextInt();
		p = ((y - 2000) - 10) * 3 + 310;
		System.out.print("Population estimate (millions of people): " + p);
	}
}
