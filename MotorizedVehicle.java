// MotorizedVehicle.java by Donato Zampini SB ID 114849209

public class MotorizedVehicle extends Vehicle {
	private double evp = 2;
	public MotorizedVehicle(String owner) {
		super(owner, 4);
	}
	public MotorizedVehicle(String owner, int wheels) {
		super(owner, wheels);
	}
	public MotorizedVehicle(String owner, int wheels, double evp) {
		super(owner, wheels);
		this.evp = evp;
	}
	public MotorizedVehicle(Vehicle obj) {
		super(obj.getOwner(), obj.getWheels());
	}
	public double getEVP() { return evp; }
	public void setEVP(double evp) { this.evp = evp; }
	public double getHorsePower() { return evp * this.getWheels(); }
	public boolean equals(MotorizedVehicle obj) {
		if(this.getOwner().equals(obj.getOwner()) && this.getWheels() ==
				obj.getWheels() && evp == obj.getEVP())
			return true;
		else
			return false;
	}
	public boolean equals(Vehicle obj) {
		if(obj instanceof MotorizedVehicle) {
			MotorizedVehicle che = new MotorizedVehicle(obj);
			if(this.getOwner().equals(che.getOwner()) && this.getWheels() ==
					che.getWheels() && evp == che.getEVP())
				return true;
			else
				return false;
		}
		else
			return false;
	}
	public String toString() {
		return this.getOwner()+" has a "+this.getWheels()+
				"-wheeled motorized vehicle "
				+"with an engine volume displacement of "+evp+" liters";
	}
}
