
public class Problem2_Paulski
{
    public Problem2_Paulski(){}

    public void notint(String s){
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