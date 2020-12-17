
/**
 * Izabella Paulski & Amaria Bloodson
 */
public class Grades
{
    private int sizeGrades = 1;
    private double[] grades;
    public Grades(){
        double[] grades = new double[sizeGrades];
    }
    
    public Grades(int givenSize){
        if(givenSize <= 0) System.out.println("Provide a value greater than 0");
        else sizeGrades = givenSize;
        double[] grades = new double[sizeGrades];
    }
    
    public int getGrades(){
        return sizeGrades;
    }
    
    public void setGrades(int index, double score){
        if(index <=0 || index>sizeGrades || score < 0 || score >105){
            System.out.println("That index and/or score is invalid");
        }
        else grades[index-1] = score; 
    }
    
    public double getIndex(int given){
        if(given <=0 || given>sizeGrades){
            System.out.println("Index is invalid");
            return -1.0;
        }
        else return grades[given-1];
    }
    
    private double averageGrades(){
        double avg = 0;
        for(int i=0; i<sizeGrades; i++){
            avg += grades[i];
        }
        return avg/sizeGrades;
    }
    
    public void getArrayAndAvg(){
        System.out.println("The grades for the class are: ");
        for(int i=0; i<sizeGrades; i++){
            System.out.print(grades[i] +" ");
        }
        System.out.println("The class average is "+averageGrades());
    }
    
    public static void main(String[] args){
        /*Grades obj1 = new Grades();
        obj1.setGrades(1, 98);
        obj1.getIndex(1);
        Grades obj2 = new Grades(5);
        obj2.setGrades(1,50);
        obj2.setGrades(2,90);
        obj2.setGrades(3,80);
        obj2.setGrades(4,39);
        obj2.setGrades(5,95);
        obj2.averageGrades();
        obj2.getArrayAndAvg();*/
    }
}
