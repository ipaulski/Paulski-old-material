import java.util.*;
public class FR2019
{
    public boolean findMe(String x, String y){
        boolean m = true;
        if(x.contains(y)){
            m = true;
        }
        return m;
    }

    public int countMe(int x){
        String y = "" + x;
        int m = y.length();
        return m;
    }

    public int combine2(int x, int y){
        String m = "" + x + y;
        int g = Integer.parseInt(m);
        return g;
    }

    ArrayList<Integer> al = new ArrayList<Integer>();
    public void randd(){
        int m = 0;
        for(int i=0; i<100; i++){
            if(i%3==0){
                m = i;
            }
            al.add(new Integer(m));
        }

        boolean[] b = {true, true, false, false, true};
        int[]aa = new int[5];
        int p = 0;
        for(int j = 0; j< 5; j++){
            if(b[j].contains("true")){
                p = 0;}
                else 
                p =1;
                aa.add(new Integer(p));
        }

        //         String[] day = {"Monday", "Tuesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //         day.add(new String(1, "Wednesday"));
    }
}
