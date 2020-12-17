import java.io.*;
import java.util.*;
public class Problem8_Paulski
{
    public void problem8(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a grade number");
        double i1 = s.nextDouble();
        if(i1<60){
            System.out.println("F");
        }
        else if(60<=i1&&i1<70){
            System.out.println("D");
        }
        else if(70<=i1&&i1<80){
            System.out.println("C");
        }
        else if(80<=i1&&i1<90){
            System.out.println("B");
        }
        else if(90<=i1&&i1<=100){
            System.out.println("A");
        }
    }
}