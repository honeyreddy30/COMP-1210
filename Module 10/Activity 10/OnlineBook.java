/**
* the class OnlineBook which will need to inherit from 
OnlineTextItem and will need to include a variable for the author’s name.
* Project 9.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 31st october 2022
*/
public class OnlineBook extends OnlineTextItem
{
   protected String author;
   /**
*OnlineBook should have the following characteristics.
*@param nameIn for name
*@param priceIn for price
*/
   public OnlineBook(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
    /**
   *Sets author.
   *@param authorIn for author
   */
   public void setAuthor(String authorIn)
   {
      author = authorIn;
   }
   /**
   *Return a string representation with name and price with tax.
   *@return String
   */
   public String toString()
   {
      return name + " - " + author + ": $" + calculateCost();
   }
}