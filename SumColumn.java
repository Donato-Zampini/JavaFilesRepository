// SumColumn.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class SumColumn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, m;
		double[][] list;
		System.out.print("Enter the dimensions of an n x m matrix: ");
		n = input.nextInt();
		m = input.nextInt();
		list = new double[n][m];
		System.out.println("Enter the matrix of "+n+" x "+m+":");
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				list[i][j] = input.nextDouble();
		System.out.println("The sums of the columns are: ");
		for(int c = 0; c < m; c++)
			System.out.print(""+sumColumn(list,c)+" ");
		input.close();
	}
	public static double sumColumn(double[][] m, int c) {
		double sum = 0;
		for(int i = 0; i < m.length; i++)
			sum += m[i][c];
		return sum;
	}
}
