
public class TestCallMethod
{ 
    public TestCallMethod(){

    }

    public int magicNo(int num){
        num = num + magicNo(num);
        return num;
    }

    public int magicAdd(int num){
        return (magicMinus(num)+1);
    }
    
    public int magicMinus(int num){
        return (num-2);
    }

    public static void main(String args[]){
        TestCallMethod tcm = new TestCallMethod();
        int m = 78;
        System.out.println("Magic number of "+m+" is "+ tcm.magicNo(78));
    }
}
