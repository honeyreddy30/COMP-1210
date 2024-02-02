/**
* Activity to experiment with implement interfaces.
* Acticity 7B.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 16th october 2022
*/
public class Customer implements Comparable<Customer>
{
//variables
   private String name;
   private String location;
   private double balance;
//constructor
/**
*Sets name to parameter input.
*@param nameIn of name
*/
   public Customer(String nameIn) 
   {
      name = nameIn;
      location = "";
      balance = 0;
   }
   /**
   *Set the location variable to an empty string and the balance to zero.
   *@param locationIn for location
   */
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
   /**
   *Adds amount to balance.
   *@param amount for balance
   */
   public void changeBalance(double amount)
   {
      balance = balance + amount;
   }
   /**
   *Returns varaible for location.
   *@return location
   */
   public String getLocation()
   {
      return location;
   }
   /**
   *Return varaible for balance.
   *@return balance
   */
   public double getBalance()
   {
      return balance;
   }
   /**
   *Takes two parameters.
   *@param city for location
   *@param state for location
   */
   public void setLocation(String city, String state)
   {
      location = city + ", " + state;
   }
   /**
   *Shows the customer’s name, their location, and their balance.
   *@return output
   */
   public String toString()
   {
      String output = name + "\n" + getLocation() + "\n" 
         + "$" + getBalance();
      return output;
   }
   /**
   *Compares an object of this class to another object.
   *@return 0
   *@param obj for customer
   */
   public int compareTo(Customer obj)
   {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001)
      {
         return 0;
      }
      else if (this.balance < obj.getBalance())
      {
         return -1;
      }
      else 
      {
         return 1;
      }
   }
}