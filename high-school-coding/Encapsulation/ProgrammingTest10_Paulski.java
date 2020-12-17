
//------ ProgrammingTest10 --------------- 4 tasks
public class ProgrammingTest10_Paulski extends JavaGod
{
    public int iNumber;
    private int jNumber;
    private String sWord;
    public ProgrammingTest10_Paulski(){
        //Task#1: In order for line 1 to print out the value of gNumber
        System.out.println(gNumber);
        //Task#2: In order for line 2 to print out the value of oNumber
        System.out.println(getO());
    }

    public int getJ(){
        return jNumber;
    }

    public void setS(String sWord){
        //Task #3: write codes to make line 3 work 
        this.sWord = sWord;
    }

    public String getS(){
        return sWord;
    }
    //Task #4: What do you need to do to make Line 4 work and print out the value of iNumber, jNumber, sWord
    // use only the parent method name printSomething() - this is a very important inheritance concept!! 
    
}