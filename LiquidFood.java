// LiquidFood.java by Donato Zampini SB ID 114849209

public class LiquidFood extends Food {
	private double vis = 0.89; //Default is vis of water in cP
	public LiquidFood(String des, int cals) {
		super(des, cals);
	}
	public LiquidFood(String des, int cals, double vis) {
		super(des, cals);
		this.vis = vis;
	}
	public double getVis() { return vis; }
	public void setVis(double vis) { this.vis = vis; }
	public int calsPerServe(int serves) { 
		return this.getCals() * serves;
	}
	public boolean equals(LiquidFood yum) {
		if(this.getCals()==yum.getCals()&& 
				this.getDes().equals(yum.getDes())&&vis == yum.getVis())
			return true;
		else
			return false;
	}
	public boolean equals(Fruit yum) { return false; }
	public String toString() {
		return this.getDes()+" which has "+vis+" poise and "
				+this.getCals()+" calories per serving";
	}
}