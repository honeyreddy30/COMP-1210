import java.util.Scanner;
import java.util.ArrayList;
/**
* TemperatureInfo will allow users to interact with the Temperatures class.
* Activity 6.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 26th september 2022
*/
public class TemperatureInfo {
/** Prints temperature information.
*@param args - Standard commandline arguements
*/
   public static void main(String[] args) {
   // create scanner object 
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals(""))
         {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } 
      while (!tempInput.equals(""));
      Temperatures temps = new Temperatures(tempsList);
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp, "
            + "[P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            case 'P':
               System.out.println(temps);
               break;
            case 'E':
               System.out.println("\tDone");
               break;
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   }
}
