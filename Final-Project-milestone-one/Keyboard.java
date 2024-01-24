import java.util.Scanner;

//creating a class to create methods that will be used for input validation
class Keyboard{
    private Scanner in;

    // creating a keyboard constructor
    Keyboard(){
        in = new Scanner(System.in);
    }

    //creating a readInterger method that will be used to validate interger inputs by user.
    public int readInterger(String prompMsg, String errorMsg){
      int num = 0;
      String strInput;
      boolean valid = false;

     //while loops will keep looping to present message to user ontil user enters the correct data type (interger)
      while(valid == false){
        System.out.print(prompMsg);
        strInput = in.nextLine();
        try{
            // if interger is entered as a string,it is pasrsed into a number and saved in num variable
            num = Integer.parseInt(strInput);
            valid = true;// the valid variable is fliped to false and the loops breaks
        }
        catch(NumberFormatException e){// if the wrong data type is entered,it is catch by the catch method and the appropriate error message is displayed
            System.out.println(errorMsg);
        }
      }
      return num;
    }

    // Method to validated double inputs with same logics as method above
    public double readDouble(String prompMsg, String errorMsg){
      double num = 0; 
      String strInput;
      boolean valid = false;

     
      while(valid == false){
        System.out.print(prompMsg);
        strInput = in.nextLine();
        try{
            num = Double.parseDouble(strInput);
            valid = true;
        }
        catch(NumberFormatException e){
            System.out.println(errorMsg);
        }
      }
      return num;
    }
}