/**
* Program for try - catch statements.
* Activity 10.
* @author Honey Reddy Nagireddy - COMP 1210-006
* @version 15th november 2022
*/
public class Division {

/**
    * Creating a method which accepts two int parameters.
    * @param numerator for numerator
    * @param denominator for denominator
    * @return double value of numberator divided by denominator
    */
   public static int intDivide(int numerator, int denominator) {
      try {
         return numerator / denominator;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   
   /**
    * Creating a method that accepts two int parameters.
    * @param numerator for numerator
    * @param denominator for denominator
    * @return double result of numerator by denominator.
    */
   public static float decimalDivide(int numerator, int denominator) {
      float num = (float) numerator; 
      float denom = (float) denominator; 
      if (denom == 0) { 
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      return num / denom;
   }
}