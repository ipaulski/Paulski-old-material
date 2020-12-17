
public class Problem4_Paulski
{
    public void given(){
        int x = (int)(((Math.random())*100)+1);
        int y = (int)(((Math.random())*100)+1);
        System.out.println("Random numbers are "+x+" and "+y);
        if(x<y){
            for(int i = x+1; i< y; i++){
                System.out.print(i+" ");
            }
        }
        else {
            for(int i = y+1; i< x; i++){
                System.out.print(i+" ");
            }
        }
    }
}
