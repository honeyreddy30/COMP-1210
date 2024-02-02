 /**
*User Information program.
*
*Activity04.
*@author Honey Reddy Nagireddy - COMP 1210-006
*@version 13th september 2022
*/
public class UserInfo {
 // instance variable
   private String firstName, lastName, location;
   private int age, status;
   private static final int OFFLINE = 0, ONLINE = 1;
 
 //constructor
 /**
 *User Information program.
 @param firstNameIn for first name
 @param lastNameIn for last name
 */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
 //methods
 /**
   *User Information program.
   *@return the output entered by user.
   */
   public String toString()
   {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
   /**
   *User Information program.
   *@param locationIn of user.
   */

   public void setLocation(String locationIn) {
         
      location = locationIn;
   }
   /**
   *User Information program.
   *@param ageIn explains if age is set.
   *@return isSet explains if the age is set.
   */
   public boolean setAge(int ageIn)
   {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
   *User Information program.
   *@return getAge.
   */
   public int getAge()
   
   {
      return age;
   }
   /**
   *User Information program.
   *@return GetLocation
   */

   public String getLocation() 
   {
      return location;
   }
   /**
   *User Information program.
   */

   public void logOff() 
   {
      status = OFFLINE;
   }
   /**
   *User Information program.
   */

   public void logOn() 
   {
      status = ONLINE;
   }
}
 
