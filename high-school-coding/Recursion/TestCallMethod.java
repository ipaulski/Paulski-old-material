
public class TestCallMethod
{ 
    public TestCallMethod(){

    }

    public int magicNo(int num){
        num = num + magicAdd(num);
        return num;
    }

    public int magicAdd(int num){
        return (num+1);
    }

    public static void main(String args[]){
        TestCallMethod tcm = new TestCallMethod();
        int m = 78;
        System.out.println("Magic number of "+m+" is "+ tcm.magicNo(78));
    }
}
