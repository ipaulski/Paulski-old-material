public class TestStudents_Paulski
{
    public static void main(String args[]){
        Students_Paulski st = new Students_Paulski(5);
        st.addStudents("Smith", "Joe", 'B', 11, 3.5);
        st.addStudents("Google", "Beta", 'B', 12, 3.8);
        st.addStudents("Web", "Helen", 'A', 10, 4.1);
        st.addStudents("Roeing", "Mary", 'A', 12, 4.0);
        st.addStudents("Court", "Chip", 'B', 11, 3.8);
        
        System.out.println("The student gpa average is " + st.getGPAAverage());
    }
}