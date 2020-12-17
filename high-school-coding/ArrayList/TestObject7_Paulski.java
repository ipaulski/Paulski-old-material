
public class TestObject7_Paulski
{
    private int first;
    private int second;
    public String color;
    public double[] num = new double[5];
    public TestObject7_Paulski(int i, int j, String s){
        first = i;
        second = j;
        color = s;
    }

    public String toString(){
        return "["+first+","+second+"]"+color;
    }
}
