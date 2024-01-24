
package Recipe;

import Recipe.*;

public class Recipe_Test {
    
    public static void main(String[] args) {
      
        //here the construtor is called to create a new recipe object
    final Recipe newRecipe = new Recipe();                 
    
    // here we invoke the new createNewRecipe() method that was defined in the recipe.java file
      
       newRecipe.createNewRecipe();    
    
        //here we also call the printRecipe method that was defined in the Recipe.java file
        newRecipe.printRecipe();                
        
    }
}

