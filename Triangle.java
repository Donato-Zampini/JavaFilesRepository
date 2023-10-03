// Triangle.java by Donato Zampini SB ID 114849209

public class Triangle extends GeometricObject{
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	public Triangle() { }
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		this();
		if (side1+side2>side3&&side1+side3>side2&&side2+side3>side1) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		else
			throw new IllegalTriangleException();
	}
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1() { return side1; }
	public double getSide2() { return side2; }
	public double getSide3() { return side3; }
	public double getArea() {
		double s = 0.5 * (side1 + side2 + side3);
		return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
	}
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	public String toString() {
		return "This triangle has side lengths "+side1+", "+side2
				+", and "+side3+", with color "+getColor()+ " and filled: "
				+ isFilled();
	}
	public static void main(String[] args) {
		try {
			Triangle t1 = new Triangle(1, 3, 1);
		} catch(IllegalTriangleException e) {
			System.out.print(e);
		}
	}
}
