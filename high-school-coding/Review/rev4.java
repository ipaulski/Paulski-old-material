import java.util.*;
public class rev4
{
    public ArrayList<Integer> newer = new ArrayList<Integer>();
    public void trye(){
        System.out.print("The even numbers are ");
        for(int z = 0; z < 10; z++){
            newer.add((int)(Math.random()*100 +1));
            if(newer.get(z)%2==0){
                System.out.print(newer.get(z)+" ");
            }
        }
    }
}
