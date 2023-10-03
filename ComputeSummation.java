// ComputeSummation.java by Donato Zampini SB ID 114849209

public class ComputeSummation {
	public static void main(String[] args) {
		System.out.println("i\tm(i)");
		for(int i=1; i<=20; i++)
			System.out.printf(i+"\t%.4f\n", sum(i));
	}
	public static double sum(int i) {
		double sum = 0;
		for(int x=1; x<=i; x++)
			sum += (double)x/(double)(x+1);
		return sum;
	}
}
