
public class Chapter1_Paulski{
    private int arr[] = new int[5];
    public Chapter1_Paulski(){}

    public void problemA(){
        for(int i=0; i<5; i++){
            int n = (int)(Math.random());
            arr[i] = n;
        }
        for(int x=0; x<arr.length-1; x++){
            for(int y=0; y<arr.length-x-1; y++){
                if(arr[y] < arr[y+1]){
                    int temp = arr[y];
                    arr[y] = arr[x];
                    arr[x] = temp;
                }
            }
        }
        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public void problemB(){
        int[] b = new int[20];
        for(int y: b){
            b[y] = y+2;
        }

        for(int c=0; c<20; c++){
            System.out.print(b[c]+" ");
        }
    }

    public int[] getArray(){
        return arr;
    }
}
