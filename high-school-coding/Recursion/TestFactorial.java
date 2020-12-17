
public class TestFactorial
{
    public int num;
    public TestFactorial(){}
    
    public int getFactorial(int i){
        num = i;
        if(i==1) return 1;
        else return (i*getFactorial(i-1));
    }
    
    public static void main(String args[]){
        //System.out.println("The factorial of 5 is "+getFactorial());
    }
}
