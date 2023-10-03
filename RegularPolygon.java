// RegularPolygon.java
import java.util.*;

public class RegularPolygon {
	public static void main (String[] args) {
		int n;
		final double pi = Math.PI;
		double s, a;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		n = input.nextInt();
		System.out.print("Enter the side length: ");
		s = input.nextDouble();
		a = n*(Math.pow(s, 2.0)) / (4 * Math.tan(pi/n));
		System.out.print("The area of the polygon is " + a);
	}
}