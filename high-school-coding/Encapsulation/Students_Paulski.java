import java.util.*;
public class Students_Paulski
{
    private String Firstname = "John";
    private String Lastname = "Doe";
    private ArrayList<Grade> grade = new ArrayList<Grade>();
    private int gradeLevel = 12;
    public Students_Paulski(){
    }
    
    public Students_Paulski(String last, String first){
        Firstname = first;
        Lastname = last;
    }
    
    private void setGrade(double grade){
        Grade.add("Math", 95.6);
    }
    
    public double getGrade(String subject){
        return 23;
    }
    
    public String getLastName(){
        return Lastname;
    }
    
    public String getFirstName(){
        return Firstname;
    }
    
    public String[] getSubject(){
        String[] a = new String[grade.length()];
        return a;
    }
    
    public void printGrade(){
        //System.out.println(getSubject + "\t" + getGrade);
    }
    
    public static void main(String args[]){
        Student_Paulski st = new Student_Paulski("Twain", "Mark");
        st.printGrade();
    }
}
