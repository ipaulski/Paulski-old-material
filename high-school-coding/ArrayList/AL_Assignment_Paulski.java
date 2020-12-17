import java.util.*;
public class AL_Assignment_Paulski
{
    public ArrayList<Integer> i_ArrayList = new ArrayList<Integer>();
    public ArrayList<String> s_ArrayList = new ArrayList<String>();
    public AL_Assignment_Paulski(){
        for(int i = 0; i < 20; i++){
            int rand = (int)(Math.random()*99 + 1);
            i_ArrayList.add(rand);
        }
    }

    public AL_Assignment_Paulski(int[] k){
        for(int m: k){
            i_ArrayList.add(m);
        }
    }

    public AL_Assignment_Paulski(String[] n){
        for(String b: n){
            s_ArrayList.add(b);
        }
    }

    public void addWord(String s){
        s_ArrayList.add(s);
    }

    public int[] getOddNumber(){
        int count = 0;
        for(int i = 0; i<i_ArrayList.size(); i++){
            if(i_ArrayList.get(i)%2==0){
                i_ArrayList.remove(i);
            }
            count++;
        }
        int[] arr = new int[count];
        count++;
        return arr;
        //System.out.println(arr);
    }

    public int removeThis(int m){
        for(int i = 0; i<i_ArrayList.size(); i++){
            if(i_ArrayList.get(i)==m){
                i_ArrayList.remove(i);
            }
        }
        return i_ArrayList.size();  
        //System.out.println(i_ArrayList);
    }

    public boolean isExist(int i){  
        return (removeThis(i) <= 19);
    }
}
