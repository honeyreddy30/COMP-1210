 /**
* Contains a set of test methods to test each of the methods.
* Project 7A.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 14th october 2022
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
      Assert.assertFalse(ex1.setLargeRadius(-1));
   }
   /**
   *Test to check set small radius method.
   */
   @Test public void setSmallRadiusTest()
   {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      Assert.assertTrue(ex1.setSmallRadius(1.25));
      Assert.assertFalse(ex1.setLargeRadius(-1));
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
   *Test to check equals method.
   */
   @Test public void equalsTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      Assert.assertFalse("Equals Test", false);
      RingTorus rt = (RingTorus) ex1;
      Assert.assertTrue("Equals Test", ex1.equals(rt));
   }
   
}
