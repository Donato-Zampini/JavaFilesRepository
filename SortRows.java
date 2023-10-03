// SortRows.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class SortRows {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row:");
		double[][] cows = new double[3][3];
		for(int i = 0; i < cows.length; i++)
			for(int j = 0; j < cows[0].length; j++)
				cows[i][j] = input.nextDouble();
		double[][] print = sortRows(cows);
		System.out.println("The row-sorted array is:");
		print(print);
		System.out.println("The original array is:");
		print(cows);
		input.close();
	}
	public static void print(double[][] list) {
		for(int i = 0; i<list.length; i++) {
			for(int j = 0; j<list[i].length; j++) {
				if(j<list[i].length-1)
					System.out.print(list[i][j]+" ");
				else
					System.out.println(list[i][j]);
			}
		}
	}
	public static double[] bubbleSort(double[] list) {
		boolean changed = true;
		double temp = 0;
		double[] maybe = list;
		while(changed) {
			changed = false;
			for (int j = 0; j < maybe.length - 1; j++) {
				if (maybe[j] > maybe[j + 1]) {
					temp = maybe[j];
					maybe[j] = maybe[j+1];
					maybe[j+1] = temp;
					changed = true;
				}
			}
		}
		return maybe;
	}
	public static double[][] sortRows(double[][] m) {
		double[][] what = new double[m.length][m[0].length];
		for(int i = 0; i < what.length; i++)
			for(int j = 0; j < what[0].length; j++)
				what[i][j] = m[i][j];
		for(int i = 0; i < what.length; i++)
			what[i] = bubbleSort(what[i]);
		return what;
	}
}
