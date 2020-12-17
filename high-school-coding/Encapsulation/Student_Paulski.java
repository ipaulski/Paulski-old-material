import java.util.*;
public class Student_Paulski
{
    private String Firstname = "John";
    private String Lastname = "Doe";
    private String subjects;
    private double grades;
    //public ArrayList<Grade> grade = new ArrayList<Grade>();
    private int gradeLevel = 12;
    public Student_Paulski(){}

    public Student_Paulski(String last, String first){
        Firstname = first;
        Lastname = last;
    }

    private void setGrade(double g){
        Grade som = new Grade(subjects, g);
        grade.add(new Grade("Math", 95.5));
        grade.add(new Grade("Science", 90.2));
        grade.add(new Grade("APCS", 92.0));
        grade.add(new Grade("English", 88.67));;
    }

    public double getGrade(String subject){
        Grade som = new Grade(subject, grades);
        return som.grades;
    }

    public String getLastName(){
        return Lastname;
    }

    public String getFirstName(){
        return Firstname;
    }

    public String[] getSubject(){
        Grade som = new Grade(subjects, grades);
        String[] a = new String[grade.size()];
        for(int x=0; x<grade.size(); x++){
            a[x] = som.subjects;
        }
        return a;
    }

    public void printGrade(){
        System.out.println(getSubject() + "\t" + getGrade(subjects));
    }

    public static void main(String args[]){
        Student_Paulski st = new Student_Paulski("Twain", "Mark");
        st.printGrade();
    }
}