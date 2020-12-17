//The test cover the following areas:
//DC and IC
//Method type
//Loop and conditional
public class ProgrammingTest3_Paulski
{
    //The following are instance field variables
    private int myRandom1, myRandom2;
    public ProgrammingTest3_Paulski()
    {
        myRandom1 = problem1();
        myRandom2 = problem1();
        problem2(myRandom1, myRandom2);
        System.out.println("The average is "+problem3(100));

    }
    
    //problem 1 
    //write the complete method including the header and the body
    //problem 1 will use random function and generate an integer between 1 and 50 
    //Input type: none; Return type: integer
    public int problem1(){
        int sak = (int)((Math.random()*50)+1);
        return sak;
    }

    //problem 2
    //write the complete method including the header and the body
    //This method will input two random integers from problem1()
    //And print out the following format
    // ___  + ___ = __________
    //Input Type: integers; Return Type: none
    public void problem2(int myRandom1, int myRandom2){
        int m = myRandom1 + myRandom2;
        System.out.println(myRandom1 + " + " + myRandom2 + " = " + m);
    }
    
    //problem 3
    //write the complete method including the header and the body
    //This method will call problem1 n times to get n integers
    //and return the average of these numbers
    //Input: integer; Return Type: double (why?)
    public double problem3(int n){
        int x= 1;
        for(int k = 0; k < n; k++){
            x = problem1();
        }
        double h = (x+x)/n;
        return h;
    }
}
