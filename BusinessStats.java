// BusinessStats.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class BusinessStats {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] nums = new double[10];
		System.out.print("Enter ten numbers: ");
		for(int x = 0; x < nums.length; x++)
			nums[x] = input.nextDouble();
		input.close();
		System.out.printf("The mean is: %.2f\n",mean(nums));
		System.out.printf("The standard deviation is %.5f",deviation(nums));
	}
	public static double deviation(double[] x) {
		double sum = 0;
		final double avg = mean(x);
		for(int i = 0; i < x.length; i++)
			sum += Math.pow(x[i] - avg, 2.0);
		return Math.sqrt(sum / (x.length - 1));
	}
	public static double mean(double[] x) {
		double sum = 0;
		for(int i = 0; i < x.length; i++)
			sum += x[i];
		return sum / x.length;
	}
}