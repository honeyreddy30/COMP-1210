 /**
* Bank loan activity.
* Activity 7A.
* @author Honey Reddy Nagireddy- COMP 1210 - 006
* @version 11th october 2022
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
   /**
   *constructor.
   *@param customerNameIn for customerName.
   *@param interestRateIn for interestrate.
   */

   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   /**
   *Amount borrowed from the bank.
   *@param amount borrowed
   *@return wasLoanMade
   */

   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   /**
   *Amount paid.
   *@param amountPaid for amount paid
   *@return balance
   */

   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   /**
   *returns balance.
   *@return balance 
   */
   public double getBalance() {
      return balance;
   }
   /**
   *return interest rate.
   *@param interestRateIn for Interest rate
   *@return boolean value
   */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
   *return interest rate.
   *@return interestRate
   */
   public double getInterestRate() {
      return interestRate;
   }
   /**
   *Apply charge interest.
   */
   
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   /**
   *returns output string.
   *@return output the string
   */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   /**
   *Boolean value.
   *@param amount for loan amount
   *@return amount in boolean
   */ 
   public static boolean isAmountValid(double amount)
   {
      return amount >= 0;
   }
   /**
   *returns output depending on loan balance.
   *@param loan for bank loan
   *@return boolean value
   */
   public static boolean isInDebt(BankLoan loan)
   {
      if (loan.getBalance() > 0)
      {
         return true;
      }
      return false;
   }
   /**
   *return loans created.
   *@return loansCreated
   */
   public static int getLoansCreated()
   {
      return loansCreated;
   }
   /**
   *reset no of loans created.
   */
   public static void resetLoansCreated()
   {
      loansCreated = 0;
   }
}
