 /**
* Deriving the class Pie from BakedItem.
* Project 11.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 18th november 2022
*/
public class Pie extends BakedItem
{
   private double crustCost;
    /**
*Creating variables.
* @param args Command line arguements (not used)
*/
   public static final double BASE_RATE = 12.0;
/**
* Class must contain a constructor that accepts four parameters.
* @param nameIn for name
* @param flavorIn for flavor
* @param quantityIn for quantity
* @param ingredientsIn for ingredients
* @param crustCostIn for crustCost
*/
   public Pie(String nameIn, String flavorIn, int quantityIn,
      double crustCostIn, String...ingredientsIn)
   {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      crustCost = crustCostIn;
   }
   /**
   *Accepts no parameters and returns a double representing crust cost.
   *@return crustCost
   */
   public double getCrustCost()
   {
      return crustCost;
   }
   /**
   *Accepts double for crust cost, sets the field, and returns nothing.
   *@param crustCostIn for crustCost
   */
   public void setCrustCost(double crustCostIn)
   {
      crustCost = crustCostIn;
   }
   /**
   *Accepts no parameters and returns a double representing the price
   of pie.
   * @return (BASE_RATE + crustCost) * quantity
   */
   public double price()
   {
      return (BASE_RATE + crustCost) * quantity;
   }
}
