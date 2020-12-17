
public class TwoNumber_Paulski
{
    public TwoNumber_Paulski(){}
    
    public void sumanddif(int a, int b){
        int add = a + b;
        int diff = a - b;
        int diffpos = Math.abs(diff);
        System.out.println(add +"\n" +diffpos);
    }
}
