/**
 * Program that stores the name of the list and an ArrayList of 
 * HexagonalPrism objects.
 * Project 05.
 * @author Honey Reddy Nagireddy - COMP 1210 -006
 * @version 21th September 2022
 */
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Demonstrates the ArrayList class.
 */
public class HexagonalPrismList 
{
//fields
   private String name = "";
   private ArrayList<HexagonalPrism>  hrList
      = new ArrayList<HexagonalPrism>();
     /** Constructor for HexagonalPrismList.
     *@param nameIn for name
     *@param hrListIn for hrList
     */
   public HexagonalPrismList(String nameIn, ArrayList<HexagonalPrism> hrListIn)
   {
      name = nameIn;
      hrList = hrListIn;
   }
      /**
   *Returns a string representing the name of the list.
   *@return name
   */

   public String getName()
   {
      return name;
   }
     /**
     *Returns int representing the number of HexagonalPrism.
     *objects in HexagonalPrismList.
     *@return size of list
     */
   public int numberOfHexagonalPrisms()
   {
      while (hrList.size() != 0)
      {
         int hrListLength = hrList.size();
         return hrListLength;
      }
      return 0;
   }
   /**
   *Returns a double representing the total surface area for all
   * hexagonalPrism objects in a string.
   *@return double hrListTotalSurfaceArea
   */
   public double totalSurfaceArea()
   {
      int index = 0;
      double hrListTotalSurfaceArea = 0;
      if (hrList.size() != 0) 
      {
         while (index < hrList.size())
         {
            hrListTotalSurfaceArea += hrList.get(index).surfaceArea();
            index++;
         }
         return hrListTotalSurfaceArea;
      }
      else
      {
         return hrListTotalSurfaceArea;
      }
   }
    /**
   *Returns a double representing the total surface area for all
   * hexagonalPrism objects in a string.
   *@return double hrListTotalVolume
   */
   public double totalVolume()
   {
      int index = 0;
      double hrListTotalVolume = 0;
      if (hrList.size() > 0) 
      {
         while (index < hrList.size())
         {
            hrListTotalVolume += hrList.get(index).volume();
            index++;
         }
         return hrListTotalVolume;
      }
      else
      {
         return hrListTotalVolume;
      }
   
   }
   /**
   *Returns a double representing the average surface area for all.
   * hexagonalPrism objects in the hrList
   *@return hrListAverageArea
   */
   public double averageSurfaceArea()
   {
      double hrListAverageArea = 0;
      if (hrList.size() != 0) {
         hrListAverageArea = totalSurfaceArea() / hrList.size();
         return hrListAverageArea;
      }
      else 
      {
         return hrListAverageArea;
      }
   }
   /**
   *Returns a double representing the average Volume for all.
   * hexagonalPrism objects in the hrList
   *@return hrListAverageVolume
   */
   public double averageVolume()
   {
      double hrListAverageVolume = 0.0;
      if (hrList.size() != 0)
      {
         hrListAverageVolume = totalVolume() / hrList.size();
         return hrListAverageVolume;
      }
      else
      {
         return hrListAverageVolume;
      }
   }
   /**
   *Returns a string containing the name of the list  result.
   *followed by each HexagonalPrism in arraylist
   *@return output
   */

   public String toString() {
      String output;
      int index = 0;
      output = "----- " + getName() + " -----\n";
      if (hrList.size() > 0)
      {
         while (index < hrList.size()) {
            output += "\n" + hrList.get(index).toString()
               + "\n";
            index++;
         }
         return output;
      }
      else 
      {
         output += "";
      }
      return output;
   }
   /**
   *Returns a string containing the name of the list followed by various.
   *summary items in required decimal format.
   *@return output
   */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output += "----- Summary for " + getName() + " -----";
      output += "\nNumber of HexagonalPrisms: " + hrList.size();
      output += "\nTotal Surface Area: " 
         + df.format(totalSurfaceArea()) 
         + " square units";
      output += "\nTotal Volume: " + df.format(totalVolume()) 
         + " cubic units";
      output += "\nAverage Surface Area: " 
         + df.format(averageSurfaceArea()) 
         + " square units";
      output += "\nAverage Volume: " + df.format(averageVolume()) 
         + " cubic units";
      return output;
   }
   /**
   *Returs the hrList.
   *@return hrList
   */
   public ArrayList<HexagonalPrism> getList() {
      return hrList;
   }
   /**
   *Reads the file.
   *@return hpObjects
   *@throws FileNotFoundException if file is not found
   *@param fileNameIn for fileName
   */
   public HexagonalPrismList readFile(String fileNameIn) 
      throws FileNotFoundException {
      Scanner fileScan = new Scanner(new File(fileNameIn));
      ArrayList<HexagonalPrism> listHpObjects = new ArrayList<HexagonalPrism>();
      String listHp = "";
      String label = "";
      double edge = 0;
      double height = 0;
      name = fileScan.nextLine();
      while (fileScan.hasNext())
      {
         label = fileScan.nextLine();
         edge = Double.parseDouble(fileScan.nextLine());
         height = Double.parseDouble(fileScan.nextLine());
         HexagonalPrism hp = new HexagonalPrism(label, edge, height);
         listHpObjects.add(hp);
      }
      HexagonalPrismList hpObjects = 
         new HexagonalPrismList(name, listHpObjects);
      return hpObjects;
   }
/**
*Adds a hexagonal Prism to the list.
*@param labelIn for label
*@param edgeIn for edge
*@param heightIn for Height
*/
   public void addHexagonalPrism(String labelIn, double edgeIn, double heightIn)
   {
      HexagonalPrism newhpList = new HexagonalPrism(labelIn, edgeIn, heightIn);
      hrList.add(newhpList);
   }
   /**
   *Finds the hexagonal prism the use wants and returns.
   *@return null
   *@param labelIn for label
   */
   public HexagonalPrism findHexagonalPrism(String labelIn)
   {
      for (HexagonalPrism h : hrList) {
         String label = h.getLabel();
         if (h.getLabel().equalsIgnoreCase(labelIn)) {
            return h;
         }
      }
      return null;
   }
   /**
   *Deletes the hexagonalPrism the user wants.
   *@return boolean 
   *@param labelIn for label
   */
   public HexagonalPrism deleteHexagonalPrism(String labelIn) {
      if (findHexagonalPrism(labelIn) != null) {
         HexagonalPrism delete = findHexagonalPrism(labelIn);
         hrList.remove(findHexagonalPrism(labelIn));
         return delete;
      }
      else {
         return null;
      }
   }
   /**
   *Edits the hexagonal prism list. 
   *@return boolean
   *@param labelIn for label
*@param edgeIn for edge
*@param heightIn for Height
*/
   
   public boolean editHexagonalPrism(String labelIn, double edgeIn, 
      double heightIn) 
   {
      if (findHexagonalPrism(labelIn) != null) {
         findHexagonalPrism(labelIn).setEdge(edgeIn);
         findHexagonalPrism(labelIn).setHeight(heightIn);
         return true;
      }
      else {
         return false;
      }
   }

}
