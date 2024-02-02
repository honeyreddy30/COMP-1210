import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Arrays;
/**
* BakedItemList class provides methods for reading in the data file and 
generating reports.
* Project 11.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 18th november 2022
*/
public class BakedItemList
{
//name of the list
   private String listName;
   //array of ingredients
   private BakedItem[] itemList;
   private int itemCount;
   private String[] excludedRecords;
   private int excludedCount;
   private static int listCount = 0;
   /**
   *All fields below should be private. 
   */
   public BakedItemList()
   {
   //String list name
      listName = "";
      itemList = new BakedItem[100];
      itemCount = 0;
      excludedRecords = new String[30];
      excludedCount = 0;
      listCount++;
   }
   /**
   *String that represents the name of the BakedItemList. 
   *@return listName
   */
   public String getListName()
   {
      return listName;
   }
   /**
   * An array that can hold up to 100 BakedItem objects.
   *@param listNameIn for listName
   */
   public void setListName(String listNameIn)
   {
      listName = listNameIn;
   }
   /**
   *returns the BakedItem array representing the itemList. 
   *@return itemList
   */
   public BakedItem[] getItemList()
   {
      return itemList;
   }
   /**
   *as no return value, accepts a BakedItem array, and then assigns it to 
itemList (used in conjunction with setItemCount to provide a new 
BakedItem array 
and itemCount). 
*@param itemListIn for itemList
*/
   public void setItemList(BakedItem[] itemListIn)
   {
      itemList = itemListIn;
   }
   /**
   * Returns the current value of itemCount.
   * @return itemCount
   */
   public int getItemCount()
   {
      return itemCount;
   }
   /**
   * Has no return value, accepts an int, and assigns it to itemCount.
   * @param itemCountIn for itemCount
   */ 
   public void setItemCount(int itemCountIn)
   {
      itemCount = itemCountIn;
   }
   /**
   * Returns the String array representing the excludedRecords.
   * @return excludedRecords
   */ 
   public String[] getExcludedRecords()
   {
      return excludedRecords;
   }
   /**
   * has no return value, accepts a String array, and then assigns it 
to excludedRecords (used in conjunction with setExcludedCount to provide a new 
excluded records array and new excluded records count). 
   * @param excludedRecordsIn for excludedRecords
   */ 
   public void setExcludedRecords(String[] excludedRecordsIn)
   {
      excludedRecords = excludedRecordsIn;
   }
   /**
   * Returns the current value of excludedCount.
   *@return excludedCount
   */
   public int getExcludedCount()
   {
      return excludedCount;
   }
   /**
   * Has no return value, accepts an int, and sets excludedCount to it.
   *@param excludedCountIn for excludedCount
   */
   public void setExcludedCount(int excludedCountIn)
   {
      excludedCount = excludedCountIn;
   }
   /**
   * Static method that returns the current value of listCount.
   *@return listCount
   */ 
   public static int getListCount()
   {
      return listCount;
   }
   /**
   * Static method that has no return value and sets listCount to 0. 
   */
   public void resetListCount()
   {
      listCount = 0;
   }
   /**
   * Has no return value and accepts the data file name as a String.
  * @param fileNameIn for fileName
  *@throws FileNotFoundException when file is not found
   */ 
   public void readItemFile(String fileNameIn) throws FileNotFoundException
   {
   //creating a scanner class
      Scanner fileScan = new Scanner(new File(fileNameIn));
      listName = fileScan.nextLine();
      while (fileScan.hasNext())
      {
      // Reads lines
         String line1 = fileScan.nextLine();
         //set the delimiter to use a “,”.
         Scanner scanLine = new Scanner(line1).useDelimiter(",");
         String category = scanLine.next().substring(0, 1);
         String flavor = "";
         //number of layers
         int layers = 0;
         //number of tiers
         int tiers = 0;
         String name = "";
         int quantity = 0;
         double crustCost = 0.0;
         String[] ingredients = new String[50];
         int totalItems = 0;
         //Each baked item line in the file begins with a category 
         //for the baked item (C, P, K, and W are valid categories 
         //for baked items indicating Cookie, Pie, K for Cake, and 
         //WeddingCake respectively).
         try 
         {
            switch (category)
            {
               case "C":
                  name = scanLine.next();
                  flavor = scanLine.next();
                  quantity = Integer.parseInt(scanLine.next());
                  String[] cookieIngs = {};
                  
                  while (scanLine.hasNext())
                  {
                     ingredients[totalItems] = scanLine.next();
                     totalItems++;
                  }
                  
                  cookieIngs = Arrays.copyOf(ingredients, totalItems);
                  // empty array of cookie ingredients
                  BakedItem cookie = new Cookie(name, flavor, quantity, 
                     cookieIngs);
                     
                  itemList[itemCount] = cookie;
                  //incrementing item count
                  itemCount++;
                  break;
               case "P":
                  name = scanLine.next();
                  flavor = scanLine.next();
                  quantity = Integer.parseInt(scanLine.next());
                  crustCost = Double.parseDouble(scanLine.next());
                  String[] pieIngs = {};
                  
                  while (scanLine.hasNext())
                  {
                     ingredients[totalItems] = scanLine.next();
                     totalItems++;
                  }
                  
                  pieIngs = Arrays.copyOf(ingredients, totalItems);
                  //empty arrayof pie ingredients
                  BakedItem pie = new Pie(name, flavor, quantity, 
                     crustCost, pieIngs);
                  itemList[itemCount] = pie;
                  //incrementing item count
                  itemCount++;
                  break;
               case "K":
                  name = scanLine.next();
                  flavor = scanLine.next();
                  quantity = Integer.parseInt(scanLine.next());
                  layers = Integer.parseInt(scanLine.next());
                  String[] cakeIngs = {};
                  
                  while (scanLine.hasNext())
                  {
                     ingredients[totalItems] = scanLine.next();
                     totalItems++;
                  }
                  
                  cakeIngs = Arrays.copyOf(ingredients, totalItems);
                  //empty array of cake ingredients
                  BakedItem cake = new Cake(name, flavor, quantity, 
                     layers, cakeIngs);
                  itemList[itemCount] = cake;
                  //incrementing item count
                  itemCount++;
                  break;
               case "W":
                  name = scanLine.next();
                  flavor = scanLine.next();
                  quantity = Integer.parseInt(scanLine.next());
                  layers = Integer.parseInt(scanLine.next());
                  tiers = Integer.parseInt(scanLine.next());
                  String[] weddingCakeIngs = {};
                  
                  while (scanLine.hasNext())
                  {
                     ingredients[totalItems] = scanLine.next();
                     totalItems++;
                  }
                  
                  weddingCakeIngs = Arrays.copyOf(ingredients, totalItems);
                  //empty array of wedding cake ingredients
                  BakedItem weddingCake = new WeddingCake(name, flavor, 
                     quantity, layers, tiers, weddingCakeIngs);
                  itemList[itemCount] = weddingCake;
                  //incrementing item count
                  itemCount++;
                  break;
               default:
                  throw new InvalidCategoryException(category);
            }
         }
         catch (InvalidCategoryException exception1)
         {
            excludedRecords[excludedCount] = "*** " + exception1 
               + " in:\n" + line1;
               //incrementing excluded count
            excludedCount++;
         }
         catch (NumberFormatException exception2)
         {
            excludedRecords[excludedCount] = "*** " 
               + exception2 + " in:\n" + line1;
               //incrementing excluded count
            excludedCount++;
         }
         catch (NoSuchElementException exception3)
         {
            excludedRecords[excludedCount] = "*** " 
               + exception3 + " in:\n" + line1;
               //incrementing excluded count
            excludedCount++;
         }
      }
   }
   /**
   * Processes the item list array using the original order from the file to 
produce the bakery Report which is returned as a String.
*@return report
*/ 
   public String generateReport()
   {
      String report = "";
      report += "\n---------------------------------------\n";
      report += "Report for " + listName + "\n";
      report += "---------------------------------------\n";
      for (int i = 0; i < itemCount; i++)
      {
         report += "\n" + itemList[i] + "\n";
      }
      return report;
   }
   /**
   * item list array and sorts the copy 
using the natural ordering, then processes the sorted 
array to produce the bakery Report 
(by Class) which is returned as a String.
*@return reportClass
*/
   public String generateReportByClass()
   {
      BakedItem[] itemClass = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(itemClass);
      String reportClass = "";
      reportClass += "\n---------------------------------------\n";
      reportClass += "Report for " + listName + " (by Class)\n";
      reportClass += "---------------------------------------\n";
      for (int i = 0; i < itemClass.length; i++)
      {
         reportClass += "\n" + itemClass[i] + "\n";
      }
      return reportClass;
   }
   /**
   * makes a copy of the item list array and sorts the copy by 
item price, then processes the sorted array to produce the 
bakery Report (by Price) which 
is returned as a String. 
* @return reportPrice
*/
   public String generateReportByPrice()
   {
      BakedItem[] itemPrice = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(itemPrice, new PriceComparator());
      String reportPrice = "";
      reportPrice += "\n---------------------------------------\n";
      reportPrice += "Report for " + listName + " (by Price)\n";
      reportPrice += "---------------------------------------\n";
      for (int i = 0; i < itemCount; i++) 
      {
         reportPrice += "\n" + itemPrice[i] + "\n";
      }
      return reportPrice;
   }
      /**
   * makes a copy of the item list array and sorts the copy 
by flavor, then processes the sorted array to produce the bakery 
Report (by Flavor) which 
is returned as a String. 
* @return reportFlavor
*/
   public String generateReportByFlavor()
   {
      BakedItem[] itemFlavor = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(itemFlavor, new FlavorComparator());
      String reportFlavor = "";
      reportFlavor += "\n---------------------------------------\n";
      reportFlavor += "Report for " + listName + " (by Flavor)\n";
      reportFlavor += "---------------------------------------\n";
      for (int i = 0; i < itemCount; i++)
      {
         reportFlavor += "\n" + itemFlavor[i] + "\n";
      }
      return reportFlavor;
   }   /**
   * processes the excludedRecords array to 
produce the Excluded Records Report which is returned as a String. 
* @return reportExcluded
*/
   public String generateExcludedRecordsReport()
   {
      String reportExcluded = "";
      reportExcluded += "\n---------------------------------------\n";
      reportExcluded += "Excluded Records Report\n";
      reportExcluded += "---------------------------------------\n";
      for (int i = 0; i < excludedCount; i++)
      {
         reportExcluded += "\n" + excludedRecords[i];
      }
      return reportExcluded;
   }
}
