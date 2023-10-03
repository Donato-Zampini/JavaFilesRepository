// CookingRecipe.java by Donato Zampini SB ID 114849209
import java.util.ArrayList;

public class CookingRecipe {
	private String name;
	private ArrayList<RecipeIngredient> list = new 
			ArrayList<RecipeIngredient>();
	public CookingRecipe(String name) {
		this.name = name;
	}
	public String getName() { return name; }
	public void addOrUpdateRecipeIngredient(Ingredient ingredient,
			float quantity) {
		boolean checker = true, checkX2 = true;
		RecipeIngredient addMaybe = new 
				RecipeIngredient(ingredient, quantity);
		if (list.isEmpty()) {
			list.add(addMaybe);
			checkX2 = false;
		}
		else
			for(int i = 0; i < list.size(); i++)
				if(list.get(i).getIng().equals(addMaybe.getIng())) {
					list.set(i, addMaybe);
					checker = false;
				}
		if(checker && checkX2)
			list.add(addMaybe);
	}
	public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
		for(int i = 0; i < list.size(); i++)
			if(list.get(i).getIng().equals(ingredient))
				return list.get(i);
		return null;
	}
	public RecipeIngredient getRecipeIngredient(String ingredientName) {
		for(int i = 0; i < list.size(); i++)
			if(list.get(i).getName().equals(ingredientName))
				return list.get(i);
		return null;
	}
	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient)
	{
		for(int i = 0; i < list.size(); i++)
			if(list.get(i).getIng().equals(ingredient)) {
				RecipeIngredient no = list.get(i);
				list.remove(i);
				return no;
			}
		return null;
	}
	public RecipeIngredient removeRecipeIngredient(String ingredientName)
	{
		for(int i = 0; i < list.size(); i++)
			if(list.get(i).getName().equals(ingredientName)) {
				RecipeIngredient no = list.get(i);
				list.remove(i);
				return no;
			}
		return null;
	}
	public float calculateCalories() {
		float sum = 0;
		for(int i = 0; i < list.size(); i++)
			sum += list.get(i).getQuantity() * list.get(i).getCals();
		return sum;
	}
	public int getNumberOfIngredients() { return list.size(); }
	public ArrayList<RecipeIngredient> getList() { return list; }
	public boolean contains(RecipeIngredient[] ingredients) {
		for(int i = 0; i < ingredients.length; i++)
			if(!list.contains(ingredients[i]))
				return false;
		return true;
	}
	public boolean equals(Object yum) {
		if(yum instanceof CookingRecipe)
			return name.equals(((CookingRecipe)yum).getName());
		else
			return false;
	}
	public String toString() {
		String yum = "Cooking Recipe\nName: "+name + "\n\n";
		for(int i = 0; i < list.size(); i++) {
			if(i != list.size()-1)
				yum += list.get(i).toString()+"\n\n";
			else if (i == list.size()-1)
				yum += list.get(i).toString()+".";
		}
		yum += "\n\n";
		return yum;
	}
}
