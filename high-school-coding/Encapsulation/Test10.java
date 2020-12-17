
//----- Tester class -- task #5 and other output
public class Test10
{
    public static void main(String args[]){
        ProgrammingTest10 pt = new ProgrammingTest10();
        System.out.println("gNumber = "+ pt.gNumber); // line 1
        System.out.println("jNumber = "+ pt.getJ()); // line 2
        pt.setS("Good bye"); //Line 3
        System.out.println("jNumber = "+ pt.getS()); // line 3
        pt.printSomething(); //Line 4
        //Task #5 Write codes to print out all 3 instance fields for JavaGod
        //for dWord, print out "I am a Java Programmer" using only object pt 
        super.printSomething();
        pt.setD("I am a Java Programmer");
    }
}