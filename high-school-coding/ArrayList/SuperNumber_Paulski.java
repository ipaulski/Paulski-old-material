//This is a super number class that provide various types to show number
//input: 2 constructors that take either integer or double
//processing: save the number in various forms
import java.util.*;
public class SuperNumber_Paulski
{
    private int intNum;
    private double doubleNum;
    private String sciNum;
    public ArrayList<SuperNumber_Paulski> listNum = new ArrayList<SuperNumber_Paulski>();
    public SuperNumber_Paulski(double d){
        intNum = (int)d;
        doubleNum = d;
        sciNum = String.format("%3.4E", d);
    }

    public SuperNumber_Paulski(int i){
        intNum = i;
        doubleNum = i;
        sciNum = String.format("%3.2E", doubleNum);
    }

    public int getInt(){
        return intNum;   
    }

    public double getDouble(){
        return doubleNum;   
    }

    public String getSTNotation(){
        return sciNum;   
    }

    public String getMaxSN(){
        double max = listNum.get(0).getDouble();
        for(int a = 0; a < listNum.size(); a ++){
            if(listNum.get(a).getDouble() > max){
                max = listNum.get(a).getDouble();
            }
        }
        String maxx = "" + max;
        return maxx;
    }

    public ArrayList<SuperNumber_Paulski> getLimitedNum(int i){
        for(int p = 0; p < listNum.size(); p++){
            if(listNum.get(p).getDouble() > p){
                listNum.remove(p);
            }
        }
        return listNum;
    }
}