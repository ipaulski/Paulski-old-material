//Use the following startup codes to begin your project
public class TestForEachLoop_Paulski
{
    private int[] iLoop = new int[5];
    private String[] sLoop = {"APCS-A", "is", "a", "fun",
        "course"};
    public TestForEachLoop_Paulski(){
        //task #1
        //Create 10 random numbers between 1 and 100
        //populate the array iLoop using regular for loop
        for(int k = 0; k < iLoop.length; k++){
            iLoop[k] = (int)((Math.random()*100)+1);
        }
    }
    
    public int[] getLastDigit(){
        //Task #2 This method will return an array of last digit of
        //each number in array iLoop, for example, if the number
        //is 23, get 3 populated into the return array
        if(for(int k: iLoop){} 
        return iLoop;
    }
    
    public char[] getFirstCharacter(){
        //Task #3 This method will return an array that stores
        //fisrt character of each element in array sLoop
        
    }
    
    public String[][] getLDFC(){
        //Task #4 this method will return a 2D Array that combines both
        //the integer array from getLastDigit() for first 5 elements 
        //and the char array from getFirstCharacter(): 5 elements
        //You can call both methods directly to get those arrays
        //Convert both array elements to String and put together a
        // 2D array with dimension 2x5 (Use for each loop)
        
    }
}