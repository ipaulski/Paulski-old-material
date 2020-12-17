
public class RecursionTest
{
    public RecursionTest(){}

    public int getSnEven_loop(int k){
        int total = 1;
        for(int x=0;x<k;x++){
            total = total*x;
        }
        return total;
    }

    public int getSnEven(int k){
        if(k==1)return 1;
        else return(k*getSnEven(k-2));
    }

    public String addStar_loop(String s){
        for(int x = 0; x<s.length();x++){
            s.substring(x,x+1) = "*";
        }
        return s;
    }

    public String addStar(String s){
        if(s.length()==0) return "";
        else(s.substring(0,s.length()-1) = "*"); return "*";
    }

    public static String frontX_loop(String s){
        for(int x=0;x<s.length();x++){
            if(s.charAt(x).equals("x"){
                s.substring(0,1) = "x";
            }
        }
        System.out.println(s);
    }

    public static String frontX(String s){
        if(s.charAt(0)!=("x")){}
        else(s.substring(s.length()-1,s.length()) = "x"){
            System.out.println(s);
        }
    }

    public static void main(String args[]){
        RecursionTest r = new RecursionTest();
        System.out.println(r.getSnEven_loop(10));
        System.out.println(r.getSnEven(10));
        System.out.println(r.addStar_loop("abcde"));
        System.out.println(r.addStar("abcde"));
        System.out.println(r.frontX_loop("xhixhix"));
        System.out.println(r.frontX("xhixhix"));
    }
}
