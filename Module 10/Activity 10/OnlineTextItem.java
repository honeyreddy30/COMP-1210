/**
* represents an online text item that users can 
buy (such as an electronic book or journal article). 
* Project 9.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 31st october 2022
*/
public abstract class OnlineTextItem extends InventoryItem 
{
/**
*OnlinetextItem should have the following characteristics.
*@param nameIn for name
*@param priceIn for price
*/
   public OnlineTextItem(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
   }
   /**
   *The price variable has been inherited from InventoryItem.
   *@return price
   */
   public double calculateCost()
   {
      return price;
   }
}