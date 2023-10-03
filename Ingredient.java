// Ingredient.java by Donato Zampini SB ID 114849209

public class Ingredient {
	private String name, unit;
	private int calsPerUnit;
	public Ingredient(String name, String measuringUnit,
			int caloriesPerUnit) {
		this.name = name;
		unit = measuringUnit;
		calsPerUnit = caloriesPerUnit;
	}
	public String getName() { return name; }
	public String getUnit() { return unit; }
	public int getCals() { return calsPerUnit; }
	public boolean equals(Object o) {
		if(o instanceof Ingredient) {
			if(this.name.equals(((Ingredient)o).getName()))
				if(this.unit.equals(((Ingredient)o).getUnit()))
					if(this.calsPerUnit == ((Ingredient)o).getCals())
						return true;
		}
		return false;
	}
	public String toString() {
		return "Ingredient\n"+ "name=" + name + "\n" + "measuringUnit="
				+ unit + "\n" + "caloriesPerUnit=" + calsPerUnit;
	}
}