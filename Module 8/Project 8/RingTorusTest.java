 /**
* Contains a set of test methods to test each of the methods.
* Project 8.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 28th october 2022
*/
import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*Creating a Ring Torus test class.
*/

public class RingTorusTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**
   *Test to check get label method.
   */
   @Test public void getLabelTest()
   {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      Assert.assertEquals("Get label test: ", 
         "Small Example", ex1.getLabel());
   } 
   /**
   *Test to check get large radius method.
   */ 
   @Test public void getLargeRadiusTest() 
   {  
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      Assert.assertEquals("Get large radius test: ", 
         9.5, ex1.getLargeRadius(), .001);
   }
   /**
   *Test to check get small radius method.
   */
   @Test public void getSmallRadiusTest()
   {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      Assert.assertEquals("Get small radius test: ", 
         1.25, ex1.getSmallRadius(), .001);
   }
   /**
   *Test to check set label method.
   */
   @Test public void setLabelTest()
   {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      Assert.assertTrue("Set label test: ", ex1.setLabel("ex1"));
      Assert.assertFalse("Set label test: ", ex1.setLabel(null));
   }
    /**
   *Test to check set large radius method.
   */
   @Test public void setLargeRadiusTest()
   {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      Assert.assertTrue(ex1.setLargeRadius(9.5));
      Assert.assertFalse(ex1.setLargeRadius(-1.0));
      Assert.assertFalse(ex1.setSmallRadius(-1.0));
      Assert.assertTrue(ex1.setSmallRadius(1.25));
      Assert.assertFalse(ex1.setLargeRadius(1.25));
   }
   /**
   *Test to check set small radius method.
   */
   @Test public void setSmallRadiusTest()
   {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      Assert.assertTrue(ex1.setSmallRadius(1.25));
      Assert.assertFalse(ex1.setLargeRadius(-1.0));
      Assert.assertFalse(ex1.setSmallRadius(-1.0));
      Assert.assertFalse(ex1.setSmallRadius(9.5));
      Assert.assertFalse(ex1.setSmallRadius(9.5));
   }
   /**
   *Test to check diameter.
   */
   @Test public void diameterTest()
   {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      Assert.assertEquals("Diameter test: ", 
         21.5, ex1.diameter(), .001);
   }
   /**
   *Test to check surface area.
   */
   @Test public void surfaceAreaTest()
   {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      Assert.assertEquals("Surface Area test: ", 
         468.806, ex1.surfaceArea(), .001);
   }
   /**
   *Test to check volume.
   */
   @Test public void volumeTest()
   {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      Assert.assertEquals("Volume test: ", 
         293.004, ex1.volume(), .001);
   }
   /**
   *Test to check to string method.
   */
   @Test public void toStringTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      Assert.assertTrue(ex1.toString().contains("\"Small Example\""));
   }
   /**
   *Test to check count and reset count.
   */
   @Test public void countTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      ex1.resetCount();
      Assert.assertEquals("Count test: ", 
         0, ex1.getCount());
   }
   /**
   *Test to check hash code method.
   */
   @Test public void hashCodeTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      Assert.assertEquals("Hash code test: ", 
         0, ex1.hashCode());
   }
   /**
   *Test to check equals False method.
   */
   @Test public void equalsTrueTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      //creating an object with different label but same large and 
      //small radius
      
      RingTorus ex2 = new RingTorus("Smallest Example", 9.5, 1.25);
      //creating an object with same label and small radius but different 
      //large radius
      
      RingTorus ex3 = new RingTorus("Small Example", 37.9, 1.25);
      //creating an object with same label and large radius but 
      //different small radius
      
      RingTorus ex4 = new RingTorus("Small Example", 9.5, 1.5);
      //creating a copy of ex1
      
      RingTorus rt = (RingTorus) ex1;
      Assert.assertTrue("Equals true test: ", ex1.equals(rt));
      Assert.assertFalse("Equals label false test: ", ex1.equals(ex2));
      Assert.assertFalse("Equals large radius false test: ", ex1.equals(ex3));
      Assert.assertFalse("Equals small radius false test: ", ex1.equals(ex4));
   }
   /**
   *Test to check equals False method.
   */
   @Test public void equalsFalseTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      Assert.assertFalse(ex1.equals(0));
   }

   /**Test to compare the volumes.
   */
   @Test public void compareToTest()
   {
      RingTorus rt1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus rt2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus rt3 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus rt = (RingTorus) rt1;
      
      //the volume of rt1 is less than rt2 so it returns -1, 
      //the test case is passed
      Assert.assertEquals("CompareTo test:", -1, rt1.compareTo(rt2));
      
      //the volume of rt2 is greater than rt1 so it returns 1, 
      //the test case is passed 
      Assert.assertEquals("CompareTo test:", 1, rt2.compareTo(rt1));
      
      //the volume of rt1 is equals than rt so it returns 0, 
      //the test case is passed  
      Assert.assertEquals("CompareTo test:", 0, rt1.compareTo(rt));
   }
}
