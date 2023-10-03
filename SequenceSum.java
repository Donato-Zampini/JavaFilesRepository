// SequenceSum.java by Donato Zampini SB ID 114849209

public class SequenceSum {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++)
			System.out.println(m(i));
	}
	public static double m(int i) {
		if(i == 1)
			return 1.0;
		else
			return 1/((double)i) + (m(i-1));
	}
}
