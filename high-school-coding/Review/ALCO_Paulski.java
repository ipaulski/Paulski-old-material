import java.util.*;
public class ALCO_Paulski
{
    public ArrayList<Integer> i_ArrayList = new ArrayList<Integer>();
    public ArrayList<String> s_ArrayList = new ArrayList<String>();
    ALCO_Paulski(){
        for(int i = 0; i < 100; i++){
            int rand = (int)(Math.random()*100 + 1);
            if(rand%2==0==false){
                i_ArrayList.add(rand);
            }
        }
        Collections.sort(i_ArrayList);
        System.out.print(i_ArrayList);
    }
    
}
