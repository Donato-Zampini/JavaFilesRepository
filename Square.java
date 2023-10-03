// Square.java by Donato Zampini SB ID 114849209

public class Square extends GeometricObject implements Colorable {
	private double side = 1;
	public Square() { super(); }
	public Square(double side) {
		super();
		this.side = side;
	}
	public Square(double side, String color, boolean filled) {
		super(color, filled);
		this.side = side;
	}
	public double getArea() {
		return side*side;
	}
	public double getPerimeter() {
		return side*4;
	}
	public void howToColor() {
		System.out.println("Color inside the lines");
	}
	public Square clone() {
		Square g = (Square) super.clone();
		return g;
	}	
	public int compareTo(GeometricObject g) {
		if(getArea() > g.getArea())
			return 1;
		else if(g.getArea() > getArea())
			return -1;
		return 0;
	}
	public int compareTo(Object o) {
		if(o instanceof GeometricObject) {
			if(getArea() > ((GeometricObject)o).getArea())
				return 1;
			else if(((GeometricObject)o).getArea() > getArea())
				return -1;
			return 0;
		}
		else
			return -3;
	}
	public static GeometricObject max(GeometricObject g1, GeometricObject g2) {
		if(g1.compareTo(g2) > 0)
			return g1;
		else
			return g2;
	}
	public static void main(String[] args) {
		GeometricObject[] array = new GeometricObject[5];
		array[0] = new Square();
		array[1] = new Square(2);
		array[2] = new Square(3, "blue", true);
		array[3] = new Square(4, "green", false);
		array[4] = new Square(3, "blue", false);
		array[0].howToColor();
		array[1].howToColor();
		array[2].howToColor();
		array[3].howToColor();
		array[4].howToColor();
	}
}
