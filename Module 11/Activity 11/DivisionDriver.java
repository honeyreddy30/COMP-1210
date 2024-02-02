import javax.swing.JOptionPane; 
    /**
* The program will get a numerator and denominator from the 
user and print the integer division and decimal division result.
* Activity 11 .
* @author Honey Reddy Nagireddy - COMP 1210-006
* @version 14th november 2022
*/

public class DivisionDriver {

/**
    * Create a dialog box that will get the numerator and 
    * denominator as a String.
    * @param args - Standard commandline arguments
    */
   public static void main(String[] args) {
      String numInput = JOptionPane.showInputDialog("Enter the numerator: ");
      String denomInput = JOptionPane.
         showInputDialog("Enter the denominator: ");
      try { 
         int numerator = Integer.parseInt(numInput);
         int denominator = Integer.parseInt(denomInput); 
         String result = "Integer division: \n"
            + Division.intDivide(numerator, denominator)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(numerator, denominator);
         JOptionPane.showMessageDialog(null, result,
            "Result", JOptionPane.PLAIN_MESSAGE);
      }
      catch (NumberFormatException e) {             
         JOptionPane.showMessageDialog(null,
            "Invalid input: enter numerical integer values only.",
            "Error", JOptionPane.ERROR_MESSAGE);
      }
      catch (IllegalArgumentException e) { 
         JOptionPane.showMessageDialog(null,
            e, "Error", JOptionPane.ERROR_MESSAGE);
      }
   }
}