
public class AccountPaulski
{
    private int id;
    private double balance, annualInterestRate;
    public Date dateCreated;
    public AccountPaulski(){}
    
    public AccountPaulski(int i, double b){
        id = i;
        balance = b;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int i){
        id = i;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double b){
        balance = b;
    }
    
    public double getIR(){
        return annualInterestRate;
    }
    
    public void setIR(double ir){
        annualInterestRate = ir;
    }
    
    public void getDate(Date newDate){
        dateCreated = newDate;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate/1200;
    }
    
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    
    public void withdraw(double d){
        balance -= d;
    }
    
    public void deposit(double d){
        balance += d;
    }
    
    public static void main(String args[]){
        AccountPaulski obj1 = new AccountPaulski(1122,20000);
        Date dateCreated = new Date("Sun", "Sep", "CDT", 23, 07, 01, 23, 2018);
        obj1.setIR(4.5);
        obj1.withdraw(2500);
        obj1.deposit(3000);
        obj1.getBalance();
        obj1.getMonthlyInterest();
        obj1.getDate(dateCreated);
        obj1.printOut();
    }
    
    public void printOut(){
        System.out.println("Balance is $"+balance +"\nMonthly interest is "+getMonthlyInterest()
        +"%\n"+ dateCreated);
    }
}
