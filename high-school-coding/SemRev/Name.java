//Use the following codes to start Instructions at the end of the codes
import java.util.*;
public class Name
{
    private String last;
    private String first;
    private int weight;
    public Name(String l, String f, int w){
        last = l;
        first = f;
        weight = w;
    }

    public void setLast(String s){
        last = s;
    }

    public void setFirst(String s){
        first = s;
    }

    public void setWeight(int i){
        weight = i;
    }

    public String getLast(){
        return last;
    }

    public String getFirst(){
        return first;
    }

    public int getWeight(){
        return weight;
    } 

    public void outPut(){
        ArrayList<Integer> iList = new ArrayList<Integer>(10);
        ArrayList<String> sList = new ArrayList<String>(10);
        ArrayList<Name> nList = new ArrayList<Name>(3);
        for(int x = 0; x<10; x++){
            int m = (int)(Math.random());
            iList.add(x, m);
        }
        sList.add("banana");
        sList.add("apple");
        sList.add("orange");
        sList.add("pear");
        sList.add("grapefruit");
        sList.add("mango");
        sList.add("pineapple");
        sList.add("cherry");
        sList.add("strawberry");
        sList.add("peach");
        nList.add(new Name("Sanders", "Jerry", 220));
        nList.add(new Name("Redd", "Sandra", 135));
        nList.add(new Name("Crimer", "Gerald", 194));
        for(int y = 0; y<5; y++){
            int n = (int)(Math.random()*9);
            iList.remove(n);
        }
        System.out.println(iList);
        for(int p = 0; p<sList.size(); p++){
            //if(sList.get(p).substring(0,1) > 97 && sList.get(p).substring(0,1) < 107){
            //   System.out.println(sList.get(p)+" ");
            //}
            if(sList.get(p).length()>6){
                System.out.println(sList.get(p)+" ");
            }
        }
        System.out.println("Last Name\tFirst Name\tWeight\n---------------------------------------");
        for(int x = 0; x<nList.size(); x++){
            System.out.println(getLast() + "\t"+ getFirst() +"\t"+getWeight());
        }
    }
}
// Repeat 5 times and then print out the rest of the ArrayList iList     
//5. Print out fruit name that starts with letter from first half of 26 letters (a through l)
//7. Print out all 3 objects with the following format sorted by weight
/*
Last name    First name      Weight
-------------------------------------
xxxxx        xxxxxxx         xx
xxxxx        xxxxxxx         xx
xxxxx        xxxxxxx         xx
 */