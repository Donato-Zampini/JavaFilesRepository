// Food.java by Donato Zampini SB ID 114849209

public abstract class Food {
	private String des;
	private int cals;
	protected Food(String des, int cals) {
		this.des = des;
		this.cals = cals;
	}
	public int getCals() { return cals; }
	public String getDes() { return des; }
	public void setCals(int cals) { this.cals = cals; }
	public void setDes(String des) { this.des = des; }
	public boolean equals(Food yum) {
		if(des.equals(yum.getDes()) && cals == yum.getCals())
			return true;
		else
			return false;
	}
	public String toString() {
		return des + " which has "+cals+" calories per serving";
	}
	public abstract int calsPerServe(int serves);
	public static void main(String[] args) {
		LiquidFood soda = new LiquidFood("A sugary drink",300,1.49);
		LiquidFood water = new LiquidFood("Water",0);
		LiquidFood lakeWater = new LiquidFood("Water",0,0.89);
		Fruit apple = new Fruit("Apple",50,"Fall");
		Fruit pear = new Fruit("Pear",40,"Spring");
		Fruit bigApple = new Fruit("Apple",50,"Fall");
		System.out.println(soda.toString());
		System.out.println(water.equals(lakeWater));
		lakeWater.setDes("DO NOT DRINK! TOXIC!");
		System.out.println(lakeWater.toString());
		System.out.println(apple.equals(bigApple));
		System.out.println(apple.calsPerServe(3));
		bigApple.setSeason("Spring");
		System.out.println(bigApple.getSeason());
		System.out.println(pear.getCals());
		soda.setCals(50);
		soda.setDes("Sweet food");
		apple.setDes("Sweet food");
		soda.setVis(3);
		System.out.println(soda.getVis());
		System.out.println(apple.equals(soda));
	}
}