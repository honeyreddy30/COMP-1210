import java.text.DecimalFormat;
/**
* Class representing a Ring Torus Object and will implement 
comparable interface.
* Project 8.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 28th october 2022
*/
public class RingTorus implements Comparable<RingTorus>
{
/**
*Creating a Ring Torus class.
*@param args command line arguements
*/
//instance variables
//initializing varaibles with there respective types

   private String label = "";
   private double largeRadius = 0;
   private double smallRadius = 0;
   private static int count = 0;

//constructor
/**
*Public constructor which acceptsthat accepts three parameters.
*@param labelIn for label
*@param largeRadiusIn for largeRadius
*@param smallRadiusIn or largeRadius
*incrementing class varaible count each time
*/
   public RingTorus(String labelIn, double largeRadiusIn, double smallRadiusIn)
   {
      setLabel(labelIn);
      setLargeRadius(largeRadiusIn);
      setSmallRadius(smallRadiusIn);
      count++;
   }
   //methods
   /**
   *Accepts no parameters.
   *@return label
   */
   public String getLabel()
   {
      return label;
   }
   /**
   *Takes a string parameter and returns a boolean.
   *@param labelIn for label
   *@return boolean 
   */
   public boolean setLabel(String labelIn)
   {
      boolean lab = false;
      if (labelIn != null)
      {
         label = labelIn.trim();
         lab = true;
         return lab;
      }
      else
      {
         return lab;
      }
   }
   /**
   *Takes no parameters and returns a double.
   *@return double large radius
   */
   public double getLargeRadius()
   {
      return largeRadius;
   }
   /**
   *Takes a double parameter and returns a boolean.
   *@param largeRadiusIn for largeRadius
   @return boolean
   */
   public boolean setLargeRadius(double largeRadiusIn)
   {
      if (largeRadiusIn > 0 && largeRadiusIn > smallRadius)
      {
         largeRadius = largeRadiusIn;
         return true;
      }
      
      return false;
   }
   /**
   *Takes no parameters and returns a double.
   *@return double small radius
   */
   public double getSmallRadius()
   {
      return smallRadius;
   }
   /**
   *Takes a double parameter and returns a boolean.
   *@param smallRadiusIn for smallRadius
   @return boolean
   */
   public boolean setSmallRadius(double smallRadiusIn)
   {
      if (smallRadiusIn > 0 && smallRadiusIn < largeRadius)
      {
         smallRadius = smallRadiusIn;
         return true;
      }
      return false;
   }
   /**
   *Accepts no parameters and returns the diameter.
   *@return double diameter
   /*/
   public double diameter() 
   {
      double diameter = 2 * (largeRadius + smallRadius);
      return diameter;
   }
   /**
   *Accepts no parameters and returns the surface area.
   *@return surfaceArea
   */
   public double surfaceArea()
   {
      double surfaceArea = (2 * Math.PI * largeRadius) 
         * (2 * Math.PI * smallRadius);
      return surfaceArea;
   }
   /**
   *Accepts no parameters and return volume.
   *@return volume
   */
   public double volume()
   {
      double volume = (2 * Math.PI * largeRadius) 
         * (Math.PI * Math.pow(smallRadius, 2));
      return volume;
   }
   /**
   *Returns a string containing information 
   about the ring torus object.
   *@return output.
   */
   public String toString()
   {
      DecimalFormat dfm = new DecimalFormat("#,##0.0##");
      String output = "RingTorus \"" + getLabel() + "\"";
      output += "\n\tlarge radius = " + dfm.format(largeRadius) + " units";
      output += "\n\tsmall radius = " + dfm.format(smallRadius) + " units";
      output += "\n\tdiameter = " + dfm.format(diameter()) + " units";
      output += "\n\tsurface area = " 
         + dfm.format(surfaceArea()) + " square units";
      output += "\n\tvolume = " + dfm.format(volume()) + " cubic units";
      return output;
   }
   /**
   *A static method that accepst no parameters and 
   returns an int representing the static count feild.
   *@return int count
   */
   public static int getCount()
   {
      return count;
   }
   /**
   *A static method that returns nothing accepts no 
   parameters and sets count field to zero.
   *resets count
   */
   public static void resetCount()
   {
      count = 0;
   }
   /**
   *An instance method that accepts a parameer of type Object.
   *@return variables
   *@param obj checks the instance
   */
   public boolean equals(Object obj)
   {
      if (!(obj instanceof RingTorus)) 
      {
         return false;
      }
      else
      {
         RingTorus rt = (RingTorus) obj;
         return (label.equalsIgnoreCase(rt.getLabel())
            && (Math.abs(largeRadius - rt.getLargeRadius()) < .000001)
            && (Math.abs(smallRadius - rt.getSmallRadius()) < .000001));
      }
   }
   /**
   *Accepts no parameters and returns zero of type int.
   *@return 0
   */
   public int hashCode()
   {
      return 0;
   }
   /**
   *Accepts a parameter of type RingTorus and returns an int.
   *@return int
   *@param obj checks for the instance
   */
   public int compareTo(RingTorus obj)
   {
      if (this.volume() > obj.volume())
      //if the this volume is greater than object volume, returns 1
      {
         return 1;
      }
      else if (this.volume() < obj.volume())
      //else if the this volume is smaller than object volume, returns -1
      {
         return -1;
      }
      else
      //else if the this volume is equal to object volume, returns 0
      {
         return 0;
      }
   }
}

