
public class P01Paulski
{
    private boolean[] arr = new boolean[100];

    public P01Paulski(){}

    public void setLocker(){
        for(int x = 0; x<100; x++){
            arr[x] = false;
        }
        for(int s = 1; s<=100; s++){
            for(int i = s; i<=100; i+=s){
                if(arr[i-1] == true) arr[i-1] = false;
                else arr[i-1] = true;
            }
        }
    }

    public void getResult(){
        for(int i = 0; i<100; i++){
            if(arr[i]==true){
                System.out.println("Locker "+ (i+1) +" is open");
            }
        }
    }
}
