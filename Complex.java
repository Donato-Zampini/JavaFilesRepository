// Complex.java by Donato Zampini SB ID 114849209
import java.util.Scanner;

public class Complex {
	private double realPart = 0, imaginaryPart = 0;
	public Complex() { }
	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	public static Complex addComplex(Complex num1, Complex num2) {
		double newReal, newImaginary;
		newReal = num1.getReal() + num2.getReal();
		newImaginary = num1.getImaginary() + num2.getImaginary();
		return new Complex(newReal, newImaginary);
	}
	public static Complex subComplex(Complex num1, Complex num2) {
		double newReal, newImaginary;
		newReal = num1.getReal() - num2.getReal();
		newImaginary = num1.getImaginary() - num2.getImaginary();
		return new Complex(newReal, newImaginary);
	}
	public double getReal() {
		return realPart;
	}
	public double getImaginary() {
		return imaginaryPart;
	}
	public static void print(Complex num) {
		System.out.println("("+num.getReal()+", "+num.getImaginary()+")");
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double real, imagine;
		System.out.print("Enter real part of the first complex number: ");
		real = input.nextDouble();
		System.out.print("Enter imaginary part of the first complex number: ");
		imagine = input.nextDouble();
		Complex num1 = new Complex(real, imagine);
		System.out.print("Enter real part of the second complex number: ");
		real = input.nextDouble();
		System.out.print("Enter imaginary part of the second complex number: ");
		imagine = input.nextDouble();
		Complex num2 = new Complex(real, imagine);
		System.out.print("First complex number is: ");
		print(num1);
		System.out.print("Second complex number is: ");
		print(num2);
		System.out.print("Addition of the complex numbers is: ");
		print(addComplex(num1, num2));
		System.out.print("Subtraction of the complex numbers is: ");
		print(subComplex(num1, num2));
		input.close();
	}
}
