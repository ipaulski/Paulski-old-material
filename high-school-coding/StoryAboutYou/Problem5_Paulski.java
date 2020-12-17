import java.io.*;
import java.util.*;
public class Problem5_Paulski
{
    public void problem5(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        double i1 = s.nextDouble();
        System.out.println("Enter a number");
        double i2 = s.nextDouble();
        System.out.println("Enter a number");
        double i3 = s.nextDouble();
        System.out.println("Enter a number");
        double i4 = s.nextDouble();
        System.out.println("Enter a number");
        double i5 = s.nextDouble();
        double sum = i1 + i2 + i3 + i4 + i5;
        double avg = sum/5;
        System.out.println("The sum is " + sum + "\nThe average is " + avg);
}
}