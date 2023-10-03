// Kgs_pounds.java Donato Zampini SB ID 114849209

public class Kgs_pounds {
	public static void main(String[] args) {
		double kg2, lb1;
		int kg1, lb2;
		kg1 = 1;
		lb2 = 20;
		System.out.print("Kilograms\tPounds\tPounds\tKilograms");
		while (kg1 < 200) {
			lb1 = kg1 * 2.2;
			kg2 = lb2 / 2.2;
			System.out.printf("\n"+kg1+"\t\t%.1f\t"+lb2+"\t%.2f",lb1,kg2);
			kg1 += 2;
			lb2 += 5;
		}
	}
}
