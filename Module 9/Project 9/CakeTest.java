import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test; 
/**
* Test file for Cake.
* Project 9.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 4th november 2022
*/
public class CakeTest {
/** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** Test for getLayers and setLayers. */
   @Test public void layerTest()
   {
      Cake cake1 = new Cake("Birthday", "Chocolate", 1, 1,
         "flour", "sugar", "cocoa powder", "vanilla", "eggs", "butter", 
         "baking soda", "baking powder", "salt");
      cake1.setLayers(2);
      Assert.assertEquals(2, cake1.getLayers());
   }
   /** Test for price. */
   @Test public void priceTest()
   {
      Cake cake1 = new Cake("Birthday", "Chocolate", 1, 1,
         "flour", "sugar", "cocoa powder", "vanilla", "eggs", "butter", 
         "baking soda", "baking powder", "salt");
      Assert.assertEquals(8.00, cake1.price(), 0.01);
   }
}
