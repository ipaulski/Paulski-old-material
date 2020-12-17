import java.io.*;
import java.util.*;
public class Problem3_Paulski
{
    public void problem3(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7");
        int i1 = s.nextInt();
        if(i1==1){
            System.out.println("Sunday");
        }
        if(i1==2){
            System.out.println("Monday");
        }
        if(i1==3){
            System.out.println("Tuesday");
        }
        if(i1==4){
            System.out.println("Wednesday");
        }
        if(i1==5){
            System.out.println("Thursday");
        }
        if(i1==6){
            System.out.println("Friday");
        }
        if(i1==7){
            System.out.println("Saturday");
        }
}
}