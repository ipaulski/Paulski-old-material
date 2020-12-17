
public class MyNumber
{
    private int myInt;
    private double myDouble;
    private Number num;
    public MyNumber(int i, double d){
        myInt = i;
        myDouble = d;
        num = new Number(myInt, myDouble);
    }
    
    public Number getBoth(){
        return num;
    }
    //Use Hybrid main
    public static void main(String args[]){
        //instantiate a MyNumber object
        MyNumber me = new MyNumber(7,7.0);
        //print out two data separately from the data structures
        System.out.println(me.num.myInt);
        System.out.println(me.num.myDouble);
        //print out both data
        System.out.println(me.getBoth());
    }
}
