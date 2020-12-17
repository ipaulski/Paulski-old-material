
public class sFindTester
{
    public static void main(String args[]){
        Sentence_Paulski s = new Sentence_Paulski("Mississippi");        
        boolean b = s.find("sip");
        System.out.println(b);
        System.out.println("Expected: true");
        b = s.find("tip");
        System.out.println(b);
        System.out.println("Expected: false");
    }
}
