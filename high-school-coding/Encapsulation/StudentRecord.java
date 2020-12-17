
public class StudentRecord
{
    private int[] scores;
    private double average(int first, int last){
        int count = 0;
        double num = 0;
        for(int x = 0; x < scores.length - 1; x++){
            if(scores[x] <= last && scores[x] >= first){
                scores[x] += num;
                count++;
            }
        }
        return num/count;
    }

    private boolean hasImproved(){
        boolean maybe = false;
        int count = 0;
        for(int x = 0; x < scores.length - 2; x++){
            if(scores[x+1] >= scores[x]){
                count++;
            }
        }
        if(count == scores.length){
            maybe = true;
        }
        return maybe;
    }

    public double finalAverage(){
        double neww = 0;
        int start = scores.length/2;
        if(hasImproved() == true){
            neww = average(scores[start], scores[scores.length-1]);
        }
        else
            neww = average(scores[0], scores[scores.length-1]);
        return neww;
    }
}
