// Factorial.java by Donato Zampini SB ID 114849209

public class Factorial {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++)
			System.out.println(factorial(i));
	}
	public static long factorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * factorial(n-1);
	}
}
