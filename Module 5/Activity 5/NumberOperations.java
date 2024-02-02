/**
 * Program which will hold an integer value and provide methods to perform 
 * various operation. 
 *
 * Activity_05.
 * @author Honey Reddy Nagireddy - COMP 1210 -006
 * @version 20th September 2022
 */
public class NumberOperations 
{
/**
   *creating a blank NumberOperations constructor.
   *@param args Command line arguments (not used).
   */
   // instance variables
   private int number;
   /**
   * Assigning the constructor int to take a value for value number.
   *@param numberIn for number
   */
   //constructor
   public NumberOperations(int numberIn) 
   {
      number = numberIn;
   } //creating methods
   /**
   *Takes no parameter and returns int value of number.
   *@return number
   */
   public int getValue()
   {
      return number;
   }
   /**
   *takes no values and returns a string.
   *@return output
   */
   public String oddsUnder() 
   {
      String output = "";
      int i = 0;
      while (i < number) 
      { 
      //checking if i is even or odd
         if (i % 2 != 0) 
         {
         //adds i to the output
            output += i + "\t";
         }
         i++;
         //incrementing i
      }
      return output;
   }
   /**
   *takes no parameters and returns a string.
   *@return string
   */
   
   public String powersTwoUnder() 
   {
      String output = "";
      int powers = 1;
      while (powers < number) 
      {
      // adds power to output
         output += powers + "\t";
         //multiplies powers with 2
         powers = powers * 2;
      }
      return output;
   }
   /**
   * takes int parameter called comparenumber.
   *@return int value
   *@param compareNumber for isGreater
   */
   public int isGreater(int compareNumber) 
   {
      if (number > compareNumber) 
      {
         return 1;
      }
      else if (number < compareNumber) 
      {
         return -1;
      }
      else 
      {
         return 0;
      }
   }
   /**
   *takes no parameters. 
   *@return string value
   */
   public String toString() {
      return number + "";
   }
}
