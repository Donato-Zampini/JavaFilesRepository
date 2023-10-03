// GeometricObject.java from Class Slides

public abstract class GeometricObject implements Cloneable, Comparable{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	protected GeometricObject(String color, boolean filled) {
		this();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
	public boolean isFilled() { return filled; }
	public void setFilled(boolean filled) { this.filled = filled; }
	public java.util.Date getDateCreated() { return dateCreated; }
	public String toString() {
		return "color: " + color + ", filled: " + filled
				+ ", created on " + dateCreated;
	}
	public void howToColor() {
		System.out.print("Color in the lines");
	}
	public GeometricObject clone() {
		try {
			GeometricObject g = (GeometricObject) super.clone();
			return g;
		}catch (CloneNotSupportedException e) {
			return null;
		}
	}
	public int compareTo(GeometricObject g) {
		if(getArea() > g.getArea())
			return 1;
		else if(g.getArea() > getArea())
			return -1;
		return 0;
	}
	public static GeometricObject max(GeometricObject g1, GeometricObject g2) {
		if(g1.compareTo(g2) > 0)
			return g1;
		else
			return g2;
	}
	/** Abstract method getArea */
	public abstract double getArea();
	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
}



