// package SteppingStones;

import java.util.ArrayList;
import SteppingStone.*;// import our stepping stone package

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class SteppingStone5_RecipeTest {

	/**
 	* @param args the command line arguments
 	*/
	public static void main(String[] args) {
		// Create two recipe objects first
		SteppingStone5_Recipe myFirstRecipe = new SteppingStone5_Recipe();// create first steppingStone object

		ArrayList<String> recipeIngredients = new ArrayList<String>(); 
		ArrayList<String> recipeIngredientsTwo = new ArrayList<String>(); 
		String ingredientName = "Anchovies";
		// Ingredient tempIngredient = new Ingredient().addNewIngredient(ingredientName);
		recipeIngredients.add(ingredientName);
      // create second stepping stone object
    	SteppingStone5_Recipe mySecondRecipe = new SteppingStone5_Recipe("Pizza", 2, recipeIngredients, 300.00);
   	 
    	// Initialize first recipe
		String ingredientNameTwo = "Noodles";
		// Ingredient tempIngredientTwo = new Ingredient().addNewIngredient(ingredientNameTwo);
		recipeIngredientsTwo.add(ingredientNameTwo);

    	myFirstRecipe.setRecipeName("Ramen");
    	myFirstRecipe.setServings(2);
    	myFirstRecipe.setRecipeIngredients(recipeIngredientsTwo);
    	myFirstRecipe.setTotalRecipeCalories(150.00);
   	 
    	// Print details of both recipes
    	myFirstRecipe.printRecipe();
    	mySecondRecipe.printRecipe();
	}
    
}
