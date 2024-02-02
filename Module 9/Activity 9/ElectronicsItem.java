 /**
* Electronics items will have all of the characteristics 
of Inventory items and will take into account shipping costs.
* Project 9.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 31st october 2022
*/
public class ElectronicsItem extends InventoryItem 
{
   protected double weight;
   /** Constant variable. */
   public static final double SHIPPING_COST = 1.5;
   /**
   *String for name (nameIn), a double for price (priceIn), 
   and a double for weight (weightIn).
   *@param nameIn for name
   *@param priceIn for price
   *@param weightIn for weight
   */

   public ElectronicsItem(String nameIn, double priceIn, double weightIn)
   {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   /**
   *Calculates the total cost.
   *@return double super.calculateCost() + (SHIPPING_COST * weight)
   */
   public double calculateCost()
   {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}