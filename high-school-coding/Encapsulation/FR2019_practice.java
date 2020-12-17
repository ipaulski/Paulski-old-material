
import java.util.ArrayList;
public class FR2019_practice
{
    public FR2019_practice(){
    }

    public boolean findMe(String s1, String s2){
        if(s1.indexOf(s2) > 0) return true;
        else return false;
    }

    public int countMe(int num){
        return (""+num).length();
    }

    public int combine2(int i, int j){
        String ans = ""+i+j;
        return Integer.parseInt(ans);
    }

    public static void main(String args[]){
        FR2019_practice f = new FR2019_practice();
        System.out.println(f.findMe("Hello", "ll"));
        System.out.println(f.countMe(4509));
        System.out.println(f.combine2(45,9));
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < 100; i++){
            if(i%3 == 0) al.add(i);
        }
        int[] ar = {12, 3, 4, 79, 21, 0, 0};
        for(int a: ar) System.out.print(a+" ");
        boolean[] b = {true, true, false, false, true};
        int[] aa = new int[5];
        for(int j = 0; j < 5; j++){
            if(b[j]) aa[j] = 0;
            else aa[j] = 1;
        }
        String[] day = {"Monday", "Tuesday", "Thursday", 
                "Friday", "Saturday", "Sunday"};
        String[] day1 = new String[day.length +1];
        int index = 0;
        for(int k =0; k < day1.length; k++){
            if(k == 2) day1[k] = "Wednesday";
            else {
                day1[k] = day[index];
                index++;
            }
        }
        day = day1;
        System.out.println();
        for(String s: day) System.out.print(s+" ");
    }
}

/**
A bank account has a balance that can be changed by 
deposits and withdrawals.
 */
public class BankAccount
{  
    private double balance; 

    /**
    Constructs a bank account with a zero balance.
     */
    public BankAccount()
    {  
        balance = 0;
    }

    /**
    Constructs a bank account with a given balance.
    @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance)
    {  
        balance = initialBalance;
    }

    /**
    Deposits money into the bank account.
    @param amount the amount to deposit
     */
    public void deposit(double amount) 
    {  
        balance = balance + amount;
    }

    /**
    Withdraws money from the bank account.
    @param amount the amount to withdraw
     */
    public void withdraw(double amount) 
    {  
        balance = balance - amount;
    }

    /**
    Gets the current balance of the bank account.
    @return the current balance
     */
    public double getBalance()
    {  
        return balance; 
    }

    /**
    Transfers money from the bank account to another account
    @param amount the amount to transfer
    @param other the other account
     */
    public void transfer(double amount, BankAccount other)
    {  
        withdraw(amount);
        other.deposit(amount);
    }
}
-----------------------
/**
A checking account that charges transaction fees.
 */
public class CheckingAccount extends BankAccount
{  
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 2.0;

    private int transactionCount;

    /**
    Constructs a checking account with a given balance.
    @param initialBalance the initial balance
     */
    public CheckingAccount(double initialBalance)
    {  
        // Construct superclass
        super(initialBalance);

        // Initialize transaction count
        transactionCount = 0; 
    }

    public void deposit(double amount) 
    {  
        transactionCount++;
        // Now add amount to balance 
        super.deposit(amount); 
    }

    public void withdraw(double amount) 
    {  
        transactionCount++;
        // Now subtract amount from balance 
        super.withdraw(amount); 
    }

    /**
    Deducts the accumulated fees and resets the
    transaction count.
     */
    public void deductFees()
    {  
        if (transactionCount > FREE_TRANSACTIONS)
        {  
            double fees = TRANSACTION_FEE *
                (transactionCount - FREE_TRANSACTIONS);
            super.withdraw(fees);
        }
        transactionCount = 0;
    }
}
//
/**
An account that earns interest at a fixed rate.
 */
public class SavingsAccount extends BankAccount
{  
    private double interestRate;

    /**
    Constructs a bank account with a given interest rate.
    @param rate the interest rate
     */
    public SavingsAccount(double rate) 
    {  
        interestRate = rate;
    }

    /**
    Adds the earned interest to the account balance.
     */
    public void addInterest() 
    {  
        double interest = getBalance() * interestRate / 100;
        deposit(interest); 
    }
}
// 
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

        // Simulate end of month
        momsSavings.addInterest();
        harrysChecking.deductFees();

        System.out.println("Mom's savings balance: "
            + momsSavings.getBalance());
        System.out.println("Expected: 7035");

        System.out.println("Harry's checking balance: "
            + harrysChecking.getBalance());
        System.out.println("Expected: 1116");
    }
}