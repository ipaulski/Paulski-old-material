import java.util.*;
public class TestSN_Paulski
{
    public ArrayList<SuperNumber_Paulski> listNum;
    public static void main(String args[]){
        SuperNumber_Paulski sn = new SuperNumber_Paulski(123.456);
        System.out.println(sn.getInt());
        System.out.println(sn.getDouble());
        System.out.println(sn.getSTNotation());

        SuperNumber_Paulski sn1 = new SuperNumber_Paulski(12346);
        System.out.println(sn1.getInt());
        System.out.println(sn1.getDouble());
        System.out.println(sn1.getSTNotation());
        //task 7
        ArrayList<SuperNumber_Paulski> listNum = new ArrayList<SuperNumber_Paulski>();
        //task 8
        for(int i = 0; i < 5; i++){
            listNum.add(new SuperNumber_Paulski(1000*Math.random()));
        }
        //task 9
        for(int i = 0; i < 5; i++){
            listNum.add(new SuperNumber_Paulski((int)1000*Math.random()));
        }
        //task 10
        for(int i = 0; i < 10; i++){
            System.out.println(listNum.get(i).getInt());
        }
        //task 11
        for(int i = 0; i < 10; i++){
            System.out.println(listNum.get(i).getDouble());
        }
        //task 12
        for(int i = 0; i < 10; i++){
            System.out.println(listNum.get(i).getSTNotation());
        }
        System.out.println(sn.getMaxSN());
    }
    
}