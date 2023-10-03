// Fan.java by Donato Zampin SB ID 114849209

public class Fan {
	final private int SLOW = 1;
	final private int MEDIUM = 2;
	final private int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	public Fan() { }
	public int getSpeed() {
		return speed;
	}
	public boolean getOn() {
		return on;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public void setSpeed(int speed) {
		if(speed == 1)
			this.speed = SLOW;
		else if(speed == 2)
			this.speed = MEDIUM;
		else if(speed == 3)
			this.speed = FAST;
	}
	public void setOn(boolean on) {
		if(on)
			this.on = true;
		else
			this.on = false;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		if(on)
			return "Speed: "+speed+", color: "+color+", and radius: "+radius;
		else
			return "Color: "+color+", radius: "+radius+", and fan is off";
	}
	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		System.out.println(fan1.toString() + ".");
		System.out.print(fan2.toString() + ".");
	}
}
