// RecipeIngredient.java by Donato Zampini SB ID 114849209

public class RecipeIngredient extends Ingredient {
	private float quantity;
	public RecipeIngredient(String name, String measuringUnit,
			int caloriesPerUnit, float quantity) {
		super(name, measuringUnit, caloriesPerUnit);
		this.quantity = quantity;
	}
	public RecipeIngredient(Ingredient ingredient, float quantity) {
		super(ingredient.getName(),ingredient.getUnit(),
				ingredient.getCals());
		this.quantity = quantity;
	}
	public float getQuantity() { return quantity; }
	public Ingredient getIng() { 
		return new Ingredient (this.getName(), this.getUnit(),
				this.getCals());
	}
	public boolean equals(Object yum) {
		if(yum instanceof RecipeIngredient)
			if(((RecipeIngredient)yum).getIng().equals(this.getIng()))
				if(((RecipeIngredient)yum).getQuantity()==this.getQuantity())
					return true;
		return false;
	}
	public String toString() {
		return "Recipe "+super.toString()+"\nquantity="+quantity;
	}
}
