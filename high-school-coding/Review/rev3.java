
public class rev3
{
    public int r = 0;
    public void trye(){
        r = (int)(Math.random()*100 +1);
        System.out.println("The number is: " + r);
        if(r%2==0){
            System.out.println("EVEN");
        }
        else if(r%10==0){
            System.out.println("10;s MULTIPLE");
        }
        else if(r%13==0){
            System.out.println("13's MULTIPLE");
        }
        else if(r%5==0){
            System.out.println("5's MULTIPLE");
        }
        else
            System.out.println("There are no multiples");
    }
}
