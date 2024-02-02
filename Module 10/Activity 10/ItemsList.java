 /**
* This class will hold an array of InventoryItem objects (which 
includes objects of subclasses of InventoryItem; recall an instance 
of a subclass of InventoryItem is an InventoryItem)
* activity 10.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 8th november 2022
*/
public class ItemsList 
{
/**
* instance variables.
* @param args command line arguements (not used).
*/
   private InventoryItem[] inventory;
   private int count;
   /**
   * parameterless constructor.
   */
   public ItemsList()
   {
      inventory = new InventoryItem[20];
   }
   /**
   * with parameter InventoryItem itemIn; no return.
   * @param itemIn for item
   */
   public void addItem(InventoryItem itemIn)
   {
      inventory[count] = itemIn;
      count++;
   }
   /**
   * with parameter double electronicsSurcharge; double return. 
   * @param electronicsSurcharge for surcharges.
   * @return total cost
   */
   public double calculateTotal(double electronicsSurcharge)
   {
      double total = 0;
      for (int i = 0; i < count; i++)
      {
         if (inventory[i] instanceof ElectronicsItem)
         {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else
         {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   /**
   * method should iterate through inventory 
from 0 up to count (but not including count) to 
append the toString for each item to output.
* @return name with total price
*/
   public String toString()
   {
      String output = "All inventory:\n\n";
      for (int i = 0; i < count; i++)
      {
         output += inventory[i] + "\n";
      }
      return output;
   }
}