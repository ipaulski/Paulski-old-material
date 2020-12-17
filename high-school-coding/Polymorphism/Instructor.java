
public class Instructor extends Person
{
    private double salary;
    public Instructor(String n, int b, double s){
        super(n,b);
        salary = s;
    }
    
    public String toString(){
        return "Instructor[super="
        +super.toString()
        +",salary="
        +salary+"]";
    }
}
