/**
* the class OnlineArticle which is a electronic text that keeps track 
of word count in addition to everything that is done by 
OnlineTextItem and InventoryItem.
* Project 9.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 31st october 2022
*/
public class OnlineArticle extends OnlineTextItem
{
   private int wordCount;
    /**
*OnlineArticle should have the following characteristics.
*@param nameIn for name
*@param priceIn for price
*/
   public OnlineArticle(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   /**
   *Sets wordCount.
   *@param wordCountIn for wordCount
   */
   public void setWordCount(int wordCountIn)
   {
      wordCount = wordCountIn;
   }
}