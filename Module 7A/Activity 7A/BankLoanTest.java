import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
 /**
* Bank loan activity.
* Activity 7A.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 11th october 2022
*/

public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
            //+ "this test once you have added your own.", 0, 1);
   //}
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10); loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }
}
