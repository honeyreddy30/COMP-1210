import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test; 
/**
* Test file for WeddingCake.
* Project 9.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 4th november 2022
*/
public class WeddingCakeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** Test for getTiers and setTiers. */
   @Test public void tierTest()
   {
      WeddingCake cake3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3, 
         "flour", "sugar", "buttermilk", "coffee",
         "eggs", "butter", "baking soda", "baking powder", "salt");
      cake3.setTiers(4);
      Assert.assertEquals(4, cake3.getTiers());
   }
  /** Test for price. */
   @Test public void priceTest()
   {
      WeddingCake cake3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3, 
         "flour", "sugar", "buttermilk", "coffee",
         "eggs", "butter", "baking soda", "baking powder", "salt");
      Assert.assertEquals(135.00, cake3.price(), 0.01);
   }

}
