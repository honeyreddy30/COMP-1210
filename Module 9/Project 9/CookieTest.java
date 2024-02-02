import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Test file for cookie.
* Project 9.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 4th november 2022
*/

public class CookieTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
/** Test for getName and setName. */
   @Test public void nameTest()
   {
      Cookie coo = new Cookie("Chips Delight", "Chocolate Chip", 12,  
                        "flour", "sugar", "dark chocolate chips",  
                        "butter", "baking soda", "salt"); 
      coo.setName("Chips Delight");
      Assert.assertEquals("Chips Delight", coo.getName());
   }
   /** Test for getFlavor and setFlavor. */
   @Test public void flavourTest()
   {
      Cookie coo = new Cookie("Chips Delight", "Chocolate Chip", 12,  
                        "flour", "sugar", "dark chocolate chips",  
                        "butter", "baking soda", "salt"); 
      coo.setFlavor("Chocolate Chip");
      Assert.assertEquals("Chocolate Chip", coo.getFlavor());
   } 
   /** Test for getQuantity and setQuantity. */
   @Test public void quantityTest()
   {
      Cookie coo = new Cookie("Chips Delight", "Chocolate Chip", 12,  
                        "flour", "sugar", "dark chocolate chips",  
                        "butter", "baking soda", "salt"); 
      coo.setQuantity(12);
      Assert.assertEquals(12, coo.getQuantity());
   } 
   /** Test for getIngredients and setIngredients. */
   @Test public void ingredientsTest()
   {
      String[] ingredients = {"flour", "sugar", "dark chocolate chips", 
         "butter", "baking soda", "salt"};
      Cookie coo = new Cookie("Chips Delight", "Chocolate Chip", 12, 
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt");
      coo.setIngredients("flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt");
      Assert.assertArrayEquals(ingredients, coo.getIngredients());
   }
   /** Test for resetCount and getCount. */
   @Test public void countTest()
   {
      Cookie coo = new Cookie("Chips Delight", "Chocolate Chip", 12, 
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt");
      coo.resetCount();
      Assert.assertEquals(0, coo.getCount());
   }
   /** Test for toString. */
   @Test public void toStringTest()
   {
      Cookie coo = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt");
      Assert.assertTrue(coo.toString().contains("Price"));
   }
   /** test for price. */
   @Test public void priceTest()
   {
      Cookie coo = new Cookie("Chips Delight", "Chocolate Chip", 12, 
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt");
      Assert.assertEquals(4.20, coo.price(), 0.01);
   }
}
