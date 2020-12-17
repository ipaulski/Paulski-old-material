
public class Numeric
{
    public Numeric(int a, int b, double d){
        int iResult = 0;
        double dResult = 0;
        dResult = a + d;
        System.out.println(a+ " + " + d + " = " + dResult);
        //iResult = (d * d);
        //System.out.println(d+ " x " + d + " = " + iResult);
        dResult = d * d;
        System.out.println(d+ " x " + d + " = " + dResult);
        iResult = a / b;
        System.out.println(a+ " / " + b + " = " + iResult);
        dResult = (double)a / (double)b;;
        System.out.println(a+ " / " + b + " = " + dResult);
        System.out.println("Pre-increment " + a+ "+" + b + "=" +(++a + ++b));
        a = 3;
        b = 4;
        System.out.println("post-increment" + a+ "+" + b + "="  +(a++ + b++));
        System.out.println("a = " +a + "\n" + "b = " + b);
}
}