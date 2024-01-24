



// package SteppingStones;

import java.util.Scanner;
import java.util.ArrayList;

public class SteppingStone5_Recipe {
    
    private String recipeName;//we create a String variable that will hold the recipe name
    
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
    private int servings = 0; // we create a serving variable that will hold the total number of servings in a meal

    ArrayList<String> recipeIngredients = new ArrayList<String>(); //we create a an array list to hold the list of ingredients for our recipre

    private double totalRecipeCalories = 0.0;// we create a variable to hold the total number of calories in the whole recipe
     
    
    /**
     * Add mutators and accessors for the class variable.
     * 
     */
    public void setRecipeName(String recipeName) { // we create a mutator for setting the name of the recipes which will be passed to our test class 
        this.recipeName = recipeName; 
    }
    
    public String getRecipeName() {// we create an accessor for getting recipe name which will be passed to our steppingstone test class
        return recipeName;
    }
    
    public void setServings(int servings) {// create a mutator for setting the servings
        this.servings = servings;
    }
    
    public int getServings() {//create an accessor for getting the servings
        return servings;
    }
    
    public void setRecipeIngredients(ArrayList<String> recipeIngredients) {// create a muttator to setting the recipe ingredients
    this.recipeIngredients = recipeIngredients;
    }
    
    public ArrayList<String> getRecipeIngredients() {//create an accessor for getting recipre ingredients
        return recipeIngredients;
    }
    
    public void setTotalRecipeCalories(double totalRecipeCalories) {// create a mutator for setting total recipe calories
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    public double getTotalRecipeCalories() { //create an accessor to getting total recipre calories
        return totalRecipeCalories;
    }
     
    
    public SteppingStone5_Recipe() { // here we create a construtor for intializing the class attribute
        this.recipeName = "";
        this.servings = 0; //<--- assignment value with appropriate data type
        this.recipeIngredients = new ArrayList<String>(); //<-- assignment value for empty ArrayList
        this.totalRecipeCalories = 0.0;
        
    }
    public SteppingStone5_Recipe(String recipeName, int servings, 
    	ArrayList<String> recipeIngredients, double totalRecipeCalories) // here we overload a second constructor with parameters
        
    //<-- use appropriate data type for the ArrayList and the servings arguments
    {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    public void printRecipe() {// we create a print method for printing our recipe ,ingredients ,servings and calories
        /**
         * Declare an int variable singleServingCalories.
         * Assign singleServingCalories to
         * the totalRecipeCalories divided by the servings
         * 
         */

         int totalRecipeCaloriesInterger = (int)totalRecipeCalories; // type cast a double variable to an int variable
         int singleServingCalories = 0;

         singleServingCalories = totalRecipeCaloriesInterger/servings;

         System.out.println("Recipe: " + recipeName);
         System.out.println("Serves: " + servings);

         System.out.println("Recipe ingredients are as follows");
         for (int i = 0; i < recipeIngredients.size(); i++) {
            System.out.println(recipeIngredients.get(i));
          }

        System.out.println("Each serving has " + singleServingCalories + " Calories");

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
        double totalRecipeCalories = 0.0;
        ArrayList <String> recipeIngredients = new ArrayList();
        boolean addMoreIngredients = true;
        
        Scanner scnr = new Scanner(System.in);

        
        System.out.println("Please enter the recipe name: ");// promt the user for recipe name and save in the recipename variable
        String recipeName = scnr.nextLine();
        
        System.out.println("Please enter the number of servings: ");// prompt user for servings and save in the serving variable
        //correct data type & Scanner assignment method for servings variable
       
        int servings = scnr.nextInt();
        //   scnr.nextLine();
     

        do {// we loop over and over to get all the ingredients, thier amounts and calories from each ingredient

                     
            System.out.println("Please enter the ingredient name or type end if you are finished entering ingredients: ");
            String ingredientName = scnr.next();
            if (ingredientName.toLowerCase().equals("end")) {
                addMoreIngredients = false;
                break;
            } else {
              
                recipeIngredients.add(ingredientName); // add ingredient to recipeingredient arraylist
                addMoreIngredients = true;
            /**
            * Add the ingredient name to recipeIngredients
            * 
            */
        
                System.out.print("Please enter the ingredient amount: ");
                int ingredientAmount = scnr.nextInt();
            
                System.out.println("Please enter the ingredient Calories: ");
                int ingredientCalories = scnr.nextInt();

                // System.out.println(reply);
                
                 totalRecipeCalories = totalRecipeCalories + (ingredientCalories * ingredientAmount);
                /**
                * Add the total Calories from this ingredient
                *  (ingredientCalories * ingredientAmount)
                * to the totalRecipeCalories
                * 
                */
            
            }
           
       } while (addMoreIngredients ==true) ;// so far as addmore is true we keep looping over and over
        
        SteppingStone5_Recipe recipe1 = new SteppingStone5_Recipe(recipeName, // create a recipre object
            servings, recipeIngredients, totalRecipeCalories);
        recipe1.printRecipe();// call the print method to print the recipe and its ingredients and colories and servings
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

