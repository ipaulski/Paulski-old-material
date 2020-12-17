//Complete the following 5 tasks
public class ProgrammingTest6_Paulski
{
   //instance fields declarations
   public int iObj1, iObj2;
   public String sObj;
   public boolean bObj;
   public TestObject_Paulski tObj;
   //The default constructor
   public ProgrammingTest6_Paulski(){
       iObj1 = 2;
       iObj2 = 3;
       bObj = true;
       sObj = getString(bObj);
       tObj = new TestObject_Paulski(iObj1, iObj2, sObj); 
    }

   //Task #1 Create a OL constructor with both integer instance fields iObj1, iObj2
   // input by the user, all the rest of them using default
   public ProgrammingTest6_Paulski(int i1, int i2){
       iObj1 = i1;
       iObj2 = i2;
       bObj = true;
       sObj = getString(bObj);
       tObj = new TestObject_Paulski(iObj1, iObj2, sObj); 
    }
   //Task #2 Create a OL constructor with all instance fields
   // input by the user, except for the TestObject_Paulski using default
   public ProgrammingTest6_Paulski(int i1, int i2, String s1){
       iObj1 = i1;
       iObj2 = i2;
       bObj = true;
       sObj = s1;
       tObj = new TestObject_Paulski(iObj1, iObj2, sObj); 
    }
   //Task #3 Create a OL method to print out the TestObject_Paulski tObj 
   public void printObject(){
      System.out.println(tObj);
    }
   //Task #4 Create a OL method to change the color string with input s
   //and print out the TestObject_Paulski tObj  
   
   public void printObject(String s){
       tObj.sObj = s;
       System.out.println(tObj);
    }
   //Task #5 Create a OL method to print out the TestObject_Paulski tObj
   public TestObject_Paulski getObject(int i, int j, String s){
       TestObject_Paulski to = new TestObject_Paulski(i, j, s);
       return to;
    }
    
   public String getString(boolean b_){
       String outcome = "";
       if(b_) return "Blue";
       else return "Red";
    }
   //you may use the following main() for testing 
   public static void main(String args[]){
       ProgrammingTest6_Paulski p = new ProgrammingTest6_Paulski();
       p.printObject();
       p.printObject("Red");
       System.out.println(p.getObject(45, 67, "Black"));
    }
}
