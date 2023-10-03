// Rectangle.java from class slides

public class Rectangle extends GeometricObject {
private double width;
private double height;
public Rectangle() {
// super();
}
public Rectangle(double width, double height) {
this();
this.width = width;
this.height = height;
}
public Rectangle(double width, double height, String color,
boolean filled) {
super(color,filled);
this.width = width;
this.height = height;
}
public double getWidth() { return width; }
public void setWidth(double width) { this.width = width; }
public double getHeight() { return height; }
public void setHeight(double height) { this.height = height; }
public double getArea() {
return width * height;
}
public double getPerimeter() {
return 2 * (width + height);
}
public int compareTo(Object o) {
	if(o instanceof Rectangle) {
		if(getArea() > ((Rectangle)o).getArea())
			return 1;
		else if(((Rectangle)o).getArea() > getArea())
			return -1;
		return 0;
	}
	else
		return -3;
}
public String toString() {
	return "Rectangle with area: "+getArea();
}
}