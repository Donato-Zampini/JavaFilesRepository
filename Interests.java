// Interests.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class Interests {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double loan, monthlyIR, monthlyPM, total, annualIR;
		int years;
		System.out.print("Loan amount: $");
		loan = input.nextDouble();
		System.out.print("Number of years: ");
		years = input.nextInt();
		annualIR = 5;
		System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");
		while (annualIR <= 8) {
			monthlyIR = annualIR / 1200;
			monthlyPM = loan * monthlyIR / (1-(Math.pow(1/(1+monthlyIR),years*12.0)));
			total = monthlyPM * years * 12;
			System.out.printf("%.3f%%\t\t$%.2f\t\t$%.2f\n", annualIR, monthlyPM, total);
			annualIR += 0.125;
		}
	}
}
