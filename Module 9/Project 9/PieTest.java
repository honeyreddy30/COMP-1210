import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Test file for pie.
* Project 9.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 4th november 2022
*/
public class PieTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** Test for crustCost. */
   @Test public void crustTest()
   {
      Pie p2 = new Pie("Summer Special", "Key Lime", 1, 2.0,
         "flour", "sugar", "lime juice", "lemon juice",
         "graham crackers", "butter", "baking soda", "salt");
      p2.setCrustCost(2.0);
      Assert.assertEquals(2, p2.getCrustCost(), 0.01);
   }
   /** Test for price. */
   @Test public void priceTest()
   {
      Pie p2 = new Pie("Summer Special", "Key Lime", 1, 2.0,
         "flour", "sugar", "lime juice", "lemon juice",
         "graham crackers", "butter", "baking soda", "salt");
      Assert.assertEquals(14.00, p2.price(), 0.01);
   }
   
}
