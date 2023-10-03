// TestRecipeBook.java by Donato Zampin SB ID 114849209

public class TestRecipeBook {
	public static void main(String[] args) {
		final String F = "flour";
		final String FLOZ = "fluid ounce";
		final String G = "gram";
		final String E = "eggs";
		final String W = "water";
		final String T = "tomatoes";
		final String S = "sugar";
		final String C = "chocolate";
		final String M = "milk";
		final String B = "batter";
		Ingredient yum1 = new Ingredient(F,G,5);
		Ingredient yum2 = new Ingredient(F,G,5);
		Ingredient yum3 = new Ingredient(E,G,10);
		Ingredient yum4 = new Ingredient(W,FLOZ,0);
		Ingredient yum5 = new Ingredient(T,G,8);
		Ingredient yum7 = new Ingredient(S,G,20);
		Ingredient yum8 = new Ingredient(C,FLOZ,12);
		RecipeIngredient what1 = new RecipeIngredient(yum1,10);
		RecipeIngredient what2 = new RecipeIngredient(F,G,5,10);
		RecipeIngredient eggs = new RecipeIngredient(yum3,10);
		RecipeIngredient what4 = new RecipeIngredient(yum4,10);
		RecipeIngredient choc = new RecipeIngredient(yum8,10);
		RecipeIngredient milk = new RecipeIngredient(M,FLOZ,5,20);
		RecipeIngredient batter = new RecipeIngredient(B,FLOZ,10,30);
		RecipeIngredient butter = new RecipeIngredient("butter",G,15,20);
		CookingRecipe pasta = new CookingRecipe("Pasta");
		CookingRecipe pasta2 = new CookingRecipe("Pasta");
		CookingRecipe sauce = new CookingRecipe("Sauce");
		CookingRecipe cookies = new CookingRecipe("Cookies");
		CookingRecipe cake = new CookingRecipe("Cake");
		RecipeBook italian = new RecipeBook("Italian");
		RecipeBook italian2 = new RecipeBook("Italian");
		RecipeBook desserts = new RecipeBook("Desserts");
		System.out.println(yum1.getName()); //check getName
		System.out.println(yum2.getUnit()); //check getUnit
		System.out.println(yum3.getCals()); //check getCals
		System.out.println(yum4.equals(yum3)); // check equals
		System.out.println(yum3.equals(yum2));
		System.out.println(yum2.equals(yum1));
		System.out.println(yum2.toString()); //check toString
		System.out.println(what1.getQuantity()); //check getQuantity
		System.out.println(eggs.getIng().toString()); //check getIng
		System.out.println(what2.equals(what1)); //check equals
		System.out.println(eggs.equals(what2));
		System.out.println(what4.toString()); //check toString
		pasta.addOrUpdateRecipeIngredient(yum1,10); //check addOrUpdate
		pasta.addOrUpdateRecipeIngredient(yum3,10);
		pasta.addOrUpdateRecipeIngredient(yum4,10);
		pasta2.addOrUpdateRecipeIngredient(yum2,11);
		pasta2.addOrUpdateRecipeIngredient(yum3,10);
		pasta2.addOrUpdateRecipeIngredient(yum4,10);
		sauce.addOrUpdateRecipeIngredient(yum5,20);
		sauce.addOrUpdateRecipeIngredient(yum4,40);
		cookies.addOrUpdateRecipeIngredient(eggs, 10);
		cookies.addOrUpdateRecipeIngredient(choc, 5);
		cookies.addOrUpdateRecipeIngredient(milk, 10);
		cookies.addOrUpdateRecipeIngredient(butter, 20);
		cake.addOrUpdateRecipeIngredient(batter, 30);
		cake.addOrUpdateRecipeIngredient(milk, 20);
		cake.addOrUpdateRecipeIngredient(butter, 20);
		System.out.println(pasta.toString()); //check toString
		System.out.println(pasta.getName()); //check getName
		pasta.addOrUpdateRecipeIngredient(yum2, 11); //check addUpdate
		pasta.addOrUpdateRecipeIngredient(yum7, 10);
		System.out.println(pasta.toString()); //check toString
		System.out.println(pasta.equals(pasta2)); //check equals
		System.out.println(pasta.equals(sauce));
		System.out.println(pasta.getRecipeIngredient(yum2)); //check getRecipeIng
		System.out.println(pasta.getRecipeIngredient("water"));
		System.out.println(pasta.removeRecipeIngredient(yum7)); //check removeRecipeIng
		System.out.println(pasta.removeRecipeIngredient("sugar"));
		System.out.println(pasta.calculateCalories()); //check calculateCals
		System.out.println(pasta.getNumberOfIngredients()); //check getNumOfIngs
		System.out.println(pasta.getList()); //check getList
		RecipeIngredient[] ings = new RecipeIngredient[pasta.getList().size()];
		for(int i = 0; i < ings.length; i++)
			ings[i] = pasta.getList().get(i);
		System.out.println(pasta2.contains(ings)); //check contains
		italian.addRecipe("Pasta", ings); //check addRecipe
		italian2.addRecipe("Pasta", ings);
		italian.addRecipe(sauce);
		italian2.addRecipe(sauce);
		desserts.addRecipe(cake);
		desserts.addRecipe(cookies);
		desserts.addRecipe(sauce);
		System.out.println(desserts); //check toString
		System.out.println(desserts.removeRecipe("Sauce")); //check removeRecipe
		System.out.println(desserts.removeRecipe("Sauce"));
		System.out.println(italian.findRecipes(ings)[0]); //check findRecipes
		System.out.println(desserts.findRecipes(ings));
		System.out.println(italian.findRecipesWithFewIngredients(2)[0]);//check findRecWiFewIngs
		System.out.println(desserts.findRecipesWithFewIngredients(3)[0]);
		System.out.println(italian.findRecipesWithFewIngredients(1));
		System.out.println(italian.findRecipesLowCalories()[0]); //check findRecWiLowCals
		System.out.println(desserts.findRecipesLowCalories()[0]);
		System.out.println(italian.equals(italian2));//check equals
		System.out.println(italian.equals(desserts));
	}
}
