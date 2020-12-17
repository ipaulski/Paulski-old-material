//Please complete all tasks
public class ProgrammingTest8_Paulski
{
    private int iteration;
    private String word;
    //The following is the default constructor
    public ProgrammingTest8_Paulski(){
        iteration = 10;
        word = "Hello";
    }

    //Task #1 create 2 more constructors 
    //Constructor 1 will take in user input of integer and 
    //assign to iteration
    public ProgrammingTest8_Paulski(int i){
        iteration = i;
    }

    //Constructor 2 will take in user input of String and 
    //assign to word
    public ProgrammingTest8_Paulski(String s){
        word = s;
    }

    //Task #2 Create a method called buildStairs() that uses iteration 
    //for number of stairs to print. For example if iteration = 3
    //The ladder will look like the following:
    //1
    //23
    //456
    public void buildStairs(){
        int y = 1;
        for(int m = 1; m<iteration; m++){
            for(int x = 0; x<m; x++){
                System.out.print(y++);
            }
            System.out.println();
        }
    }
    
    

    // Task #3 create an OL method called buildStairs() and take in a string as
    // input and print out stair like the following "Hello"
    //H
    //He
    //Hel
    //Hell
    //Hello
    public void buildStairs(String s){
        word = s;
        iteration = word.length();
        for(int x = 1; x<iteration+1; x++){
            System.out.println(word.substring(0,x));
        }
    }

    //Use the following routine for your testing 
    public static void main(String[] args){
        ProgrammingTest8_Paulski pt8 = new ProgrammingTest8_Paulski(5);
        pt8.buildStairs();
        pt8.buildStairs("Hello");
    }
}
