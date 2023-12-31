package SteppingStones;

import java.util.Scanner;
import java.util.ArrayList;

public class SteppingStone5_Recipe {
    
    private String recipeName;
    
    /**
     * Add three variables:
     * 
     * 1. a variable 'servings' to store how many people the recipe will feed;
     *
     * 2. an ArrayList variable 'recipeIngredients' to store the text for the
     *      names (recipeName) each recipe ingredient added
     *
     * 3. a variable totalRecipeCalories 
     * 
     */ 
    
    
    /**
     * Add mutators and accessors for the class variable.
     * 
     */
     
    
    public SteppingStone5_Recipe() {
        this.recipeName = "";
        this.servings = ??? //<--- assignment value with appropriate data type
        this.recipeIngredients = ???; //<-- assignment value for empty ArrayList
        this.totalRecipeCalories = 0;
        
    }
    public SteppingStone5_Recipe(String recipeName, ??? servings, 
    	ArrayList<????> recipeIngredients, double totalRecipeCalories) 
    //<-- use appropriate data type for the ArrayList and the servings arguments
    {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    public void printRecipe() {
        /**
         * Declare an int variable singleServingCalories.
         * Assign singleServingCalories to
         * the totalRecipeCalories divided by the servings
         * 
         */
         

        /**
         * Print the following recipe information:
         *      Recipe: <<recipeName>>
         *      Serves: <<servings>>
         *      Ingredients:
         *      <<Ingredient1>>
         *      <<Ingredient2>>
         *      ...
         *      <<Last Ingredient>>
         *      
         *      Each serving has <<singleServingCalories>> Calories.
         *
         *      HINT --> Use a for loop to iterate through the ingredients   
         */
    }
    
    
    public static void main(String[] args) {
        ??? totalRecipeCalories = ???;
        ArrayList <String> recipeIngredients = new ArrayList();
        boolean addMoreIngredients = true;
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();
        
        System.out.println("Please enter the number of servings: ");
        //correct data type & Scanner assignment method for servings variable
        ???? servings = ???? 
        
                
        do {
            System.out.println("Please enter the ingredient name 
                or type end if you are finished entering ingredients: ");
            String ingredientName = scnr.next();
            if (ingredientName.toLowerCase().equals("end")) {
                addMoreIngredients = false;
            } else {

            /**
            * Add the ingredient name to recipeIngredients
            * 
            */
        
                System.out.println("Please enter the ingredient amount: ");
                float ingredientAmount = scnr.nextFloat();
            
                System.out.println("Please enter the ingredient Calories: ");
                int ingredientCalories = scnr.nextInt();
                
                /**
                * Add the total Calories from this ingredient
                *  (ingredientCalories * ingredientAmount)
                * to the totalRecipeCalories
                * 
                */
            
            }
           
       } while (!reply.equals("n") ;
        
        SteppingStone5_Recipe recipe1 = new SteppingStone5_Recipe(recipeName, 
            servings, recipeIngredients, totalRecipeCalories);
        recipe1.printRecipe();
    }
}


/**
 * Final Project
 * 
 * For your Final Project:
 * 
 * 1. Modify this code to develop a Recipe class:
 *	a. change the void main method createNewRecipe() that returns a Recipe 
 * 	 
 * 2. FOR FINAL SUBMISSION ONLY:Change the ArrayList type to an 
 *		Ingredient object.  When a user adds an ingredient to the recipe, 
 * 		instead of adding just the ingredient name, you will be adding the 
 *		actual ingredient including name, amount, measurement type, calories.
 *	For the Milestone Two submission, the recipeIngredients ArrayList can
 *	remain as a String type.
 *
 * 3. Adapt the printRecipe() method to print the amount and measurement
 * 	type as well as the ingredient name.
 *
 * 4. Create a custom method in the Recipe class. 
 *      Choose one of the following options:
 *
 * 	a. print out a recipe with amounts adjusted for a different 
 * 		number of servings
 * 
 * 	b. create an additional list or ArrayList that allow users to 
 * 		insert step-by-step recipe instructions
 *
 * 	c. conversion of ingredient amounts from 
 * 		English to metric (or vice versa)
 *
 * 	d. calculate select nutritional information 
 *
 * 	e. calculate recipe cost
 * 
 *      f. propose a suitable alternative to your instructor
 * 
 */ 

