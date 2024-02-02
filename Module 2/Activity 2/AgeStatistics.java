import java.util.Scanner;
/**
* Calculation of person's age in minutes, hours and max heart rate for minute.
*
* Activity 2.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 30th August 2022
*/


public class AgeStatistics 
{
/**
*Prints users age in minutes, hours and also prints 
the max heart rate for minute.
*@param args Command line arguments – not used.
*/

   public static void main(String[] args) 
   {
      //create an instance of Scanner class 
      Scanner userInput = new Scanner(System.in);
      String name = " ";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      //prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      //convert age into minutes:
      System.out.println("\tYour age in minutes is "
             + ageInYears * 525600 + " minutes.");
      //convert age into centuries:
      System.out.println("\tYour age in centuries is "
             + (double) ageInYears / 100 + " centuries.");
      // display max heart rate
      System.out.print("Your max heart rate is ");
      //check if the users gender is Male or Female:
      if (gender == 1) //calculate female MHR
      {
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      else //calculate male MHR
      {
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      
      //print maximum heart rate of the user
      System.out.println(maxHeartRate + " beats per minute.");
      
   }

}