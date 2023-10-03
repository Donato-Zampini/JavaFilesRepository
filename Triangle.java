// Triangle.java
import java.util.*;

public class Triangle {
	public static void main(String[] args) {
		int s1, s2, s3;
		Scanner input = new Scanner(System.in);
		System.out.print("Side1: ");
		s1 = input.nextInt();
		System.out.print("Side2: ");
		s2 = input.nextInt();
		System.out.print("Side3: ");
		s3 = input.nextInt();
		if ((s1+s2) <= s3 || (s1+s3) <= s2 || (s2+s3) <= s1)
			System.out.print("Output: Invalid input!");
		else if (s1 == s2 && s2 == s3)
			System.out.print("Output: Equilateral");
		else if (s1 == s2 || s1 == s3 || s2 == s3)
			System.out.print("Output: Isosceles");
		else
			System.out.print("Output: Scalene");
	}
}
