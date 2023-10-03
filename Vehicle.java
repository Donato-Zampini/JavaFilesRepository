// Vehicle.java by Donato Zampini SB ID 114849209

public abstract class Vehicle {
	private String owner;
	private int wheels = 4;
	protected Vehicle(String owner) {
		this.owner = owner;
	}
	protected Vehicle(String owner, int wheels) {
		this.owner = owner;
		this.wheels = wheels;
	}
	public String getOwner() { return owner; }
	public int getWheels() { return wheels; }
	public void setOwner(String owner) { this.owner = owner; }
	public void setWheels(int wheels) { this.wheels = wheels; }
	public boolean equals(Vehicle obj) {
		if(obj.getOwner().equals(owner) && obj.getWheels() == wheels)
			return true;
		else
			return false;
	}
	public String toString() {
		return owner+" has a "+wheels+"-wheeled vehicle";
	}
	public static void main(String[] args) {
		Vehicle thing1 = new Bicycle("Andrew");
		Bicycle thing2 = new Bicycle("Andrew", 2);
		Vehicle thing3 = new MotorizedVehicle("John");
		Vehicle thing4 = new MotorizedVehicle("John", 4);
		Vehicle thing5 = new MotorizedVehicle("John", 4, 2);
		Vehicle thing6 = new Bicycle("George");
		Vehicle thing7 = new Bicycle("George", 3);
		Vehicle thing8 = new MotorizedVehicle("Carl");
		MotorizedVehicle thing9 = new MotorizedVehicle("Carl", 4);
		MotorizedVehicle thing10 = new MotorizedVehicle("Carl",5,3);
		System.out.println(thing1.toString()); //Bicycle toString
		System.out.println(thing1.getWheels()); //2
		System.out.println(thing3.getOwner()); //John
		System.out.println(thing4.equals(thing5)); //true
		System.out.println(thing6.equals(thing7)); //false
		System.out.println(thing10.toString()); //MV toString
		System.out.println(thing7.equals(thing8)); //false
		System.out.println(thing9.getHorsePower()); //8.0
		System.out.println(thing8.equals(thing9)); //true
		System.out.println(thing10.getHorsePower()); //15.0
		thing10.setWheels(4);
		thing9.setOwner("John");
		thing9.setEVP(10);
		thing1.setOwner("Andy");
		thing2.setWheels(4);
		thing5.setWheels(3);
		thing7.setOwner("John");
		System.out.println(thing10.toString()); //Check changes
		System.out.println(thing9.toString());
		System.out.println(thing1.toString());
		System.out.println(thing2.toString());
		System.out.println(thing5.equals(thing7));
	}
}