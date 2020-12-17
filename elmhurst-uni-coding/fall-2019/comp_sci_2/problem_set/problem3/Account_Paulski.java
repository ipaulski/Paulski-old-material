
public class Account_Paulski
{
    public double balance;
    public Account_Paulski(double x){
        balance = x;
    }

    public void withdraw(double amount){
        try{
            if(amount>balance){
                String s = "Can't withdraw more than the balance.";
                IllegalArgumentException e = new IllegalArgumentException(s);
                throw e;
            }
            if(amount<=0){
                String s = "Withdrawal amount must be greater than 0.";
                IllegalArgumentException e = new IllegalArgumentException(s);
                throw e;
            }
            if(amount>0&&amount<balance){
                System.out.println(balance-amount);
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
