//Instruction on Instance field vs variable
public class instanceField_Paulski
{
    //The following are IF/IV
    public String position;
    public int age;
    public double saving;
    //task #1 create an Instance Field "saving" 
    //type double and assign value of 25,000 
    
    public instanceField_Paulski(){
        saving = 25000;
        position = "Teacher";
        age = 55;
    }
    //task #2 create a method to print out position
    public void printPosition(){
        System.out.println(position);
    }
    //task #3 create a method to print out saving 
    public void printSaving(){
        System.out.println(saving);
    }
    //After you complete the assignment, test 
    //your program using object in BlueJ 
}
