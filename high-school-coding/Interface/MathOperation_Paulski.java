
public class MathOperation_Paulski implements Increase_Paulski, Decrease_Paulski
{
    public MathOperation_Paulski(){

    }

    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public double divide(int a, int b){
        return (double)a/(double)b;
    }
    
    public static void main (String[] args){
        
    }
}
