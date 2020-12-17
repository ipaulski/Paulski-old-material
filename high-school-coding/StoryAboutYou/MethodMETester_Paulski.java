
public class MethodMETester_Paulski
{
    public static void main(String args[]){
        MethodME_Paulski m = new MethodME_Paulski();
        m.printMe();
        m.printThis("Hello, world");
        int a = 2;
        int b = 4;
        int outcome3 = m.addTwo(a,b);
        m.showInt(23.77);
        m.showDecimal(23.77);
        m.findWord("I am the greatest", "the");
        m.printWord("I am the greatest", "the");
      //  m.enCrypt("took a book by its look", "oo");
    }
}
