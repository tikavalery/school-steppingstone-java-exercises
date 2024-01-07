// package SteppingStones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;


public class SteppingStone4_Loops {
    
    public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       String recipeName = "";
       ArrayList<String> ingredientList = new ArrayList();
       String newIngredient = "";
       boolean addMoreIngredients = true;
       
       System.out.println("Please enter the recipe name: ");
       recipeName = scnr.nextLine();
       
    
       do {           
           System.out.println("Would you like to enter an ingredient: (y or n)");
           String reply = scnr.next().toLowerCase();
        //Here we create and if else statement to check for what decision the user wants to take.if they want to add and ingredient "y" we give them 
        // that option,if not "n " we breake out of the loop
            if (reply.equals("y")){// we use the equals method to compare the value of users reply with "y" which stand for yes
             System.out.println("Please enter the name of the ingredient");//we then prompt the user to add the name of the ingredient he will like to add
             Scanner scnrIngredient = new Scanner(System.in); // we get the added ingredient and assign it to scanner variable "scnrIngredient"
             newIngredient = scnrIngredient.nextLine().toLowerCase();// we collect the scanner value and assign it the variable called "newIngredient"
             ingredientList.add(newIngredient);//add the collected ingredient to the arrayList "ingredientList"

           }else{
            //this else statement will help us break out of the loop if user does not want to add an ingredient
            addMoreIngredients = false;
            break;
           }
 
           
           /**
            * Add your code here (branches work well!).  The code should check the
            * reply:
            *   "y" --> prompt for the ingredient and add it to the ingredient list;
            *   "n" --> break out of the loop;  
            *       (Hint: what is the 'while' condition? What could you change to 
            *               stop the loop from starting over?)
            *   anything else --> prompt for a "y" or "n"
            * 
            */
            
       } while (addMoreIngredients);
       
       System.out.println("I am out of loop");
       for (int i = 0; i < ingredientList.size(); i++) {
           /** 
		   * Get the item i from the ingredient list
		   *	and assigning it to the String ingredient
		   *
		   */
          // Here we loop over the ingredientList arraylist and save the results into a variable called ingredient
          // we then print each result as we loop through the various elements
		   String ingredient = ingredientList.get(i);
           System.out.println(ingredient);
       }
    }
}



