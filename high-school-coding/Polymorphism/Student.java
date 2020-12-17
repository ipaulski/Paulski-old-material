
public class Student extends Person
{
    private String major;
    public Student(String n, int b, String m){
        super(n,b);
        major = m;
    }
    
    public String toString(){
        return("Student[super="
                + super.toString()+",major="
                +major+"]");
    }
}
