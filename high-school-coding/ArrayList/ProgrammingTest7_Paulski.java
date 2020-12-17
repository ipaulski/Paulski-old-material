import java.util.ArrayList;
public class ProgrammingTest7_Paulski
{
    private ArrayList<Integer> iList1 = new ArrayList<Integer>();
    private ArrayList<Integer> iList2 = new ArrayList<Integer>();
    private ArrayList<Integer> iList3 = new ArrayList<Integer>();
    private TestObject7_Paulski myObj;
    private int first;
    private int second;
    public String color;
    //Task 1; Create a constructor for getting 3 input parameters in
    public ProgrammingTest7_Paulski(int i, int j, String s){
        first = i;
        second = j;
        color = s;
    }

    //task 2: Method buildList will take in 2 integers and build lists of
    //integers for iList1 or iList2 with m integers (use loops)
    //Use random numbers between 1 and 100
    //m: number of integer
    //n: which iList (n==1 iList1, n==2 iList2)
    public void buildList(int m, int n){
        for(int i = 0; i < m; i++){
            if(n==1){
                iList1.add(new Integer((int)Math.random()*100 + 1));
            }
            else if(n==2){
                iList2.add(new Integer((int)Math.random()*100 + 1));
            }
        }
    }

    //Task 3: Method printList 
    //print out list for iList1(n==1) or iList2(n==2) use loops 
    public void printList(int n){
        if(n==1){
            for(int i =0; i < iList1.size(); i++){
                System.out.println(iList1.get(i)+" ");
            }
        }
        else if(n==2){
            for(int i =0; i < iList2.size(); i++){
                System.out.println(iList2.get(i)+" ");
            }
        }
    }

    //Task 4: return a new integer ArrayList that combine iList1 and iList2
    //iList1 first then iList2
    public ArrayList<Integer> combineList(){
        ArrayList<Integer> iList3 = new ArrayList<Integer>();
        for(int i = 0; i < iList1.size(); i++){
            iList3.add(new Integer(iList1.get(i)));
        }

        for(int i = 0; i < iList2.size(); i++){
            iList3.add(new Integer(iList2.get(i)));
        }
        return iList3;
    }

    //Task 5: Method buildObjList(n) will build n number of TestObject7_Paulski provided with proper input
    //Return an ArrayList of TestObject7_Paulski ---> Write the whole method add necessary codes in main() to test
    public ArrayList<TestObject7_Paulski> buildObjList(int n){
        ArrayList<TestObject7_Paulski> tun = new ArrayList<TestObject7_Paulski>();
        for(int i =0; i < n; i++){
            for(int p = 0; p < iList3.size(); p ++){
                for(int x = 1; x < iList3.size(); x ++){
                    tun.add(new TestObject7_Paulski(iList3.get(p), iList3.get(x), "Blue"));
                }
            }
        }
        return tun;
    }

    //use the following codes for testing only
    public static void main(String args[]){
        //instantiate an object
        ProgrammingTest7_Paulski p7 = new ProgrammingTest7_Paulski(2, 3, "Blue");
        //use the following statements to verify your codes
        System.out.println(p7.myObj);
        p7.buildList(5, 1); //create a list of integer for iList1
        p7.buildList(4, 2); //create a list of integer for iList2
        p7.printList(1);
        p7.printList(2);
        ArrayList<Integer> iList = new ArrayList<Integer>();
        iList = p7.combineList();
        //print out the content of the arraylist
        //what is the difference between 1 and 2
        System.out.print(iList); // option 1
        System.out.println();
        // option 2
        for(int i = 0; i < iList.size(); i++)
            System.out.print(iList.get(i)+",");

        //task 5 
        p7.buildObjList(5);
    }
}
