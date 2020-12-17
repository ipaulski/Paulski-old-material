
public class SelectionSortA
{
    private int[] before;
    private int[] after;
    public SelectionSortA(int size, int[] i){
        before = new int[size];
        before = i;
        after = new int[size];
    }

    public int getMin(){
        int min = 999;
        int min_index = 0;
        int temp = 0;
        for(int i=0; i<before.length; i++){
            if(before[i]<min){
                min=before[i];
                min_index = i;
            }
        }
        before[min_index]=1000;
        return min;
    }

    public int[] sort(){
        for(int i=0; i<after.length; i++){
            after[i] = getMin();
        }
        return after;
    }
}
