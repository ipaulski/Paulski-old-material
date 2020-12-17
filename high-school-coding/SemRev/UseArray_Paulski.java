
public class UseArray_Paulski
{
    public char[] arr = new char[20];
    public void fillArr(){
        int q = (int)(Math.random()*2);
        for(int b=0; b<20; b++){
            if(q == 0){
                char v = (char)(Math.random()*57+48);
                arr[b] = v;
            }
            else if(q == 1){
                char v = (char)(Math.random()*90+65);
                arr[b] = v;
            }
            else if(q==2){
                char v = (char)(Math.random()*122+97);
                arr[b] = v;
            }
        }
    }

    public void getArray(){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] <= (char)57 && arr[i] >= (char)48){
                System.out.print(arr[i] +" ");
            }
            else {
                System.out.println("No integers found");
            }
        }
    }
}
