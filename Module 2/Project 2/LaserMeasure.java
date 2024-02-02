import java.util.Scanner;
/**
* Converting inches to miles, yars, feet and inches.
*
* Project 2.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 2st september 2022
*/
public class LaserMeasure
{
/**
*Prints the result of a specified formulae of miles, yards, feet and inches
 afer reading input value of distance.
*@param args Command line arguments – not used.
*/
   public static void main(String[] args) 
   {
   //create an instance of Scanner class
      Scanner userInput = new Scanner(System.in);
      int distance = 0;
      int miles = 0;
      int yards = 0;
      int feet = 0;
      int inches = 0;
      System.out.print("Enter the raw distance measurement in inches: ");
      distance = userInput.nextInt();
      if (distance >= 0)
      //if the distance is positive it calculates the following
      {
         System.out.println();
      //prints a blank line
         System.out.println("Measurement by combined miles, yards," 
            + " feet, inches:");
         //writing the formulae to convert inches to miles, yards, feet, inches
         miles = distance / 63360;
         yards = (distance % 63360) / 36;
         feet = ((distance % 63360) % 36) / 12;
         inches = ((distance % 63360) % 36) % 12;
         //calculates miles, yards, feets and inches using above mentioned 
         //formulae and displays on output screen
         System.out.println("\tmiles: " + miles);
         System.out.println("\tyards: " + yards);
         System.out.println("\tfeet: " + feet);
         System.out.println("\tinches: " + inches);
         System.out.println();
         //prints a blank line
         System.out.println(distance + " in" + " = " + miles + " mi, " 
            + yards + " yd, " + feet + " ft, " + inches + " in");
      }
      else
      //if distance is less than zero
      {
         System.out.println("Measurement must be non-negative!");
      }
   
   }
}
