import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Contains a set of test methods to test each of the methods.
* Project 8.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 28th october 2022
*/

public class RingTorusListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** Test method to return name of the ring torus list object.
   */
   @Test public void getNameTest()
   {
      RingTorus r = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus r1 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus r2 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rList = {r, r1, r2}; // creating array list
      RingTorusList tList = new RingTorusList("test", rList, 3);
      Assert.assertEquals("test", tList.getName());
   }
   /**Test for number of ring toruses.*/
   @Test public void numberOfRingTorusesTest()
   {
      RingTorus r = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus r1 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus r2 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rList = {r, r1, r2};
      RingTorusList tList = new RingTorusList("test", rList, 3);
      Assert.assertEquals(3, tList.numberOfRingToruses());
   }
   /**Test for totalDiameter.*/
   @Test public void totalDiameterTest()
   {
      RingTorus r = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus r1 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus r2 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rList = {r, r1, r2};
      // creating array list
      RingTorusList tList = new RingTorusList("test", rList, 3);
      Assert.assertEquals(445.98, tList.totalDiameter(), 0.0001);
   }
   /** Total diameter false test.*/
   @Test public void totalDiameterFasleTest()
   {
   //Testing when the list is empty
      RingTorus[] rList2 = {};
      RingTorusList tList2 = new RingTorusList("test", rList2, 0);
      Assert.assertEquals(0, tList2.totalDiameter(), 0.001);
   }
   /**Test for total Surface Area.*/
   @Test public void totalSurfaceAreaTest()
   {
      RingTorus r = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus r1 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus r2 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rList = {r, r1, r2};
      RingTorusList tList = new RingTorusList("test", rList, 3);
      Assert.assertEquals(186955.724, tList.totalSurfaceArea(), 0.001);
   }
   /**Total Surface Area false test.*/
   @Test public void totalSurfaceAreaFasleTest()
   {
   //Testing when the list is empty
      RingTorus[] rList2 = {};
      RingTorusList tList2 = new RingTorusList("test", rList2, 0);
      Assert.assertEquals(0, tList2.totalSurfaceArea(), 0.001);
   }

   /**Test for total Volume.*/
   @Test public void totalVolumeTest()
   {
      RingTorus r = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus r1 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus r2 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rList = {r, r1, r2};
      RingTorusList tList = new RingTorusList("test", rList, 3);
      Assert.assertEquals(2868020.119, tList.totalVolume(), 0.001);
   }
   /** Volume false test.*/
   @Test public void totalVolumeFasleTest()
   {
   //Testing when the list is empty
      RingTorus[] rList2 = {};
      RingTorusList tList2 = new RingTorusList("test", rList2, 0);
      Assert.assertEquals(0, tList2.totalVolume(), 0.001);
   }

   /**Test for average diameter.*/
   @Test public void averageDiameterTest()
   {
      RingTorus r = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus r1 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus r2 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rList = {r, r1, r2};
      RingTorusList tList = new RingTorusList("test", rList, 3);
      Assert.assertEquals(148.66, tList.averageDiameter(), 0.001);
   }
   /** average diameter false test.*/
   @Test public void averageDiameterFasleTest()
   {
   //Testing when the list is empty
      RingTorus[] rList2 = {};
      RingTorusList tList2 = new RingTorusList("test", rList2, 0);
      Assert.assertEquals(0, tList2.averageDiameter(), 0.001);
   }
   /** test for average surface area.*/
   @Test public void averageSurfaceAreaTest()
   {
      RingTorus r = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus r1 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus r2 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rList = {r, r1, r2};
      RingTorusList tList = new RingTorusList("test", rList, 3);
      Assert.assertEquals(62318.575, tList.averageSurfaceArea(), 0.001);
   }
   /**average surface area false test.*/
   @Test public void averageSurfaceAreaFasleTest()
   {
   //Testing when the list is empty
      RingTorus[] rList2 = {};
      RingTorusList tList2 = new RingTorusList("test", rList2, 0);
      Assert.assertEquals(0, tList2.averageSurfaceArea(), 0.001);
   }
  /** Test for average volume.*/
   @Test public void averageVolume()
   {
      RingTorus r = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus r1 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus r2 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rList = {r, r1, r2};
      RingTorusList tList = new RingTorusList("test", rList, 3);
      Assert.assertEquals(956006.706, tList.averageVolume(), 0.001);
   }
   /** average volume false test.*/
   @Test public void averageVolumeFasleTest()
   {
   //Testing when the list is empty
      RingTorus[] rList2 = {};
      RingTorusList tList2 = new RingTorusList("test", rList2, 0);
      Assert.assertEquals(0, tList2.averageVolume(), 0.001);
   }
   /** Test for to string.*/
   @Test public void toStringTest()
   {
      RingTorus r = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus r1 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus r2 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rList = {r, r1, r2};
      RingTorusList tList = new RingTorusList("RingTorus Test List", rList, 3);
      Assert.assertEquals("----- Summary for RingTorus Test List -----"
         + "\nNumber of RingToruses: 3"
         + "\nTotal Diameter: 445.98 units"
         + "\nTotal Surface Area: 186,955.724 square units"
         + "\nTotal Volume: 2,868,020.119 cubic units"
         + "\nAverage Diameter: 148.66 units"
         + "\nAverage Surface Area: 62,318.575 square units" 
         + "\nAverage Volume: 956,006.706 cubic units", tList.toString());
   }
   /** test for get List.*/
   @Test public void getListTest()
   {
      RingTorus r = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus r1 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus r2 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rList = {r, r1, r2};
      RingTorusList tList = new RingTorusList("RingTorus Test List", rList, 3);
      Assert.assertArrayEquals(rList, tList.getList());
   } 
   /** Delete ring torus true test.*/
   @Test public void deleteRingTorusTrueTest()
   {
      RingTorus r = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus r1 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus r2 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rList = {r, r1, r2};
      RingTorusList tList = new RingTorusList("Small Example", rList, 3); 
      Assert.assertEquals(r, tList.deleteRingTorus("Small Example"));
   }
   /** Delete ring torus false test.*/
   @Test public void deleteRingTorusFalseTest()
   {
   //Testing when the list is null
      RingTorus r = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus r1 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus r2 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rList = {r, r1, r2};
      RingTorusList tList = new RingTorusList("Small Example", rList, 3);
      Assert.assertEquals(null, tList.deleteRingTorus("test"));
   }
   /** Find ring torus true test.*/
   @Test public void findRingTorusTrueTest()
   {
      RingTorus r = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus r1 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus r2 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rList = {r, r1, r2};
      RingTorusList tList = new RingTorusList("Example", rList, 3); 
      Assert.assertEquals(rList[0], tList.findRingTorus("Small Example"));
   }
   /**find ring torus false test.*/
   @Test public void findRingTorusFasleTest()
   {
   //Testing when the list is null
      RingTorus[] rList2 = {};
      RingTorusList tList2 = new RingTorusList("test", rList2, 0);
      Assert.assertEquals(null, tList2.findRingTorus("Small Example"));
   }
   /** edit ring torus true test.*/
   @Test public void editRingTorusTrueTest()
   {
      RingTorus r = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus r1 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus r2 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rList = {r, r1, r2};
      RingTorusList tList = new RingTorusList("Small Example", rList, 3);
      Assert.assertEquals(true, tList.editRingTorus("Small Example", 10, 5));
   }
   /** edit ring torus false test.*/
   @Test public void editRingTorusFalseTest()
   {
      RingTorus r = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus r1 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus r2 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rList = {r, r1, r2};
      RingTorusList tList = new RingTorusList("Small Example", rList, 3);
      Assert.assertEquals(false, tList.editRingTorus("Example2", 10, 5));
   }
   /**largest volume test.*/
   @Test public void largestVolumeTest()
   {
      RingTorus r = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus r1 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus r2 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rList = {r, r1, r2};
      RingTorusList tList = new RingTorusList("Small Example", rList, 3);
      Assert.assertEquals(r2, tList.findRingTorusWithLargestVolume());
   }
   /** find ring torus with largest volume false test.*/
   @Test public void largestVolumeFasleTest()
   {
      RingTorus[] rList2 = {};
      RingTorusList tList2 = new RingTorusList("test", rList2, 0);
      Assert.assertEquals(null, tList2.findRingTorusWithLargestVolume());
   }
   /** Test to add ring torus. */
   @Test public void addRingTorusTest()
   {
      RingTorus[] rtArray = new RingTorus[4];
      RingTorus r = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus r1 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus r2 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorusList rtList = new RingTorusList("Example", rtArray, 3);
      //Creating new list
      RingTorus rt1 = new RingTorus("Example1", 20, 10);
      rtList.addRingTorus("Example1", 20, 10);
      RingTorus[] rtArray2 = rtList.getList();
      Assert.assertEquals(rt1, rtArray[3]);
   }
}