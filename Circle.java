// Circle.java from class slides

public class Circle extends GeometricObject {
private double radius;
public Circle() { }
public Circle(double radius) {
this.radius = radius;
}
public double getRadius() {
return radius;
}
public void setRadius(double radius) {
this.radius = radius;
}
public String toString() {
return "Circle with radius is " + radius + ", " + super.toString();
}
public double getArea() {
return radius * radius * Math.PI;
}
public double getPerimeter() {
return 2 * radius * Math.PI;
}
public double getDiameter() {
return 2 * radius;
}
public int compareTo(Object o) {
	if(o instanceof Circle) {
		if(getArea() > ((Circle)o).getArea())
			return 1;
		else if(((Circle)o).getArea() > getArea())
			return -1;
		return 0;
	}
	else
		return -3;
}
}