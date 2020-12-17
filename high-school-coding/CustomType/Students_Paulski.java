public class Students_Paulski
{
    public StudentData_Paulski[] studentArray;
    public int studentCount;
    public int studentSize;
    public Students_Paulski(int n){
        //step 2: Assign value to studentSize with n
        //        initialize studentCount to 0
        //        initialize studentData array with the size of studentSize
        studentSize = n;
        studentCount = 0;
        studentArray = new StudentData_Paulski[studentSize];
    }
    
    public void addStudents(String l, String f, char c, int g, double d){
        //Step 3: add one record at a time and keep track of index using studentCount
        studentArray[studentCount] = new StudentData_Paulski(l,f,c,g,d);
        studentCount++;
    }
    
    public double getGPAAverage(){
        double average = 0;
        //Step 4 DIY please
        for(int i = 0; i < studentArray.length; i++){
            average += studentArray[i].gpa;
        }
        average /= studentArray.length;
        return average;
    }
}