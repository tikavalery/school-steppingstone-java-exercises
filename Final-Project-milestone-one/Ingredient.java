import java.util.Scanner;

public class Ingredient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Keyboard kb = new Keyboard();

        /**jjjdjd
         * Assign the following variables with the appropriate data type and value:
         * 
         * VARIABLE NAME VALUE
         * 
         * nameOfIngredient ""
         * numberCups 0.0
         * numberCaloriesPerCup 0jdj
         * totalCalories 0.0
         * 
         */
        int intInput;

        //defining prompt messages as variables
        String prompMsgIngridientName = "Please Enter the name of the ingredient ";
        String prompMsgNumber = " ";
        // Please Enter the number of cups of your ingredient 
        String prompMsgNumber1 = "Please enter the number of ";
        String prompMsgNumber2 = " Of your ingredient ";
        String prompMsgCaloriesPerUnit = " ";
        String prompMsgCaloriesPerUnit1 = "Please enter the number of calories per ";
        String prompMsgUnitOfMeasurement = "What unit of measurement will be used for this ingredient (Cups,Teaspoons,Tablespoon) ";
        String errorMsgDouble = "Please enter a value that has decimals ";
        String errorMsgInterger = "Invalid entry, Please enter an integer";
    
        String unitOfMeasurement = "";
        String nameOfIngredient = "";
        double numberCups = 0.0;
        int numberCaloriesPerCup = 0;
        double totalCalories = 0.0;
         double doubleInput;



        // Getting name of ingredient
         Scanner scnr = new Scanner(System.in);
        System.out.println(prompMsgIngridientName);
        nameOfIngredient = scnr.nextLine();
        System.out.println("Your entered the name " + nameOfIngredient);

        //Getting the unit of measurement
        System.out.println(prompMsgUnitOfMeasurement);
        unitOfMeasurement = scnr.nextLine();
        System.out.println( "Your entered the unit " + unitOfMeasurement);

        // Getting number of cups of the ingredient
        // intInput = kb.readInterger(prompMsgNumberCups, errorMsg1);
        prompMsgNumber = prompMsgNumber1 + unitOfMeasurement + prompMsgNumber2;
        doubleInput = kb.readDouble(prompMsgNumber, errorMsgDouble);//importing the readdouble method created in our keyboard class to help with double input validation
        System.out.println("Your entered the value " + doubleInput);
        numberCups = doubleInput;

       // Getting the Number of calories per cup
       prompMsgCaloriesPerUnit = prompMsgCaloriesPerUnit1 + unitOfMeasurement; // concatinating user unit imput to form message for number calories
       intInput = kb.readInterger(prompMsgCaloriesPerUnit, errorMsgInterger); //using the imported readInterger method from keyboard class to help with interger validation
       System.out.println("Your entered the value " + intInput);
       numberCaloriesPerCup = intInput;

     // Getting the total number of calories contributed by one ingredient
       totalCalories = numberCups * numberCaloriesPerCup;
     if(totalCalories >= numberCaloriesPerCup){
        
       System.out.println(nameOfIngredient + " uses " + numberCups
               + unitOfMeasurement + " and has " + totalCalories + " calories.");

     }
      



       
        
        

         
       
       
   

    }

}





