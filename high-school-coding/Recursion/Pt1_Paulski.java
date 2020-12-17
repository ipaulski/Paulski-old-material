
public class Pt1_Paulski
{
    public void rand(int n){
        int total =0;
        int squared = (int)Math.pow(n,2);
        for(int i = 1; i <= squared; i++){
            i= (int)Math.pow(i,2);
            total += i;
        }
        System.out.println(total);
    }
}
