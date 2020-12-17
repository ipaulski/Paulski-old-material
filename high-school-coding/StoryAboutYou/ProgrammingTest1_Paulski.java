//Izabella Paulski
public class ProgrammingTest1_Paulski
{
    public String myString;
    public double myDouble;
    public int myInteger;
    public ProgrammingTest1_Paulski(String s, int i, double d){
        myString = s;
        myDouble = d;
        myInteger = i;
        task1((String) s, (int) i, (double) d);  
        task2(23, 14);
        task3(23.0, 4.5);
        task4(12345); 
    }
    public void task1(String s, int i, double d){
        System.out.println("The input string is " + s);
        System.out.println("The input double is " + d);
        System.out.println("The input integer is " + i);
    }
    public void task2(int a, int b){
        System.out.println(a +" + "+ b +" = " + (a+b)); 
        System.out.println(a +" - "+ b +" = " + (a-b)); 
        System.out.println(a +" x "+ b +" = " + (a*b)); 
        System.out.println(a +" / "+ b +" = " + (a/b)); 
    }
    public void task3(double d1, double d2){
        System.out.println(d1 +" + "+ d2 +" = " + (d1+d2)); 
        System.out.println(d1 +" - "+ d2 +" = " + (d1-d2)); 
        System.out.println(d1 +" x "+ d2 +" = " + (d1*d2)); 
        System.out.println(d1 +" / "+ d2 +" = " + (d1/d2)); 
    }
    public void task4(int i){
        String x = (String)i;
        System.out.println(x.substring(1,3));
    }
}
