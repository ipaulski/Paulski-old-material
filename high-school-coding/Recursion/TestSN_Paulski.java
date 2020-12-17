
public class TestSN_Paulski
{
    public TestSN_Paulski(){}

    public int getFactorial(int n){
        if(n==1) return 1;
        else return (n*getFactorial(n-1));
    }

    public int getFactorial2(int n){
        int total =1;
        for(int i=1; i<=n; i++){
            total = total*i;
        }
        return total;
    }

    public int getSum(int n){
        if(n==1) return 1;
        else return (n+getSum(n-1));
    }

    public int getSum2(int n){
        int total =0;
        for(int i=1; i<=n; i++){
            total = total+i;
        }
        return total;
    }
}
