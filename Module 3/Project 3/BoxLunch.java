import java.util.Scanner;
import java.text.DecimalFormat;
/**
*the program will print the user's order information based on 
the order code.
*
*Project_3.
*@author Honey Reddy Nagireddy - COMP 1210-006
*@version 9th september 2022
*/
public class BoxLunch
{
/**
*Caluculates the total bill and also prints a random lucky number 
between 1 and 9999.
*@param args Command line arguments (not used).
*/
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter order code: ");
      //Prompts the user to enter their order code
      String orderCode = userInput.nextLine();
      if (orderCode.length() >= 13)
      //If the order code's length is greater than or equal to 13
      {
      //trims the user input order code
         orderCode = orderCode.trim();
         //prints the name of the user which from index 13 to
         // the end of order code
         System.out.println("\nName: " 
            + orderCode.substring(13, orderCode.length()));
         DecimalFormat mp =  new DecimalFormat("$#,##0.00");
         int adultMeal = Integer.parseInt(orderCode.substring(1, 3));
         //splits the adult price to decimal part and integer part
         String adultPrice1 = orderCode.substring(3, 5); 
         String adultPrice2 = orderCode.substring(5, 7);
         //combines the decimal part and integer part with a "." and
         // assigns that value to adultPrize3
         String adultPrice3 = adultPrice1 + "." + adultPrice2;
         //converts adultPrice3 string to double
         double adultPrice = Double.parseDouble(adultPrice3);
         //splits the child price to decimal part and integer part
         int childMeal = Integer.parseInt(orderCode.substring(7, 9));
         String childPrice1 = orderCode.substring(9, 11);
         String childPrice2 = orderCode.substring(11, 13);
         //combines the decimal part and integer part with a "." and 
         //assigns that value to childPrice3
         String childPrice3 = childPrice1 + "." + childPrice2;
         //converts childPrice3 string to double
         double childPrice = Double.parseDouble(childPrice3);
         //Prints the number of adult meals and their price in the 
         //required format
         System.out.println("Adult meals: " + adultMeal
            + " at " + mp.format(adultPrice)); 
         //Prints the number of child meals and their price in the 
         //required format
         System.out.println("Child meals: " + childMeal
            + " at " + mp.format(childPrice));
         //Calculates the total price
         double total = adultMeal * adultPrice + childMeal * childPrice;
         System.out.println("Total: " + mp.format(total));
         //converts the theme part of order code to integer
         int theme = Integer.parseInt(orderCode.substring(0, 1));
         if (theme == 0)
         //if theme is equal to 0
         {
            System.out.println("Theme: Birthday");
         }
         else if (theme == 1)
         //if theme is equal to 1
         {
            System.out.println("Theme: Graduation");
         }
         else
         //if theme is neither equal to 0 nor 1
         {
            System.out.println("Theme: Holiday");
         }
         //required format to print lucky number
         DecimalFormat pn =  new DecimalFormat("0000");
         //generats a random number between 1 and 9999
         double luckyNumber = (Math.random() * 9999) + 1;
         System.out.println("Lucky Number: " + pn.format(luckyNumber));  
      }
      else 
      //if order code <= 13
      {
         System.out.println("\n*** Invalid Order Code ***");
         System.out.println("Order code must have at least 13 characters.");
      }
   }
}
   
