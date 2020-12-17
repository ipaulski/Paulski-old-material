//Complete the following 5 tasks
public class ProgrammingTest6_Paulski2
{
    //instance fields declarations
    public int iObj1, iObj2;
    public String sObj;
    public boolean bObj;
    public ProgrammingTest6_Paulski2 tObj;
    //The default constructor
    public ProgrammingTest6_Paulski2(){
        iObj1 = 2;
        iObj2 = 3;
        bObj = true;
        sObj = getString(bObj);
        tObj = new ProgrammingTest6_Paulski2(); 
    }

    //Task #1 Create a OL constructor with both integer instance fields iObj1, iObj2
    public ProgrammingTest6_Paulski2(int i1, int i2){
        iObj1 = i1;
        iObj2 = i2;
        bObj = true;
        sObj = getString(bObj);
        tObj = new ProgrammingTest6_Paulski2(iObj1,iObj2); 
    }
    // input by the user, all the rest of them using default

    //Task #2 Create a OL constructor with all instance fields
    public ProgrammingTest6_Paulski2(int i1, int i2, boolean b1){
        iObj1 = i1;
        iObj2 = i2;
        bObj = b1;
        sObj = getString(bObj);
        tObj = new ProgrammingTest6_Paulski2(iObj1,iObj2,bObj); 
    }
    // input by the user, except for the ProgrammingTest6_Paulski2 using default

    public ProgrammingTest6_Paulski2(int i1, int i2, String s1){
        iObj1 = i1;
        iObj2 = i2;
        bObj = true;
        sObj = s1;
        //tObj = new ProgrammingTest6_Paulski2(iObj1,iObj2,s1); 
    }
    //Task #3 Create a OL method to print out the ProgrammingTest6_Paulski2 tObj 
    public ProgrammingTest6_Paulski2 printObject(ProgrammingTest6_Paulski2 tObj){
        return tObj;
    }
    
    //Task #4 Create a OL method to change the color string with input s
    //and print out the ProgrammingTest6_Paulski2 tObj  

    public ProgrammingTest6_Paulski2 printObject(String s){
        tObj.sObj = s;
        return tObj;
    }
    
    //Task #5 Create a OL method to print out the ProgrammingTest6_Paulski2 tObj
    public ProgrammingTest6_Paulski2 getObject(int i, int j, boolean s){
        ProgrammingTest6_Paulski2 to = new ProgrammingTest6_Paulski2(i, j, s);
        return to;
    }

    public String getString(boolean b_){
        String outcome = "";
        if(b_) return "Blue";
        else return "Red";
    }
    //you may use the following main() for testing 
    public static void main(String args[]){
        ProgrammingTest6_Paulski2 p = new ProgrammingTest6_Paulski2();
        p.printObject("red");
        //p.printObject(12, 13);
        //System.out.println(p.getObject(45, 67, "Black"));
    }
}
