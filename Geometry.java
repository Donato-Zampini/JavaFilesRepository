// Geometry.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class Geometry {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] list = new double[3][2];
		System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
		for(int i = 0; i < list.length; i++)
			for(int j = 0; j < list[i].length; j++)
				list[i][j] = input.nextDouble();
		if(getTriangleArea(list) == 0)
			System.out.print("The three points are on the same line.");
		else
			System.out.printf("The area of the triangle is %.2f",getTriangleArea(list));
		input.close();
	}
	public static double getTriangleArea(double[][] points) {
		double[] sides = new double[3];
		double xsq = 0, ysq = 0, s = 0;
		for(int i = 0; i < 3; i++) {
			if(i+1 == 3) {
				xsq = Math.pow((points[2][0] - points[0][0]), 2);
				ysq = Math.pow((points[2][1] - points[0][1]), 2);
			}
			else {
				xsq = Math.pow((points[i][0] - points[i+1][0]), 2);
				ysq = Math.pow((points[i][1] - points[i+1][1]), 2);
			}
			sides[i] = Math.sqrt(xsq+ysq);
		}
		s = 0.5 * (sides[0] + sides[1] + sides[2]);
		if(lineCheck(points))
			return 0;
		else
			return Math.sqrt(s*(s - sides[0])*(s - sides[1])*(s - sides[2]));
	}
	public static boolean lineCheck(double[][] points) {
		double m1 = (points[1][1] - points[0][1]) / (points[1][0] - points[0][0]);
		double m2 = (points[2][1] - points[1][1]) / (points[2][0] - points[1][0]);
		if(m1 == m2)
			return true;
		else
			return false;
	}
}