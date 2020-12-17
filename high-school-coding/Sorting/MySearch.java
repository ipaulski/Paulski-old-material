import java.util.Arrays;
public class MySearch
{
    private int myArray_Repeat[];
    private int myArray_NoRepeat[];

    public MySearch(int k){
        for(int x = 0; x < k-1; x++){
            int h = (int)(((Math.random())*1000));
            h = myArray_Repeat[x];
        }
        Arrays.sort(myArray_Repeat);
        int counter = 0;
        for(int c = 0; c<k-1; c++){
            if(myArray_Repeat[c] != myArray_Repeat[c+1]){
                counter++;
            }
        }

        for(int y = 0; y < counter; y++){
            for(int i=0; i <k-1; i++){
                if(myArray_Repeat[i] != myArray_Repeat[i+1]){
                    myArray_NoRepeat[i] = myArray_NoRepeat[y];
                }
            }
        }
    }

    public int getIndex_L(int k){
        for(int x = 0; x < k-1; x++){
            
        }
        return 1;
    }

    public int getIndex_B(int[] a, int k){
        int low = 0;
        int high = a.length-1;
        while(low<= high){
            int mid = (low+high)/2;
            if(k>a[mid]){
                low=mid+1;
            }
            else if(k<a[mid]){
                high = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public int getCount_L(int[] a, int k){
        int count = 0;
        for(int i=0; i <a.length-1; i++){
            if(a[i]==k){
                count++;
            }
        }
        return count;
    }

    public int[] getUnique_L(int[] a, int k){
        int count = 0;
        for(int c = 0; c<k-1; c++){
            if(myArray_Repeat[c] == myArray_Repeat[c+1]){
                count++;
            }
        }

        for(int y = 0; y < count-1; y++){
            for(int i=0; i <k-1; i++){
                if(myArray_Repeat[i] == myArray_Repeat[i+1]){
                    a[i] = a[y];
                }
            }
        }
        return a;
    }

    public void main (String args[]){
        System.out.println(getIndex_B(myArray_Repeat, 5));
    }
}
