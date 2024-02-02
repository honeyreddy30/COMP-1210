 /**
* Deriving the class Cake from class BakedItem.
* Project 11.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 18th november 2022
*/
public class Cake extends BakedItem
{
   protected int layers;
    /**
*Creating variables.
* @param args Command line arguements (not used)
*/
   public static final double BASE_RATE = 8;
/**
* Class must contain a constructor that accepts four parameters.
* @param nameIn for name
* @param flavorIn for flavor
* @param quantityIn for quantity
* @param ingredientsIn for ingredients
* @param layersIn for layers
*/
   public Cake(String nameIn, String flavorIn, int quantityIn,
      int layersIn, String...ingredientsIn)
   {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      layers = layersIn;
   }
   /**
   *Accepts no parameters and returns a double representing layers.
   *@return layers
   */
   public int getLayers()
   {
      return layers;
   }
   /**
   *Accepts double for layers, sets the field, and returns nothing.
   *@param layersIn for layers
   */
   public void setLayers(int layersIn)
   {
      layers = layersIn;
   }
   /**
   *Accepts no parameters and returns a double representing 
   the price for the Cake.
   *@return (BASE_RATE * layers) * quantity
   */
   public double price()
   {
      return (BASE_RATE * layers) * quantity;
   }
   
}
