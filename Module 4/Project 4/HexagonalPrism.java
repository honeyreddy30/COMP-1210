import java.text.DecimalFormat;
 /**
*HexagonalPrism class that stores the label, edge, and height.
*
*Project04.
*@author Honey Reddy Nagireddy - COMP 1210-006
*@version 16th september 2022
*/
public class HexagonalPrism
{
 /**
   *creating a blank constructor.
   *@param args Command line arguments (not used).
   */
   // instance variables
   private String label = " ";
   private double height = 0;
   private double edge = 0;
   /**
   *blank constructor.
   */
   public HexagonalPrism() {
   }
   //contructor
   /**
   *Creates the constructor Hexagonalprism.
   *@param labelIn for lable
   *@param edgeIn for edge
   *@param heightIn for height
   */
   public HexagonalPrism(String labelIn, double edgeIn, 
      double heightIn)
   {
      setLabel(labelIn);
      setHeight(heightIn);
      setEdge(edgeIn);
   }
   /**
   *returns the string label.
   *@return label returns a string
   */
   public String getLabel() {
      return label;
   }
   /**
   *Checks if the number enter is not equal to null.
   *@param labelIn string
   *@return boolean statement
   */
   public boolean setLabel(String labelIn) {
      if (label != null) {
         label = labelIn.trim();
         return true;
      }
      return false;
   }
   /**
   *return the edge length.
   *@return edge as double
   */
   public double getEdge() {
      return edge;
   }
   /**
   *Sets the entered value to the edge.
   *checks if the entered value is negative
   *@param edgeIn double value
   *@return boolean statement
   */
   public boolean setEdge(double edgeIn) {
      if (edgeIn > 0) {
         edge = edgeIn;
         return true;
      }
      return false;
   }
   /**
   *returns the height.
   *@return height as double
   */
   public double getHeight() {
      return height;
   }
   /**
   *Sets the entered value to the height.
   *checks if the entered value is negative
   *@param heightIn as double height 
   *@return boolean statement
   */
   public boolean setHeight(double heightIn)
   {
      if (heightIn > 0) {
         height = heightIn;
         return true;
      }
      return false;
   }
   /**
   *calculates area.
   *@return area as double
   */
   public double surfaceArea() {
      return ((6 * getEdge() * getHeight()) + 3 * (Math.sqrt(3) 
         * Math.pow(getEdge(), 2)));
   }
   /**
   *calculates lateral area.
   *@return lateral area as double
   */
   public double lateralSurfaceArea() {
      return (6 * getEdge() * getHeight());
   }
   /**
   *calculates base area.
   *@return base area as double
   */
   public double baseArea() {
      return (3 * Math.sqrt(3) * Math.pow(getEdge(), 2) / 2);
   }
   /**
   *calculates volume.
   *@return volume as double
   */
   public double volume() {
      return (3 * Math.sqrt(3) * Math.pow(getEdge(), 2) * getHeight() / 2);
   }
   /**formats the output values of height, edge, circumference.
   *base area, lateral area, volume into the required format
   *@return output
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output += "HexagonalPrism \"" + (getLabel()) 
         + "\" has 8 faces, 18 edges," 
         + " and 12 vertices.";
      output += "\n\tedge = " + df.format(edge) + " units";
      output += "\n\theight = " + df.format(height) + " units";
      output += "\n\tlateral surface area = " 
         + df.format(lateralSurfaceArea())
         + " square units";
      output += "\n\tbase area = " + df.format(baseArea()) 
         + " square units";
      output += "\n\tsurface area = " + df.format(surfaceArea()) 
         + " square units";
      output += "\n\tvolume = " + df.format(volume()) + " cubic units";
      return output;
   }
}