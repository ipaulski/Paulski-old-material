//Izabella Paulski
import java.io.*;
import java.util.*;
public class Programming_test2_Paulski
{
   private int g, u;
   public Programming_test2_Paulski(){
       //problem 1 will print out the last 3 digits of the input number 
       problem1(23345);
 
       //problem 2: will print out the before and after integer in a specific interval format 
       //for example: 23.9 will print out [23, 24] and
       //24.4 will print out [24, 25]
       problem2(23.9);
       
       //problem 3: your method will allow user to (Use scanner)
       //input any integer to represent n digits of 
       //decimal for the PI. You are to use Math.PI to 
       //print out the estimate PI value to the nth decimal
       //for example problem3(4) will print out 3.1415 and 
       // problem3(2) will print out 3.14
       problem3((int)u);
       
       //The following program will take in a double and 
       //print out the number of digit after the decimal point
       //example: 345.75 will print out 2
       //example: 4.889 will print out 3
       problem4(345.75);
    }
   public void problem1(int k){
       String f = "" + k;
       System.out.println(f.substring(2,5));
    }
   public void problem2(double d){
       System.out.println("["+Math.floor(d)+", "+Math.ceil(d)+"]");
    }
   public void problem3(int u){
       //Scanner qwe = new Scanner(System.in);
       //int j = qwe.nextInt();
       String pi = "" + Math.PI;
       String tyu = pi.substring(2,u);
       System.out.println(tyu);
    }
   public void problem4(double h){
       String w = "" + h;
       int c = w.length();
       int x = w.indexOf(".");
       String fs = w.substring(x,c+1);
       int r = fs.length();
       System.out.println(r);
    }
}
