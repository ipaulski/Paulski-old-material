
public class Problem1_Paulski
{
    public Problem1_Paulski(){}

    public void evenOnly(int n){
        int k = 1;
        for(k = 1; k < n; k++){
            int h = (int)(((Math.random())*100)+1);      
            int j = (int)h/2;
            double d = h/2.0;
            if(j==d){
                System.out.print(" " + h);
            }
            else
                System.out.print("");
        }
    }
}
