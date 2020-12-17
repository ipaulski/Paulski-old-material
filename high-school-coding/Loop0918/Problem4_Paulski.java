
public class Problem4_Paulski
{
    public Problem4_Paulski(){}

    public void guessTry(){
        int m = (int)Math.random();
        int z = s.length();
        int k = 0;
        for(k = 0; k < z; k++){
            char f = s.charAt(k);
            if((f >= 65 && f <= 90) || (f>=97&&f<=122)){
                System.out.print(f);
            }
        }
    }
}