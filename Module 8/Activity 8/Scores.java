/**
* A class called scores that will hold an array of numerical 
values and provide methods that allows users to interact with scores class.
* Activity 8.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 24st october 2022
*/
public class Scores
{
//instance variables
   private int[] numbers;
   /**
*A constructor that has a parameter declared as an array of int values.
*@param numbersIn for numbers
*/
   public Scores(int[] numbersIn)
   {
      numbers = numbersIn;
   }
   /**
   *Has no parameter and returns an array of int.
   *@return evens
   *increments count and number evens.
   */
   public int[] findEvens()
   {
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0)
         {
            numberEvens++;
         }
      }
      int[] evens = new int[numberEvens];
      int count = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 == 0)
         {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   /**
   *Has no parameter and returns an array of int.
   *@return odds
   *increments count and number odds.
   */
   public int[] findOdds()
   {
      int numberOdds = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 != 0)
         {
            numberOdds++;
         }
      }
      int[] odds = new int[numberOdds];
      int count = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 != 0)
         {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   /**
   *Calculates average.
   *@return double
   */
   public double calculateAverage()
   {
      int sum = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         sum += numbers[i];
      }
      return ((double) sum / numbers.length);
   }
   /**
   *A method will be exactly same as to string,
   will iterate from the lenght of numbers -1 to 0.
   *@return result
   */
   public String toStringInReverse()
   {
      String result = "";
      for (int i = numbers.length - 1; i != -1; i--)
      {
         result += numbers[i] + "\t";
      }
      return result;
   }
   /**
   *gives string output.
   *@return output
   */
   public String toString()
   {
      String output = "";
      for (int i = 0; i < numbers.length; i++)
      {
         output += numbers[i] + "\t";
      }
      return output;
   }  
}