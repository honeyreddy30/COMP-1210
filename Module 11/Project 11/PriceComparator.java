import java.util.Comparator;
/**
*implements the Comparator interface for 
BakedItem objects.  Hence, it implements the following method.
* Project 10.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 11th november 2022
*/
public class PriceComparator implements Comparator<BakedItem>
{
/**
* Creating compareTo method.
* @param b1 for bakedItem object
* @param b2 for bakedItem object
* @return -1 or 1 or 0
*/
   public int compare(BakedItem b1, BakedItem b2)
   {
      double price1 = b1.price();
      double price2 = b2.price();
      if (Math.abs(price1 - price2) < 0.00001)
      {
         return 0;
      }
      //if price2 is greater than price1
      else if (price1 < price2)
      {
         return -1;
      }
      else
      {
         return 1;
      }
   }
}