
public class TestObject_Paulski
{
    public int iObj1, iObj2;
    public String sObj;
    public TestObject_Paulski(int i, int i2, String s1){
        iObj1 = i;
        iObj2 = i2;
        sObj = s1;
    }
    
    public String toString(){
        return "The numbers are " + iObj1 + iObj2 + " and the color is " + sObj;
    }
}
