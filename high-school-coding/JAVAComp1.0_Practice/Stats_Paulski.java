
public class Stats_Paulski
{
    public void random(){
        int even = 0;
        int odd = 0;
        for(int i=0; i<100; i++){
            int k = (int)(((Math.random())*100));
            if(k%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.print(odd+" odd numbers\n"+even+" even numbers");
    }
}