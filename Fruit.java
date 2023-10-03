// Fruit.java by Donato Zampini SB ID 114849209

public class Fruit extends Food {
	private String season;
	public Fruit(String des, int cals, String season) {
		super(des, cals);
		this.season = season;
	}
	public String getSeason() { return season; }
	public void setSeason(String season) { this.season = season; }
	public int calsPerServe(int serves) {
		return this.getCals() * serves;
	}
	public boolean equals(Fruit yum) {
		if(this.getDes().equals(yum.getDes())&&
				this.getCals()==yum.getCals()&&
				season.equals(yum.getSeason()))
			return true;
		else
			return false;
	}
	public boolean equals(LiquidFood yum) { return false; }
	public String toString() {
		return this.getDes()+", which grows in "+season+", and has "
				+this.getCals()+" calories per serving";
	}
}