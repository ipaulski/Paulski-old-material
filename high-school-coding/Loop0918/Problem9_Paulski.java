import java.util.*;
public class Problem9_Paulski
{
    public Problem9_Paulski(){}

    public void shuffle(String d){
            ArrayList<Character> newString = new ArrayList<Character>();
            int a = newString.size();
            String finalstring = "";
            for(int i = 0; i<d.length(); i++){
                newString.add(d.charAt(i));
            }
            for(int j = 0; j<newString.size(); j++){
                int b = (int)(Math.random()*newString.size());
                int c = (int)(Math.random()*newString.size());
                char swap = newString.get(c);
                newString.set(c, newString.get(b));
                newString.set(b, swap);
            }
            System.out.println(newString);
    }
}