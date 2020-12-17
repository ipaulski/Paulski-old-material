
public class Problem5_Paulski
{
    public Problem5_Paulski(){}

    public void printAll(){
        int k = 0;
        for(k = 0; k < 10; k++){
            int m = (int)((Math.random()*100)+1);
            System.out.print(m +"; ");
        }
    }
}