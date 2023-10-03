// ComputeEquation.java
import java.util.*;

public class ComputeEquation {
	public static void main(String[] args) {
		double x, y, sum;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first value (x):");
		x = input.nextDouble();
		System.out.println("Enter the second value (y):");
		y = input.nextDouble();
		sum = x/(y-3*x) + (x-1)/(y/(x+1));
		System.out.println("Equation value:\n" + sum);
	}
}
