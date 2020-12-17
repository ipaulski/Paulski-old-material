import java.io.*;
import java.util.*;
public class Problem6_Paulski
{
    public void problem6(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer");
        double i1 = s.nextDouble();
        double i2 = i1/10;
        int i3 = (int)i1/10;
        if(i2==i3){
            System.out.println("Yes it does");
        }
        else
            System.out.println("No it does not");
    }
}