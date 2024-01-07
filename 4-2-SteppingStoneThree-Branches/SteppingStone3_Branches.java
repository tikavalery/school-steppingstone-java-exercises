/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package SteppingStones;

import java.util.Scanner;


public class SteppingStone3_Branches {
    
    public static void main(String[] args) {
       int numberCups = -1;

       /**
        * Add a CONSTANT variable MAX_CUPS assigned to the value 100
        */
      final int MAX_CUPS = 100;  
       
       Scanner scnr = new Scanner(System.in);
       
       System.out.println("Please enter the number of cups (between 1 and 100): ");
       
       //The following "if branch" uses the scanner method hasNextInt() to
       //check to see if the input is an int.
       if (scnr.hasNextInt()) {

        //here we get the input of the user using the scrn.netInt() object and asign in to the numberCups variable
           numberCups = scnr.nextInt();

        //we then use an if statement to compare the number of cups entered to the MAX_CUPS variable.If the number entered is between 1 and 
        //100 we then print and acknowledgement statement.
        //if the number is not between 1 and 100 we use the scanner object to ask the user to input another number 
           if(numberCups <= MAX_CUPS ){
            System.out.println(numberCups + " is a valid number of cups!");
           } else{
            System.out.println(numberCups + " is not a valid number of cups!");
              //if the number is not between 1 and 100 we use the scanner object to ask the user to input another number between 1 and 100
            System.out.println("Please enter another number of cups between 1 and 100: ");
            //below we use the scanner object to get the user input from the terminal and store it in the numberCups variable
            numberCups = scnr.nextInt();
            //We now compare the number of cup entered by the user to the max cups again to make sure it is with the range of 1 to 100
             if(numberCups <= MAX_CUPS){
                //if within range we print an acknowledgement statement
                System.out.println(numberCups + " is a valid number od cups!");
             } else if(numberCups < 1){
                //if not we print a statement telling user he is out of attemps
                System.out.println(numberCups + " is less than 1. Sorry you are out od attemps");
             } else{
                 //if not we print a statement telling user he is out of attemps
                System.out.println(numberCups + " is greater than 100. Sorry you are out of attemps");
             }
           }
           

	   /**NESTED BRANCH:
            * Insert a nested branch that follows the following pattern:
            * 
            * if numberCups is less than or equal to MAX_CUPS:
            *   print numberCups + " is a valid number of cups!"
            *
            * else:
            *   print numberCups + " is not a valid number of cups!"
            *   print "Please enter another number of cups between 1 and 100: "
            *   numberCups = scnr.nextInt();
            *
            *   if numberCups is less than or equal to MAX_CUPS:
            *       print numberCups + " is a valid number of cups!"
            *
            *   else if numberCups < 1:
            *       print numberCups + "is less than 1. Sorry you are out of" 
            *       attempts."
            * 
            *
            *   else
            *       print numberCups + "is greater than 100. Sorry you are out of 
            *       attempts."
            *
            */
                 
           
       } else {
           System.out.println("Error: That is not a number. Try again.");
       }
    }
}

/**
 * 
 * For your Final Project, adapt your Ingredient java file to include
 * data-type validation steps for each of the variables in the class:
 * 
 * ingredientName (String)
 * ingredientAmount (float)
 * unitMeasurment (String)
 * number of Calories (double)
 * 
 */ 
