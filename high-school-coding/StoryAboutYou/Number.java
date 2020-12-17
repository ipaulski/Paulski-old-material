
public class Number
{
    public int myInt;
    public double myDouble;
    public Number(int k, double d){
        myInt = k;
        myDouble = d;
    }
    
    public String toString(){
        return (myInt + " , " + myDouble);
    }
}
