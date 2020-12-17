
public class test
{
    private String lastname;
    public test(){
        String s = "cruel";
        System.out.println(s.substring(s.length()-1, s.length())+s.substring(s.length()-2, s.length()-1)+s.substring(s.length()-3, s.length()-2)+s.substring(1, s.length()-3)+s.substring(0,s.length()-4));
    }
}