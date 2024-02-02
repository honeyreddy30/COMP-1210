import java.text.DecimalFormat;
/**
* Class that stores the name of the list and an array of ring torus objects.
* Project 8.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 28th october 2022
*/

public class RingTorusList 
{
//instance variables
   private String name;
   private RingTorus[] rtList;
   private int numObj;
/**
* Accepts three parameters.
* @param nameIn for name 
* @param rtListIn for rtList
* @param numObjIn for numObj
*/

   public RingTorusList(String nameIn, RingTorus[] rtListIn, int numObjIn)
   {
      name = nameIn;
      rtList = rtListIn;
      numObj = numObjIn;
   }
   /**
   * Returns a string representing the name of the list.
   * @return name
   */
   public String getName()
   {
      return name;
   }
/**
*Returns an int (the value of the third field in the RingTorusList object) 
representing the number of RingTorus objects in the RingTorusList.
*@return numObj
*/
   public int numberOfRingToruses()
   {
      return numObj;
   }
/**
*Returns a double representing the total diameters for all RingTorus 
objects in the list.
*@return totalResult
*/
   public double totalDiameter()
   {
      double result = 0.0;
      double totalResult = 0.0;
      int i = 0;
      if (numObj > 0)
      //if number of object is greater than 0
      {
         while (i < numObj)
         {
            result = rtList[i].diameter();
            totalResult += result;
            i++;
         }
      }
      else
      //If there are zero RingTorus objects in the list, zero should 
      //be returned.
      {
         totalResult = 0.0;
      }
      return totalResult;
   }
   /**
   * Returns a double representing the total surface areas for all 
   RingTorus objects in the list.
   * @return totalResult.
   */
   public double totalSurfaceArea()
   {
      double result = 0.0;
      double totalResult = 0.0;
      int i = 0;
      if (numObj > 0)
      // if number of object is greater than 0
      {
         while (i < numObj)
         {
            result = rtList[i].surfaceArea();
            totalResult += result;
            i++;
         }
      }
      else
      //If there are zero RingTorus objects in the list, zero 
      //should be returned.
      {
         totalResult = 0.0;
      }
      return totalResult;
   }
   /**
   * Returns a double representing the total volumes 
   for all RingTorus objects in the list.
   * @return totalResult
   */
   public double totalVolume()
   {
      double result = 0.0;
      double totalResult = 0.0;
      int i = 0;
      if (numObj > 0)
      // if number f objects are greater than 0.
      {
         while (i < numObj)
         {
            result = rtList[i].volume();
            totalResult += result;
            i++;
         }
      }
      else
      //If there are zero RingTorus objects in the list, 
      //zero should be returned.
      {
         totalResult = 0.0;
      }
      return totalResult;
   }
   /**
   * Returns a double representing the average diameter for all 
   RingTorus objects in the list.
   * @return average1
   */
   public double averageDiameter()
   {
      double average1 = 0.0;
      if (numObj > 0)
      {
         average1 += totalDiameter() / numObj;
         return average1;
      }
      else
      {
         return average1;
      }
   }
   /**
   *Returns a double representing the average surface area for all 
   RingTorus objects in the list.
   * @return average2
   */
   public double averageSurfaceArea()
   {
      double average2 = 0.0;
      if (numObj > 0)
      {
         average2 += totalSurfaceArea() / numObj;
         return average2;
      }
      else
      {
         return average2;
      }
   }
   /**
   *Returns a double representing the average volume for all 
   RingTorus objects in the list.
   * @return average3
   */

   public double averageVolume()
   {
      double average3 = 0.0;
      if (numObj > 0)
      {
         average3 += totalVolume() / numObj;
         return average3;
      }
      else
      {
         return average3;
      }
   }
   /**
   *Returns a string containing the name of the list followed by various.
   *summary items in required decimal format.
   *@return output
   */

   public String toString()
   {
      String output = "";
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      output += "----- Summary for " + getName() + " -----";
      output += "\nNumber of RingToruses: " + numberOfRingToruses();
      output += "\nTotal Diameter: " + df.format(totalDiameter()) 
         + " units";
      output += "\nTotal Surface Area: " + df.format(totalSurfaceArea()) 
         + " square units";
      output += "\nTotal Volume: " + df.format(totalVolume()) 
         + " cubic units";
      output += "\nAverage Diameter: " + df.format(averageDiameter()) 
         + " units";
      output += "\nAverage Surface Area: " + df.format(averageSurfaceArea()) 
         + " square units";
      output += "\nAverage Volume: " + df.format(averageVolume()) 
         + " cubic units";
      return output;
   }
   /**
   *Returns the array of RingTorus objects.
   *@return rtList
   */
   public RingTorus[] getList()
   {
      return rtList;
   }
   /**
   *Returns nothing but takes three parameters
   creates a new RingTorus object, and adds it to the RingTorusList object 
   in the next available location in the RingTorus array.
   *increaments numObj
   *@param label for label
   *@param largeRadius for largeRadius
   *@param smallRadius for smallRadius
   */
   public void addRingTorus(String label, 
      double largeRadius, double smallRadius)
   {
      RingTorus torus = new RingTorus(label, largeRadius, smallRadius);
      rtList[numObj] = torus;
      numObj++;
   }
   /**
   *Takes a label of a RingTorus as the String parameter and returns the 
   corresponding RingTorus object if found in the RingTorusList object; 
   otherwise returns null.
   *@return rtList[index]
   *@param label for label
   */
   public RingTorus findRingTorus(String label)
   {
      int index = 0;
      while (index < numberOfRingToruses())
      {
         RingTorus rt1 = rtList[index];
         String label1 = rt1.getLabel();
         if (label.equalsIgnoreCase(label1))	  	
         {  	
            return rtList[index];  	
         }  	
         index++;	  	
      }	  	
      return null;	  	
   }
       /**
   * Takes a String as a parameter that represents the label of the RingTorus 
   and returns the RingTorus if it is found in the RingTorusList object and 
   deleted; otherwise returns null.
   *@return rtList[index]
   *@param labelIn for label
   */
   public RingTorus deleteRingTorus(String labelIn) {
      int index = -1;
      RingTorus result = null;
      for (int i = 0; i < numObj; i++)
      {
         if (rtList[i].getLabel().equalsIgnoreCase(labelIn))
         {
            result = rtList[i];
            for (int j = i; j < numObj - 1; j++)
            {
               rtList[j] = rtList[j + 1];
            }
            rtList[numObj - 1] = null;
            numObj--;
         }
      }
      return result;
   }
      
       /**
   *Takes three parameters (label, large radius, and small radius), 
   uses the label to find the corresponding the RingTorus object in 
   the list.
   *@return boolean
   *@param label for label
   *@param largeRadius for largeRadius
   *@param smallRadius for smallRadius
   */
   public  boolean editRingTorus(String label, 
      double largeRadius, double smallRadius)
   {
      boolean result = false;
      int index = 0;
      while (index < numObj)
      //while index is less than numObj
      {
         RingTorus torus = rtList[index];
         String label1 = torus.getLabel();
         if (label.equalsIgnoreCase(label1))
         {
            torus.setLargeRadius(largeRadius);
            torus.setSmallRadius(smallRadius);
            result = true;
         }
         //incrementing index
         index++;
      }
      return result;
   }
   /**
   *Returns the RingTorus with the largest volume; if the 
   list contains no RingTorus objects, returns null.
   *@return rt
   */
   public RingTorus findRingTorusWithLargestVolume()
   {
      
      if (numObj > 0)
      //if number of object is greater than 0
      //if not null, return rt
      //if null return null
      {
         RingTorus rt = rtList[0];
         for (int i = 0; i < numObj; i++)
         {
            if (rtList[i].volume() >= rt.volume())
            {
               rt = rtList[i];
            }
         }
         return rt;
      }
      return null;
   }
}
            
   
