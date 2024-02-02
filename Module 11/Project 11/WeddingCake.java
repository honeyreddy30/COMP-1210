/**
* Deriving the class WeddingCake from class Cake.
* Project 11.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 18th november 2022
*/
public class WeddingCake extends Cake
{
   private int tiers;
   /**
*Creating variables.
* @param args Command line arguements (not used)
*/
   public static final double BASE_RATE = 15.0;
   /**
* Class must contain a constructor that accepts four parameters.
* @param nameIn for name
* @param flavorIn for flavor
* @param quantityIn for quantity
* @param ingredientsIn for ingredients
* @param layersIn for layers
* @param tiersIn for tiers
*/
   public WeddingCake(String nameIn, String flavorIn, int quantityIn,
      int layersIn, int tiersIn, String...ingredientsIn)
   {
      super(nameIn, flavorIn, quantityIn, layersIn, ingredientsIn);
      tiers = tiersIn;
   }
   /**
   *Accepts no parameters and returns a double representing tiers.
   *@return tiers
   */
   public int getTiers()
   {
      return tiers;
   }
   /**
   *Accepts double for tiers, sets the field, and returns nothing.
   *@param tiersIn for tiers
   */
   public void setTiers(int tiersIn)
   {
      tiers = tiersIn;
   }
   /**
   *Accepts no parameters and returns a double representing 
   the price for the Cake.
   *@return (BASE_RATE * layers * tiers) * quantity
   */
   public double price()
   {
      return (BASE_RATE * layers * tiers) * quantity;
   }
}