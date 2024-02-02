import java.util.ArrayList;
/**
* Temperatures will hold a set of integer values representing daily 
* temperatures. 
*TemperatureInfo will allow users to interact with the Temperatures class.
* Activity 6.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 26th september 2022
*/
public class Temperatures {
/** 
*Initialise variable of type ArrayList.
*@param args Command line arquements (not used).
*/
//instance variables
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   /**
   *Creating a class called Temperatures, which will hold a 
   * set of integer values.
   * representing daily temperatures.
   /** Constructor for Temperatures.
   *@param temperaturesIn for temperatures
   */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
   
      temperatures = temperaturesIn;
   }
   /**
   *Takes no parameters; returns an integer value.
   *@return 0 if if statement is true otherwise
   *return low temperature
   */
   
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++)
      {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
    /**
   *Takes no parameters; returns an integer value.
   *@return 0 if if statement is true otherwise
   *return high temperature
   */
   public int getHighTemp()
   {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp: temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
   /**
   *Takes an int parameter; returns an integer value.
   *@param lowIn for minimum
   *@return minimum temperature
   */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
    /**
   *Takes an int parameter; returns an integer value.
   *@param highIn for maximum
   *@return maximum temperature
   */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   /**
   *No parameters; returns a String.
   *@return String type
   */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}

