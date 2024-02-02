import java.util.Scanner;
/**
*HexagonalPrism class stores the label, edge, and height and calculates area, 
*lateral surface area, base area and volume.
*Project04.
*@author Honey Reddy Nagireddy - COMP 1210-006
*@version 16th september 2022
*/
public class HexagonalPrismApp {
/**
*Takes the user entered data and calculates label, edge, and height and 
*calculates area,lateral surface area, base area and volume.
*@param args Commands line arguements (not used).
*/
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String scanLabel;
      double scanEdge;
      double scanHeight;
      HexagonalPrism t = new HexagonalPrism();
      System.out.print("Enter label, edge, and height" 
         + " for a hexagonal prism.");
      System.out.print("\n\tlabel: ");
      scanLabel = scan.nextLine();
      if (scanLabel != null) {
         System.out.print("\tedge: ");
         scanEdge = scan.nextDouble();
         //checking if scanedge is less than or equal to 0
         if (scanEdge <= 0) {
            System.out.print("Error: edge must be greater than zero.");
            System.out.print("\n");
            return;
         }
         else { // if greater than and not equal to 0
            System.out.print("\theight: ");
            scanHeight = scan.nextDouble();
            if (scanHeight <= 0) { 
            // checking if scanheight is less than or equal to 0
               System.out.print("Error: height must be greater than zero.");
               System.out.print("\n");
               return;
            }
            else { //if greater than and not equal to 0
            
               t.setLabel(scanLabel);
               t.setEdge(scanEdge);
               t.setHeight(scanHeight);
               t.surfaceArea();
               t.lateralSurfaceArea();
               t.baseArea();
               t.volume();
               System.out.println("\n" + t);
            }
         }
      }
   }
}

