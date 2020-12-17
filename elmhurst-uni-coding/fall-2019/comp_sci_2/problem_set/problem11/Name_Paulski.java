import java.util.*;
public class Name_Paulski
{
    private String last;
    private String first;
    private int weight;
    public Name_Paulski(String l, String f, int w){
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
        ArrayList<Integer> iList = new ArrayList<Integer>();
        ArrayList<String> sList = new ArrayList<String>(10);
        ArrayList<Name_Paulski> nList = new ArrayList<Name_Paulski>(3);
        for(int x = 0; x<10; x++){
            int m = (int)(Math.random()*99+1);
            iList.add(m);
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
        nList.add(new Name_Paulski("Sanders", "Jerry", 220));
        nList.add(new Name_Paulski("Redd", "Sandra", 135));
        nList.add(new Name_Paulski("Crimer", "Gerald", 194));
        int count = 0;
        while(count<=4){
            int n = (int)(Math.random()*9);
            if(n<iList.size()){
                iList.remove(n);
                count++;
            }
        }
        System.out.println(iList);
        for(int p = 0; p<sList.size(); p++){
            char[] arr = sList.get(p).toCharArray();
            if(arr[0]>=(char)97 && arr[0]<=(char)107){
                System.out.println("Fruits that start at the beginning of the alphabet are: "+
                    sList.get(p)+" ");
            }

            if(sList.get(p).length()>6){
                System.out.println("Fruits with lengths greater than 6 characters are: "+
                    sList.get(p)+" ");
            }
        }
        System.out.println("Last Name\tFirst Name\tWeight\n---------------------------------------");
        for(int x = 0; x<nList.size(); x++){
            System.out.println(nList.get(x).getLast() + "\t\t"+
                nList.get(x).getFirst() +"\t\t"+nList.get(x).getWeight());
        }
    }
}