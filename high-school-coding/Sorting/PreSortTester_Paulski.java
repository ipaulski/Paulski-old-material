import java.util.*;
public class PreSortTester_Paulski
{
    public static void main(String args[]){
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < 100; i++){
            int k = (int)(Math.random()*100)+1;
        }
        for(int x=0;x<a.size();x++){
            for(int y=x+1; y<a.size();y++){
                int total = 0;
                if(a.get(x)>a.get(y)){
                    a.set(x,a.get(y));
                    a.set(y,total);
                }
            }
        }
        for(int n:a)System.out.println(""+n);
    }
    
    public void descendIT(ArrayList<Integer> a){
        for(int x=0;x<a.size();x++){
            for(int y=x+1; y<a.size();y++){
                int total = 0;
                if(a.get(x)<a.get(y)){
                    a.set(x,a.get(y));
                    a.set(y,total);
                }
            }
        }
        for(int n:a)System.out.println(""+n);
    }
}
