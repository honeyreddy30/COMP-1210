import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 /**
* Activity to experiment with implement interfaces.
* Acticity 7B.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 16th october 2022
*/
public class CustomerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**
   *Checks for the given location.
   */
   @Test public void setLocationTest1()
   {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Boston, MA");
      Assert.assertEquals("Boston, MA", cstmr.getLocation());
   }
   /**
   *Checks for the given location.
   */
   @Test public void setLocationTest2()
   {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Atlanta, GA");
      Assert.assertEquals("Atlanta, GA", cstmr.getLocation());
   }
   /**
   *Checks for the change balance.
   */
   @Test public void changeBalanceTest()
   {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.changeBalance(100);
      Assert.assertEquals(100, cstmr.getBalance(), 0.000001);
   }
   /**
   *Checks for the given to string method.
   */
   @Test public void toStringTest()
   {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Auburn, AL");
      cstmr.changeBalance(999);
      Assert.assertEquals("Lane, Jane\nAuburn, AL\n$999.0", cstmr.toString());
   }
   /**
   *Checks for the given 2 test info's.
   */
   @Test public void compareToTest1()
   {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(500);
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
      Assert.assertTrue(cstmr1.compareTo(cstmr2) == 0);
   }
   /**
   *Checks for the given 2 test info's.
   */
   @Test public void compareToTest2()
   {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(100);
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
      Assert.assertTrue(cstmr1.compareTo(cstmr2) < 0);
   }
   /**
   *Checks for the given 2 test info's.
   */
   @Test public void compareToTest3()
   {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(1000);
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
      Assert.assertTrue(cstmr1.compareTo(cstmr2) > 0);
   }
}
