
public class CipherEncode_Paulski
{
    public CipherEncode_Paulski(){}

    public void userIn(String s, int k){
        String x = "";
        int characters = 0;
        String worrd = s.toUpperCase();
        for(int i = 0; i < worrd.length(); i++){
            int a = worrd.charAt(i);
            characters = a+k;
            char ch = (char)characters;
            if(characters > 90){
                ch = (char)65;
                ch += (k-1);
            }
            String d = Character.toString(ch);
            x += d;
        }
        System.out.print(x);
    }
}