package Recipe;
 
import java.util.Scanner;

import java.util.ArrayList;
 

 
public class Recipe { 
    
    private String recipeName; //we create a String variable that will hold the recipe name
    
    private int servings; // we create a serving variable that will hold the total number of servings in a meal
    
    ArrayList<String> recipeIngredients = new ArrayList();//we create a an array list to hold the list of ingredients for our recipre
    
    private int totalRecipeCalories; //we create a variable to hold the total number of calories in the whole recipe
 
//Accessors and Mutators for the class variables
 
    public void setRecipeName(String recipeName) {// we create a mutator for setting the name of the recipes which will be passed to our test class 
        this.recipeName = recipeName;
    }
    
    public String getRecipeName() { // we create an accessor for getting recipe name which will be passed to our steppingstone test class
        return recipeName;
    }
    
    public void setServings(int servings) { // create a mutator for setting the servings
        this.servings = servings;
    }
    
    public int getServings() {//create an accessor for getting the servings
        return servings;
    }
    
    public void setRecipeIngredients(ArrayList<String> recipeIngredients) {
    this.recipeIngredients = recipeIngredients;
    }
    
    public ArrayList<String> getRecipeIngredients() {// create a muttator to setting the recipe ingredients
        return recipeIngredients;
    }
    
    public void setTotalRecipeCalories(int totalRecipeCalories) {//create an accessor for getting recipre ingredients
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    public int getTotalRecipeCalories() { //create an accessor to getting total recipre calories
        return totalRecipeCalories;
    }
    
  
        
    public Recipe() {// here we create a construtor for intializing the class attribute
        this.recipeName = "";
        this.servings = 0; //<--- assignment value with appropriate data type
        this.recipeIngredients = new ArrayList<String>(); //<-- assignment value for empty ArrayList
        this.totalRecipeCalories = 0;  
    }
    
//Overloaded Constructor

    public Recipe(String recipeName, int servings, 
    	ArrayList<String> recipeIngredients, int totalRecipeCalories) 
    {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
// printRecipe method will be used to print information about the recipe and its ingredients
    
    public void printRecipe() {
        
        int singleServingCalories = (totalRecipeCalories / servings);
        
        System.out.println("Recipe: " + recipeName);
        
        System.out.println("Serves: " + servings);
        
        System.out.println("Recipe ingredients are as follows");
        
        for (int i = 0; i < recipeIngredients.size(); i++) {  //For loop to print each array member
            System.out.println(recipeIngredients.get(i));
        }
        
        System.out.println("Each Serving Has " + singleServingCalories + " Calories.");
    }
 
 //Create New Recipe Method to Build Recipes Based on User Input

    public Recipe createNewRecipe() {
        int totalRecipeCalories = 0;
        ArrayList <String> recipeIngredients = new ArrayList();
        boolean addMoreIngredients = true;
                
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the recipe name: "); // promt the user for recipe name and save in the recipename variable
        String recipeName = scnr.nextLine();
        
        System.out.println("Please enter the number of servings: ");// prompt user for servings and save in the serving variable
        int servings = scnr.nextInt();


        do { // we loop over and over to get all the ingredients, thier amounts and calories from each ingredient
            System.out.println("Please enter the ingredient name or type 'end' if you are finished entering ingredients: ");
                String ingredientName = scnr.next();
                
                if (ingredientName.toLowerCase().equals("end")) {
                    addMoreIngredients = false;
                    break;
                } 
            
                else {
                    recipeIngredients.add(ingredientName);// add ingredient to recipeingredient arraylist
                    addMoreIngredients = true;

                       /**
            * Add the ingredient name to recipeIngredients
            * 
            */
                
                    System.out.println("Please enter the amount of ingredients used: ");
                        int ingredientAmount = scnr.nextInt();
            
                    System.out.println("Please enter the ingredient Calories per each unit/ingredient: ");
                        int ingredientCalories = scnr.nextInt();
            
            totalRecipeCalories = totalRecipeCalories + (ingredientCalories * ingredientAmount);     
                 
            }
        }
            while (addMoreIngredients == true);
        
    Recipe recipe1 = new Recipe(recipeName, servings, recipeIngredients, totalRecipeCalories);
    recipe1.printRecipe();
    return recipe1;
    
    } 

 }

/*
 Pseudocode for the custom method selected from the list in steppingstone lab five. 

 

 I chose to "Create an additional Array List that allows users to submit step by step instructions, then print those instructions in printRecipe()." 

1) when creating attributes, I will also Create a recipeInstructions  String Arraylist to hold a comma separated list of instructions 

1) create an addMoreInstructions Boolean variable and set it to true 

3) Prompt user for first recipe instruction 

4) add the instructions to the arraylist 

5) Prompt user if he would like to add more instructions and to reply with "yes" or "no" 

6) If yes keep looping over and adding the instructions to our instructions arraylist 

7) if no we change the value of our addMoreInstructions Boolean variable to false 

8) Next, we break the loop with the break keyword 

9) Also, in our printRecipe method we will loop over the  recipeInstructions arrayList and print it 

10) lastly, we also pass our instructions into the recipe1 object when 
            
 
 */