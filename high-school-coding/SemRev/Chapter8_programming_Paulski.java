import java.util.*;
public class Chapter8_programming_Paulski
{
    public int findAnyB(String s){
        int val = 0;
        for(int x = 0; x<s.length()-1; x++){
            if(s.substring(x,x+1).equals("b") || s.substring(x,x+1).equals("B")){
                val += s.indexOf(s.substring(x,x+1));
            }
        }
        return val;
    }

    public boolean onlyCase(String s1, String s2){
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        boolean b = false;
        if(s1.compareTo(s2)==0){
            b = true;
        }
        return b;
    }

    public String noRepeat(String s){
        String val = "";
        ArrayList<Character> str = new ArrayList<Character>();
        for(int x = 0; x<s.length()-1; x++){
            if(s.charAt(x) != (s.charAt(x+1))){
                str.add(s.charAt(x));
            }
        }
        for (int i = 0; i<str.size(); i++){
            val += str.get(i);
        }
        return val;
    }
}
