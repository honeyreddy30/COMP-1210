import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 * Program that stores the name of the list and an ArrayList of 
 * HexagonalPrism objects.
 * Project 05.
 * @author Honey Reddy Nagireddy - COMP 1210 -006
 * @version 21th September 2022
 */
public class HexagonalPrismListMenuApp
{
 /**
*Gets user data and makes changes as the user wants.
*@param args - is not used.
*@throws FileNotFoundException if file not found
*/
   public static void main(String[] args) throws FileNotFoundException
   {
      String hpListName = "no list name";
      ArrayList<HexagonalPrism> hrList = new ArrayList<HexagonalPrism>();
      HexagonalPrismList myHPList = new HexagonalPrismList(hpListName, hrList);
      String fileName = "no file name";
      String label = "";
      double edge = 0;
      double height = 0;
      String code = "";
      Scanner scan = new Scanner(System.in);
      System.out.println("HexagonalPrism List System Menu\n"
            + "R - Read File and Create HexagonalPrism List\n" 
            + "P - Print HexagonalPrism List\n"
            + "S - Print Summary\n"
            + "A - Add HexagonalPrism\n"
            + "D - Delete HexagonalPrism\n"
            + "F - Find HexagonalPrism\n"
            + "E - Edit HexagonalPrism\n"
            + "Q - Quit");
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R': // Read in File and Create HexagonalPrismList
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
            
               myHPList = myHPList.readFile(fileName);
            
               System.out.println("\tFile read in and "
                              + "HexagonalPrism List created\n");
               break;
            case 'P': // Print HexagonalPrismList
               System.out.println("\n" + myHPList);
               break;
            case 'S': // Print SummaryInfo
               System.out.println("\n" 
                                    + myHPList.summaryInfo() + "\n");
               break;
            case 'A': // Add Hexagonalprism Object
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               myHPList.addHexagonalPrism(label, edge, height);
               System.out.println("\t*** HexagonalPrism added ***\n");
               break;
            case 'D': // Delete HexagonalPrism Object
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               if (myHPList.deleteHexagonalPrism(label) != null) {
                  System.out.println("\t\"" + label
                        + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            case 'F': // Find HexagonalPrism Object
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               HexagonalPrism z = myHPList.findHexagonalPrism(label);
               if (z != null) {
                  System.out.println(z + "\n");
               }
               else
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            case 'E': // Add Hexagonalprism Object
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               if (myHPList.editHexagonalPrism(label, edge, height)) {
                  System.out.println("\t\"" 
                     +  myHPList.findHexagonalPrism(label).getLabel()
                     + "\" successfully edited\n");
               }
               else {
                  System.out.println("\t\"" + label
                        + "\" not found\n");
               }
               break;
            case 'Q': // Quit
               break;
               
            default: 
               System.out.println("\t*** invalid code ***\n");
               break; 
         }
      } while (!code.equalsIgnoreCase("Q"));
   }
}
         
