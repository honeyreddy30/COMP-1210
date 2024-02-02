import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Program that stores the name of the list and an ArrayList of 
 * HexagonalPrism objects.
 * Project 05.
 * @author Honey Reddy Nagireddy - COMP 1210 -006
 * @version 22nd September 2022
 */
public class HexagonalPrismListApp {
/**
*Creating a public class HexagonalPrismApp.
*@param args Command line arguements - not used
*@throws FileNotFoundException for Scanner on file
*/
   public static void main(String[] args) throws FileNotFoundException
   {
   //Intializing varaibles and parameters
      ArrayList<HexagonalPrism> hexagonalList =
         new ArrayList<HexagonalPrism>();
      double edge = 0;
      double height = 0;
      String input;
      String label;
      String hrListName;
      String fileName;
      Scanner scan = new Scanner(System.in);
      //Promt the user to enter a file name
      System.out.print("Enter file name: ");
      fileName = scan.nextLine();
      //Second scanner class
      Scanner file = new Scanner(new File(fileName));
      hrListName = file.nextLine();
      //Reads every input and adds every Hexagonal Prism
      while (file.hasNext()) {
      //reads the values of label edge and height 
         label = file.nextLine();
         edge = Double.parseDouble(file.nextLine());
         height = Double.parseDouble(file.nextLine());
         //hexagonalprism object
         HexagonalPrism hp = new HexagonalPrism(label, edge, height);
         hexagonalList.add(hp);
      }
      HexagonalPrismList newHexagonalList = 
               new HexagonalPrismList(hrListName, hexagonalList);
      System.out.println("\n" + newHexagonalList + "\n");
      System.out.println(newHexagonalList.summaryInfo());
   }
}