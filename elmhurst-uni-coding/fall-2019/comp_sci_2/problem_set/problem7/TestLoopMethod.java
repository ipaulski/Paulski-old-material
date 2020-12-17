
public class TestLoopMethod
{
    public TestLoopMethod(){}
    
    public int totalCue(int a){
        int total = 0;
        for(int x = 1; x <= a; x++){
            total = total + (int)(Math.pow(x, a));
        }
        return total;
    }
    
    public static void main(String args[]){
        TestLoopMethod ran = new TestLoopMethod();
        System.out.println(ran.totalCue(3));
    }
}
