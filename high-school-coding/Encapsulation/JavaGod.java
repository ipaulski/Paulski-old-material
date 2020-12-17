//Most of the answers(codes) you need to write are less than 2 lines (except for #4 and #5)
//If you need to add more than 2 lines of codes, you have to read the instructions again
//------ JavaGod.jave ------ Don't change this file

public class JavaGod
{
    public int gNumber;
    private int oNumber;
    private String dWord;
    public JavaGod(){
        gNumber = 23;
        oNumber = 21;
        dWord = "I am Java god";
    }

    public int getO(){
        return oNumber;
    }

    public String getD(){
        return dWord;
    }

    public void setD(String s){
        dWord = s;
    }

    public void printSomething(){
        System.out.println(""+gNumber +" "+ oNumber + " "+ dWord); 
    }
}