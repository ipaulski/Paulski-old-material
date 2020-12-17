import java.util.*;
public class Problem8_Paulski
{
    public Problem8_Paulski(){}

    public void isPrime(int n){
        int p = n/2;
        double j = n/2;
        double u = n/3;
        int y = n/3;
        int q = n/4;
        double w = n/4;
        int e = n/5;
        double r = n/5;
        int t = n/6;
        double a = n/6;
        int s = n/7;
        double f = n/7;
        if(p==j || y==u || q==w || e==r || t==a || s==f){
            System.out.print("No");
        }
        else
            System.out.print("Yes");
    }
}