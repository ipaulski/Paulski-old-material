
public class TestArray1019_Paulski
{
    public int[] arr = new int[100];
    public TestArray1019_Paulski(){
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)((Math.random()*50)+1);
        }
    }

    //Method getEven(): This method will return all even number integers in arr with an integer array 
    public int[] getEven(){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        int narr[] = new int[count];
        for(int k = 0; k < count; k++){
            if(arr[k]%2==0){
                narr[k] = arr[k];
            }
        }
        return narr;
    }

    //Method getOdd(): This method will return all odd number integers in arr with an integer array 
    public int[] getOdd(){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        int narr[] = new int[count];
        for(int k = 0; k < count; k++){
            if(arr[k]%2!=0){
                narr[k] = arr[k];
            }
        }
        return narr;
    }
}
