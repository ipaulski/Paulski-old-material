
public class CipherDecode_Paulski
{
    public CipherDecode_Paulski(){}

    public void CipherDecode(String s){
        String x = "";
        int characters = 0;
        int p = 1;
        String worrd = s.toUpperCase();
        for(int i = 0; i < 26; i++){
            p = ""+ (p + i);
            String q = "+ " + p + " ";
            //int a = worrd.charAt(i);
            //characters = a+1;
            //char ch = (char)characters;
            //if(characters > 90){
            //    ch = (char)65;
            //    ch += (25);
            //}
            //String d = Character.toString(ch);
            //x += d;
            System.out.println(q);
        }
        //System.out.print(q);
    }
}