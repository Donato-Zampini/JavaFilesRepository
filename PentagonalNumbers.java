// PentagonalNumbers.java
import java.util.*;

public class PentagonalNumbers {
	public static void main(String[] args) {
		int n, p;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		n = input.nextInt();
		p = n*(3*n-1)/2;
		System.out.print("Pentagonal number: " + p);
	}
}