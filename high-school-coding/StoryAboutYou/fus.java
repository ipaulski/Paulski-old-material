
public class fus
{
    private String in = "";
    public fus(String s){
        in = s;
    }
    
    public boolean existw(String s){
        return in.contains(s);
    }
    
    public String corre(String s1, String s2){
        if(existw(s1)==true){
            return in.replace(s1,s2);
        }
        else
        return in;
    }
}
