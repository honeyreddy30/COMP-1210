/**
* InvalidCategoryException is a user defined exception 
created by extending the Exception class.
* Project 11.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 18th november 2022
*/
public class InvalidCategoryException extends Exception
{
/**
* The constructor for InvalidCategoryException takes a single 
String parameter representing category and invokes the super 
constructor with the following String.
* @param category for string category
*/
   public InvalidCategoryException(String category)
   {
      super("For category: " + "\"" + category + "\"");
   }
}