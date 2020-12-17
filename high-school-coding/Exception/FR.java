import java.util.*;
public class FR
{
    private ArrayList myList = new ArrayList<String>();
    public int numWordsOfLength(int len){
        for(int x=0; x<myList.size();x++){
            if(myList.get(x).length()==len){
                count++;
            }
        }
        return count;
    }
    
    public void removeWordsOfLength(int len){
        for(int x=0; x<myList.size();x++){
            if(myList.get(x).size()==len){
                myList.remove(x);
            }
        }
        System.out.println(myList);
    }
}
