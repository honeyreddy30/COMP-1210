import java.util.Scanner;
import java.text.DecimalFormat;
/**
*Solve for the result of a specified expression.
*
*Project_3.
*@author Honey Reddy Nagireddy - COMP 1210-006
*@version 7th september 2022
*/
public class RadicalFormula
{
/**
*Solves for the specified equation and prints the 
result in desired format.
*@param args Command line arguments (not used).
*/
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      double outputType = 0;
      double result = 0;
      double x = 0;
      double expressionPart1 = 0;
      double expressionPart2 = 0;
      System.out.print("Enter a value for x: ");
      //prompt the user to enter a value for x
      x = Double.parseDouble(userInput.nextLine());
      expressionPart1 = Math.pow(3 * Math.pow(x, 8) - 2 * Math.pow(x, 3), 2);
      expressionPart2 = Math.abs((3 * Math.pow(x, 5)) - (2 * Math.pow(x, 3)));
      result = Math.sqrt(expressionPart1 + expressionPart2);
      
      System.out.println("Result: " + result); 
      //prints result after calculating the above mentioned formula
      String resultString = Double.toString(result);
      int integerPlace = resultString.indexOf(".");
      //Stores the location of index in integerPlace
      int digitsOnLeftSide = integerPlace;
      //digits on the left side
      int digitsOnRightSide = resultString.length() - integerPlace - 1;
      //digits on the right side
      System.out.println("# digits to left of decimal point: " 
         + digitsOnLeftSide);
      System.out.println("# digits to right of decimal point: " 
         + digitsOnRightSide);
      //using decimal format to format the result in required form
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      //prints the final result in the required format
      System.out.println("Formatted Result: " + df.format(result));
   }
}