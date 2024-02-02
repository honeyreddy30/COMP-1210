import java.util.Scanner;
/**
* Calculation for the qiven formula for values of x, y, z.
*
* Project 2.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 2st september 2022
*/
public class MySolver
{
/**
*Prints the result of a specified formula afer 
reading input values of x, y, Z.
*@param args Command line arguments – not used.
*/
   public static void main(String[] args) 
   {
   //create an instance of Scanner class
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double y = 0;
      double z = 0;
      double result = 0;
      System.out.println("result = (8.5x + 6.1) (10y + 7.9) / z");
      //prompt the user to enter the value of x:
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      //prompt the user to enter the value of y:
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      //prompt the user to enter the value of z:
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
      if (z != 0) 
      //if z is not 0, substitute the values of x, y, z in the equation
      {
         result = ((8.5 * x + 6.1) * (10 * y + 7.9)) / z;
         System.out.println("result = " + result);
      }
      else
      //if z is 0, it displays following statement
      {
         System.out.println("result is undefined");
      }
   }
}