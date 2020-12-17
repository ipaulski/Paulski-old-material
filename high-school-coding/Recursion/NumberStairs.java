
public class NumberStairs
{
    public void printNumStairs_R(int n){
        if(n==1){} 
        else{
            for(int x=0; x<n; x++){
                for(int i=n; i>x; i--){
                    System.out.print(n-x);
                }
                System.out.println();
            }
        }
    }
    
    public void printNumStairs_RB(int n){
        if(n==n){} 
        else{
            for(int x=n; x>0; x--){
                for(int i=1; i>x; i++){
                    System.out.print(n);
                }
                System.out.println();
            }
        }
    }
}
