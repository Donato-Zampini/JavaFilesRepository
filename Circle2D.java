// Circle2D.java by Donato Zampini SB ID 114849209

public class Circle2D {
	private double x = 0, y = 0, rad = 1;
	public Circle2D() { }
	public Circle2D(double x, double y, double rad) {
		this.x = x;
		this.y = y;
		this.rad = rad;
	}
	public double getArea() {
		return Math.PI * Math.pow(rad, 2);
	}
	public double getPerimeter() {
		return Math.PI * 2 * rad;
	}
	public boolean contains(double x, double y) {
		double xsqr = Math.pow((x-this.x), 2);
		double ysqr = Math.pow((y-this.y), 2);
		double distance = Math.sqrt(xsqr + ysqr);
		if(distance < rad)
			return true;
		else
			return false;
	}
	public boolean contains(Circle2D circle) {
		double xsqr = Math.pow((circle.getX()-this.x), 2);
		double ysqr = Math.pow((circle.getY()-this.y), 2);
		double distance = Math.sqrt(xsqr + ysqr);
		if(distance > rad)
			return false;
		if(!this.contains(circle.getX(),circle.getY()))
			return false;
		if(distance + circle.getRad() <= this.rad)
			return true;
		else
			return false;
	}
	public boolean overlaps(Circle2D circle) {
		double xsqr = Math.pow((circle.getX()-this.x), 2);
		double ysqr = Math.pow((circle.getY()-this.y), 2);
		double distance = Math.sqrt(xsqr + ysqr);
		if(distance < rad + circle.getRad())
			return true;
		else
			return false;
	}
	public double getX() { return x; }
	public double getY() { return y; }
	public double getRad() { return rad; }
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2,2,5.5);
		System.out.println("Area: "+c1.getArea());
		System.out.println("Perimeter: "+c1.getPerimeter());
		System.out.println("Contains (3,3): "+c1.contains(3,3));
		System.out.println("Contains (4,5,10.5): "
				+c1.contains(new Circle2D(4,5,10.5)));
		System.out.println("Overlaps (3,5,2.3): "
				+c1.overlaps(new Circle2D(3,5,2.3)));
	}
}
