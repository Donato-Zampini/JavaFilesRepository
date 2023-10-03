// DistinctNumbers.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class DistinctNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int check, count = 0;
		int[] i = new int[10];
		System.out.print("Enter ten integers: ");
		for (int x=0; x<i.length; x++) {
			check = input.nextInt();
			if(isUnique(i,check)) {
				i[count] = check;
				count++;
			}
		}
		System.out.print("The unique numbers are: ");
		for(int x=0; x < i.length; x++) {
			if (i[x] > 0)
				System.out.print(" " + i[x]);
		}
	}
	public static boolean isUnique(int[] list, int n) {
		for(int i = 0; i<list.length; i++)
			if(list[i] == n)
				return false;
		return true;
	}
}