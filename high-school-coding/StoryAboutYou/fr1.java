
public class fr1
{
    private String typeOfAssignment;
    private int iteration;
    private double score;
    public fr1(String s, int i, double d){
        String typeOfAssignment;
        int iteration;
        double score;
    }

    public void printType(){
        System.out.println(typeOfAssignment);
    }

    public void printIteration(){
        if(iteration>=5){
            System.out.println("Validation");
        }
        else{
            System.out.println("Commencement");
        }
    }
}	