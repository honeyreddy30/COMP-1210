import java.io.FileNotFoundException;
/**
* In addition to the specifications in Bakery – Part 2, the main 
method will be modified to catch and handle an FileNotFoundException 
if one is thrown in the readItemFile method.
* Project 11.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 18th november 2022
*/
public class BakeryPart3
{
/**
* the main method reads in the file name as the first argument
,args[0],ofthe command line arguments, creates an instance of BakedItemList.
*@param args - Standard commandLine arguements
*/
   public static void main(String[] args)
   {
      try {
         if (args.length == 0)
         {
            System.out.println("File name expected as command line argument.");
            System.out.println("Program ending.");
         }
         else
         {
            String fileName = args[0];
            BakedItemList test = new BakedItemList();
         //reads file name
            test.readItemFile(fileName);
         //print the general report
            System.out.println(test.generateReport());
         //prints report by class
            System.out.println(test.generateReportByClass());
         //prints report by price
            System.out.println(test.generateReportByPrice());
         //prints report by flavor
            System.out.println(test.generateReportByFlavor());
         //prints report of excluded records
            System.out.println(test.generateExcludedRecordsReport());
         }
      }
      catch (FileNotFoundException e)
      {
         System.out.println("Attempted to read file: " + args[0] 
               + " (No such file or directory)");
         System.out.println("Program ending.");
      }
   }
}

