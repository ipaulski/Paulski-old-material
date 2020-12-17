
public class MethodME_Paulski
{
    public MethodME_Paulski(){}

    public void printMe(){
        System.out.println("Hello, world");
    }

    public void printThis(String s){
        System.out.println(s);
    }

    public int addTwo(int a, int b){
        return (a + b);
    }

    public int showInt(double f){
        return (int)f;
    }

    public int showDecimal(double g){
        String q = Double.toString(g);
        String e = "";
        for(int i= 0; i < q.length(); i++){
            if(q.charAt(i)==(char)46){
                e += (q.substring(i+1, q.length()));
            }
        }
        int j = Integer.parseInt(e);
        return j;
    }

    public boolean findWord(String s1, String s2){
        boolean j = true;
        boolean r = false;
        if(s1.contains(s2)==true){
            return j;
        }
        else
            return r; 
    }

    public void printWord(String s1, String s2){
        if(s1.contains(s2)==true){
            System.out.println(s2);
        }
    }

    public String enCrypt(String s1, String s2){
        String replaceString = s1.replace(s2,"*");
        if(s1.contains(s2)){
            replaceString= s1.replace(s2,"*");
        }
        return replaceString;
    }
}
