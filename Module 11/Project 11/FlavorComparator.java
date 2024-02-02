import java.util.Comparator;
/**
* Program for part -2 bakery project.
* Project 10.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 11th november 2022
*/
public class FlavorComparator implements Comparator<BakedItem>
{
/**
* Creating compare method.
* @param b1 for bakedItem object
* @param b2 for bakedItem object
* @return -1 or 1 or 0
*/
   public int compare(BakedItem b1, BakedItem b2)
   {
      return b1.getFlavor().toLowerCase().
         compareTo(b2.getFlavor().toLowerCase());
   }
}