/* The following program has a bug
Please use debugger to help find it
You will discover something interesting about the 
behavior of +/- operations
*/

public class FindMyBug
{
    public static void main(String args[]){
        double a=0, b = 9;
        double c = 0.5;
        for(int i = 0; i < 100; i++){
            if((a += c) == (b -= c)) 
            System.out.println("Found it at "+i);
        }
    }
}