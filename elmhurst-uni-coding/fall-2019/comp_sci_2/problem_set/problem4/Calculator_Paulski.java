
public class Calculator_Paulski
{
    public double data;
    public int one, two;
    public Calculator_Paulski(){}

    public Calculator_Paulski(int x, int y){
        one = x;
        two = y;
    }

    public void divide(int x, int y){
        one = x;
        two = y;
        try{
            if(two==0){
                String s = "Denominator can't be zero.";
                IllegalArgumentException e = new IllegalArgumentException(s);
                throw e;
            }
            if(one==(double)one||two==(double)two){
                String s = "Integer cannot divide by double.";
                IllegalArgumentException e = new IllegalArgumentException(s);
                throw e;
            }
            else{
                System.out.println(one/two);
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
