// Rational.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class Rational {
	private int num = 0, den = 1;
	public Rational(int num, int den) {
		while (GCD(Math.abs(num), Math.abs(den)) != 1) {
			int temp = num;
			num /= GCD(Math.abs(num),Math.abs(den));
			den /= GCD(Math.abs(temp),Math.abs(den));
		}
		if(den == 0)
			throw new ArithmeticException("Cannot have 0 in " 
					+"the denominator!");
		if(den < 0 && num < 0) {
			num *= -1;
			den *= -1;
		}
		this.num = num;
		this.den = den;
	}
	public Rational() {	}
	public Rational add(Rational no) {
		int newNum, newDen;
		if(this.den == no.getDen()) {
			newNum = this.num + no.getNum();
			newDen = this.den;
			return new Rational(newNum, newDen);
		}
		else {
			newDen = den * no.getDen();
			newNum = den * no.getNum() + num * no.getDen();
			return new Rational(newNum, newDen);
		}
	}
	public Rational sub(Rational no) {
		int newNum, newDen;
		if(this.den == no.getDen()) {
			newNum = this.num - no.getNum();
			newDen = this.den;
			return new Rational(newNum, newDen);
		}
		else {
			newDen = den * no.getDen();
			newNum = num * no.getDen() - den * no.getNum();
			return new Rational(newNum, newDen);
		}
	}
	public Rational mul(Rational no) {
		int newNum = num * no.getNum();
		int newDen = den * no.getDen();
		return new Rational(newNum, newDen);
	}
	public Rational div(Rational no) {
		int newNum = num * no.getDen();
		int newDen = den * no.getNum();
		return new Rational(newNum, newDen);
	}
	public void print() {
		System.out.print(num+"/"+den);
	}
	public String toString() {
		return num+"/"+den;
	}
	public static int GCD(int int1, int int2) {
		while(int2 != 0) {
			int t = int2;
			int2 = int1 % int2;
			int1 = t;
		}
		return int1;
	}
	public int getNum() { return num; }
	public int getDen() { return den; }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, den;
		Rational no1, no2;
		System.out.print("Enter numerator for the "
				+ "first rational number: ");
		num = input.nextInt();
		System.out.print("Enter a non-zero denominator "
				+ "for the first rational number: ");
		den = input.nextInt();
		no1 = new Rational(num, den);
		//Space just to differentiate between inputs
		System.out.print("Enter numerator for the second "
				+"rational number: ");
		num = input.nextInt();
		System.out.print("Enter a non-zero denominator "
				+ "for the second rational number: ");
		den = input.nextInt();
		no2 = new Rational(num, den);
		System.out.println("First rational number is: "+no1.toString());
		System.out.println("Second rational number is: "
		+no2.toString());
		System.out.print("Addition of the rational numbers is: ");
		System.out.println(no1.add(no2).toString());
		System.out.print("Subtraction of the rational numbers is: ");
		System.out.println(no1.sub(no2).toString());
		System.out.print("Multiplication of the rational numbers is: ");
		System.out.println(no1.mul(no2).toString());
		System.out.print("Division of the rational numbers is: ");
		System.out.println(no1.div(no2).toString());
		input.close();
	}
}
