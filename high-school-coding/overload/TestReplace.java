
public class TestReplace
{
    public TestReplace(){
        String s = "Today will be a great day, kate!";
        String s1 = s.replace("t", "e").replace("e","o").replace("w","k").replace("k","u");
        System.out.println(s1);
    }
}
