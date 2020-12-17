/**
   This program tests the BankAccount class and
   its subclasses. 
*/
public class AccountTester
{  
   public static void main(String[] args)
   {  
      SavingsAccount momsSavings = new SavingsAccount(0.5);
      
      CheckingAccount harrysChecking = new CheckingAccount(100);
         
      momsSavings.deposit(10000);
      momsSavings.transfer(2000, harrysChecking);
      harrysChecking.withdraw(1500);
      harrysChecking.withdraw(80);
      momsSavings.transfer(1000, harrysChecking);
      harrysChecking.withdraw(400);
      
      System.out.println(harrysChecking.getBalance());
   }
}
