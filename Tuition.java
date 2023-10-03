// Tuition.java by Donato Zampini SB ID 114849209

public class Tuition {
	public static void main(String[] args) {
		double tuition = 10000, sum = 0;
		for(int i = 0; i < 14; i++) {
			tuition *= 1.05;
			if(i > 9)
				sum += tuition;
		}
		System.out.printf("Cost of four years' tuition, from year 11-14: $%.2f",sum);
	}
}