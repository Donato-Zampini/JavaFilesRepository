// Emirp.java by Donato Zampini SB ID 114849209

public class Emirp {
	public static void main(String[] args) {
		int count = 0, check = 13;
		while (count < 100) {
			if(non_palindrome(check) && prime(check) && prime(reverse(check))) {
				System.out.print(check + " ");
				count++;
			}
			check++;
		}
	}
	public static boolean non_palindrome(int n) {
		int rev = reverse(n);
		if (rev == n)
			return false;
		else
			return true;
	}
	public static boolean prime(int n) {
		int x=1, i=2;
		while (x > 0 && i < n) {
			x = n % i;
			i++;
		}
		if (n==2)
			return true;
		else if (x>0)
			return true;
		else
			return false;
	}
	public static int reverse(int n) {
		int digits=0, temp=0, x=n, rev=0;
		while (x >= 1) {
			x = x/10;
			digits++;
		}
		temp = n;
		for(int i = 1; i <= digits; i++) {
			x = temp%10;
			temp = temp / 10;
			rev += x * (Math.pow(10, digits - i));
		}
		return rev;
	}
}
