// AreaOfTriangle.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double b, h, a;
		System.out.print("Enter the values for base and height: ");
		b = input.nextDouble();
		h = input.nextDouble();
		a = areaOfTriangle(b,h);
		System.out.printf("Area of this triangle with base "+b+" and height "
				+h+" is: "+a);
	}
	public static double areaOfTriangle(double base, double height) {
		double area;
		area = 0.5*base*height;
		return area;
	}
}