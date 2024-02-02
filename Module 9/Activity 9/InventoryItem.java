 /**
* Represents an inventory item in a store.
* Project 9.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 31st october 2022
*/
public class InventoryItem
{
   protected String name;
   protected double price;
   private static double taxRate = 0.0;
/**
*InventoryItem should have the following characteristics.
*@param nameIn for name
*@param priceIn for price
*/
   public InventoryItem(String nameIn, double priceIn)
   {
      name = nameIn;
      price = priceIn;
   }
   /**
   *Returns customer name.
   *@return name
   */
   public String getName()
   {
      return name;
   }
   /**
   *returns the price including tax.
   @return price * (1 + taxRate)
   */
   public double calculateCost()
   {
      return price * (1 + taxRate);
   }
   /**
   *Sets tax rate.
   *@param taxRateIn for taxRate
   */
   public static void setTaxRate(double taxRateIn)
   {
      taxRate = taxRateIn;
   }
   /**
   *Return a string representation with name and price with tax.
   *@return String
   */
   public String toString()
   {
      return name + ": $" + calculateCost();
   }
}