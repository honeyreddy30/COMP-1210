import java.text.DecimalFormat;
/**
* Stores BakedItem data and provides methods to access the data.
* Project 9.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 4th november 2022
*/
public abstract class BakedItem
{
//instance variables
   protected String name;
   protected String flavor;
   protected int quantity;
   protected String[] ingredients;
   protected static int totalItems = 0;
/**
* Class must contain a constructor that accepts four parameters.
* @param nameIn for name
* @param flavorIn for flavor
* @param quantityIn for quantity
* @param ingredientsIn for ingredients
*/
   public BakedItem(String nameIn, String flavorIn, int quantityIn,
      String...ingredientsIn) 
   {
      name = nameIn;
      flavor = flavorIn;
      quantity = quantityIn;
      ingredients = ingredientsIn;
      totalItems++;
   }
   /**
   * Accepts no parameters and returns a String representing the name.
   * @return name
   */
   public String getName()
   {
      return name;
   }
   /**
   * Accepts a String representing the name, sets the field, 
   and returns nothing.
   * @param nameIn for name
   */
   public void setName(String nameIn)
   {
      name = nameIn;
   }
    /**
   * Accepts no parameters and returns a String representing the flavor.
   * @return flavor
   */
   public String getFlavor()
   {
      return flavor;
   }
   /**
   * Accepts a String representing the flavor, sets the field, 
   and returns nothing.
   * @param flavorIn for flavor
   */
   public void setFlavor(String flavorIn)
   {
      flavor = flavorIn;
   }
   /**
   * Accepts no parameters and returns a String representing the quantity.
   * @return quantity
   */
   public int getQuantity()
   {
      return quantity;
   }
   /**
   * Accepts a String representing the quantity, sets the field, 
   and returns nothing.
   * @param quantityIn for quantity
   */
   public void setQuantity(int quantityIn)
   {
      quantity = quantityIn;
   }
   /**
   * Accepts no parameters and returns a String representing the ingredients.
   * @return ingredients
   */
   public String[] getIngredients()
   {
      return ingredients;
   }
   /**
   * Accepts a String representing the quantity, sets the field, 
   and returns nothing.
   * @param ingredientsIn for ingredients
   */
   public void setIngredients(String...ingredientsIn)
   {
      ingredients = ingredientsIn;
   }
   /**
   * Accepts no parameters and returns an int representing the count.
   * @return totalItems
   */
   public static int getCount()
   {
      return totalItems;
   }
   /**
   * Accepts no parameters, resets count to zero, and returns nothing.
   */
   public static void resetCount()
   {
      totalItems = 0;
   }
  /**
  * Returns a String describing the BakedItem object.
  * @return output
  */
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      String output = "";
      output += this.getClass().toString().substring(6) + ": ";
      //overriding default toString method
      output += getName() + " - " + getFlavor() + "   ";
      output += "Quantity: " + getQuantity() + "   ";
      output += "Price: " + df.format(price()) + "\n(Ingredients: ";
      int numIngredients = ingredients.length;
      for (int i = 0; i < numIngredients; i++)
      {
         if ((i > 0) && (i % 5 == 0))
         {
         //returns new line after every 5 string elements
            output += "\n";
         }
         if (i != numIngredients - 1)
         {
            output += ingredients[i] + ", ";
         }
         else
         {
            output += ingredients[i] + ")";
         }
      }
      return output;
   }
   /**
   *An abstract method that accepts no parameters and returns a double 
   representing the price for a BakedItem.
   *@return price
   */
   public abstract double price();
}
