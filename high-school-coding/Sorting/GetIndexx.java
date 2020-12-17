
public class GetIndexx
{
    public int getIndex(int[] a, int b){
        if(a.length == 0){
            return -1;
        }
        int low = 0;
        int high = a.length-1;

        while(low<= high){
            int middle = (low+high)/2;
            if(b>a[middle]){
                low=middle+1;
            }
            else if(b<a[middle]){
                high = middle-1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        //int[] myInt = new int[100];
        //         for(int i = 0; i < 100; i++)
        //         myInt[i] = i+3;
        int myInt[] = {2,2,33,35,44,44,44,71};
        
            GetIndexx mm = new GetIndexx();
        System.out.println(mm.getIndex(myInt,2));
    }
}
