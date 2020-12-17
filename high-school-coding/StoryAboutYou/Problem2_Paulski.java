import java.io.*;
import java.util.*;
public class Problem2_Paulski
{
    public void problem2(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        double i1 = s.nextDouble();
        System.out.println("Enter a number");
        double i2 = s.nextDouble();
        System.out.println("Enter a number");
        double i3 = s.nextDouble();
        double large = Math.max(i1,i2);
        double larger = Math.max(12,13);
        double largest = Math.max(large, larger);
        System.out.println("The largest number is " + largest);
}
}