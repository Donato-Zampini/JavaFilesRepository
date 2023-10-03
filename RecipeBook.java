// RecipeBook.java by Donato Zampini SB ID 114849209
import java.util.ArrayList;

public class RecipeBook {
	private String name;
	private ArrayList<CookingRecipe> list = new
			ArrayList<CookingRecipe>();
	public RecipeBook(String bookName) { this.name = bookName; }
	public String getName() { return name; }
	public CookingRecipe addRecipe(String name,
			RecipeIngredient[] ingredients) {
		CookingRecipe addMaybe = new CookingRecipe(name);
		for(int i = 0; i < ingredients.length; i++)
			addMaybe.addOrUpdateRecipeIngredient(ingredients[i].getIng(),
					ingredients[i].getQuantity());
		if(list.isEmpty()) {
			list.add(addMaybe);
			return addMaybe;
		}
		for(int i = 0; i < list.size(); i++)
			if(list.get(i).equals(addMaybe))
				return null;
		list.add(addMaybe);
		return addMaybe;
	}
	public CookingRecipe addRecipe(CookingRecipe addMaybe) {
		CookingRecipe new1 = new CookingRecipe(addMaybe.getName());
		for(int i = 0; i < addMaybe.getList().size(); i++)
			new1.addOrUpdateRecipeIngredient(addMaybe.getList().get(i).getIng(),
					addMaybe.getList().get(i).getQuantity());
		if(list.isEmpty()) {
			list.add(addMaybe);
			return new1;
		}
		for(int i = 0; i < list.size(); i++)
			if(list.get(i).equals(addMaybe))
				return null;
		list.add(addMaybe);
		return new1;
	}
	public CookingRecipe removeRecipe(String name) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				CookingRecipe yuck = list.get(i);
				list.remove(i);
				return yuck;
			}
		}
		return null;
	}
	public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
		ArrayList<CookingRecipe> find = new ArrayList<CookingRecipe>();
		boolean justInCase = true;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).contains(ingredients)) {
				find.add(list.get(i));
				justInCase = false;
			}
		}
		if (justInCase)
			return null;
		CookingRecipe[] yum = new CookingRecipe[find.size()];
		for(int i = 0; i < yum.length; i++)
			yum[i] = find.get(i);
		return yum;
	}
	public CookingRecipe[] findRecipesWithFewIngredients(int 
			numberOfIngredients) {
		ArrayList<CookingRecipe> find = new ArrayList<CookingRecipe>();
		boolean justInCase = true;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getNumberOfIngredients() <=
					numberOfIngredients) {
				find.add(list.get(i));
				justInCase = false;
			}
		}
		if (justInCase)
			return null;
		CookingRecipe[] yum = new CookingRecipe[find.size()];
		for(int i = 0; i < yum.length; i++)
			yum[i] = find.get(i);
		return yum;
	}
	public CookingRecipe[] findRecipesLowCalories() {
		ArrayList<CookingRecipe> find = new ArrayList<CookingRecipe>();
		find.add(list.get(0));
		CookingRecipe temp = list.get(0);
		float check = list.get(0).calculateCalories();
		for(int i = 1; i < list.size(); i++)
			if(list.get(i).calculateCalories()<=temp.calculateCalories()) {
				find.add(list.get(i));
				check = list.get(i).calculateCalories();
				temp = list.get(i);
			}
		for(int i = 0; i < find.size(); i++)
			if(find.get(i).calculateCalories() > check)
				find.remove(i);
		CookingRecipe[] yum = new CookingRecipe[find.size()];
		for(int i = 0; i < yum.length; i++)
			yum[i] = find.get(i);
		return yum;
	}
	public boolean equals(Object yum) {
		if(yum instanceof RecipeBook)
			return name.equals(((RecipeBook)yum).getName());
		else return false;
	}
	public String toString() {
		String yum = "Recipe Book\nName: "+name + "\n\n";
		for(int i = 0; i < list.size(); i++)
			yum += list.get(i).toString()+"\n";
		return yum;
	}
}
