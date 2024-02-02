/**
* Create a class called InventoryListApp and add a main method. 
In the main method, 
instantiate a ItemsList object called myItems. 
* activity 10.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 8th november 2022
*/
public class InventoryListApp
{
/**
* prints array with the total cost.
* @param args command line arguements (not used).
*/
   public static void main(String[] args)
   {
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(0.05);
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      System.out.println(myItems.toString());
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}