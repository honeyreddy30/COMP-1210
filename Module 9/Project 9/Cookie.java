 /**
* Deriving the class Cookie from BakedItem.
* Project 9.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 4th november 2022
*/
public class Cookie extends BakedItem
{
/**
*Creating variables.
* @param args Command line arguements (not used)
*/
   public static final double BASE_RATE = 0.35;
/**
* Class must contain a constructor that accepts four parameters.
* @param nameIn for name
* @param flavorIn for flavor
* @param quantityIn for quantity
* @param ingredientsIn for ingredients
*/
   public Cookie(String nameIn, String flavorIn, int quantityIn,
      String...ingredientsIn) 
   {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
   }
   /**
   *Accepts no parameters and returns a double representing the price
   of cookie.
   * @return BASE_RATE * quantity
   */
   public double price()
   {
      return BASE_RATE * quantity;
   }
   
}