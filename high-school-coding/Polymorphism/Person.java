
public class Person
{
    private String name;
    private int birthYear;
    public Person(){}
    public Person(String n, int b){
        name = n;
        birthYear = b;
    }
    public String toString(){
        return "Person[name="+name+",birthYear="+birthYear+"]";
    }
}
