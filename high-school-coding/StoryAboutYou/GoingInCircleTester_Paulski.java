import java.io.*;
import java.util.*;
public class GoingInCircleTester_Paulski
{
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        System.out.println("What is the area?");
        double area =  sk.nextDouble();
        GoingInCircle_Paulski test = new GoingInCircle_Paulski(area);
        
        System.out.println("Radius of your circle is " + test.getRadius());
}
}