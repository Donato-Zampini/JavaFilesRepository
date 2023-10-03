// Bicycle.java by Donato Zampini SB ID 114849209

public class Bicycle extends Vehicle{
	public Bicycle(String owner) {
		super(owner, 2);
	}
	public Bicycle(String owner, int wheels) {
		super(owner, wheels);
	}
	public boolean equals(Bicycle obj) {
		if(this.getOwner().equals(obj.getOwner()) && 
				this.getWheels() == obj.getWheels())
			return true;
		else
			return false;
	}
	public boolean equals(Vehicle obj) {
		if(obj instanceof Bicycle) {
			if(this.getOwner().equals(obj.getOwner()) && 
				this.getWheels() == obj.getWheels())
				return true;
			else
				return false;
		}
		else
			return false;
	}
	public String toString() {
		return this.getOwner()+" has a "+this.getWheels()
		+"-wheeled bicycle";
	}
}
