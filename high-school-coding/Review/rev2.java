
public class rev2
{
    private String myWord = "Like";
    private int myNum = 23;
    public void setString(String s){
        myWord = s;
    }
    
    public int getNum(){
        return myNum;
    }
    
    public static void main(String[] args){
        rev2 som = new rev2();
        System.out.println(som.getNum());
    }
}
