// MultiplyMatrix.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class MultiplyMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] m1 = new double[3][3];
		double[][] m2 = new double[3][3];
		System.out.println("Enter matrix 1:");
		for(int i = 0; i < m1.length; i++)
			for(int j = 0; j <m1[i].length; j++)
				m1[i][j] = input.nextDouble();
		System.out.println("Enter matrix 2:");
		for(int i = 0; i < m2.length; i++)
			for(int j = 0; j <m2[i].length; j++)
				m2[i][j] = input.nextDouble();
		System.out.println("Multiplication of the matrices is:");
		print(multiplyMatrix(m1,m2));
		input.close();
	}
	public static double[][] multiplyMatrix(double [][] a,double[][] b) {
		double[][] c = new double[a.length][b[0].length];
		int ro = 0, co = 0;
		double enter = 0;
		while ((ro+1)*(co+1) <= c.length*c[0].length) {
			if(ro == co) {
				for(int j = 0; j < b.length; j++)
					enter += a[ro][j] * b[j][co];
				c[ro][co] = enter;
				co++;
			}
			else {
				if(co > c[0].length-1 && ro < c.length-1) {
					co = 0;
					ro++;
				}
				for(int j = 0; j < b.length; j++)
					enter += a[ro][j] * b[j][co];
				c[ro][co] = enter;
				co++;
			}
			enter = 0;
		}
		return c;
	}
	public static void print(double[][] list) {
		for(int i = 0; i<list.length; i++) {
			for(int j = 0; j<list[i].length; j++) {
				if(j<list[i].length-1)
					System.out.printf("%.1f ",list[i][j]);
				else
					System.out.printf("%.1f\n",list[i][j]);
			}
		}
	}
}