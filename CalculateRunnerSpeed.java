// CalculateRunnerSpeed.java
import java.util.*;

public class CalculateRunnerSpeed {
	public static void main (String[] args) {
		double d, mph, t;
		Scanner input = new Scanner(System.in);
		System.out.println("Input the distance ran (in miles):");
		d = input.nextDouble();
		System.out.println("Input the time ran (in minutes):");
		t = input.nextDouble();
		mph = (d / t) * 60;
		System.out.println("Speed (in mph):\n" + mph);
	}
}