
public class TestRandom_Paulski
{
    public TestRandom_Paulski(){
        //create a random number
        //double d = Math.random();
        //d = 1000 * d; // maKe it bigger
        //int k = (int)d; //convert to integer
        //k = k%10; //can you explain this
        //System.out.println("random number is " + k);

        //int k = (int)(((Math.random())*1000)%10);
        //System.out.println("random number is " + k);

        //challenge
        for(int i = 0; i < 10; i++){
            int k = (int)(((Math.random())*1000)%10);
            System.out.println("random number is " + k);
        }

        //No.1 
        for(int i = 0; i < 10; i++){
            int k = (int)(((Math.random())*10)%10);
            System.out.println("random number is " + k);
        }
        //No.2
        int m = (int)(((Math.random())*12)%5+7);
        System.out.println("random number is " + m);
        //No.3
        int h = (int)(((Math.random())*6)%5+1);
        int u = 10*h;
        System.out.println("random number is " + u);
        //No.4
        String f = "Hello";
        int s = (int)(((Math.random())*5)%5);
        //System.out.println(s);
        System.out.println(f.charAt(s));
        //No.5
        int z = (int)(((Math.random())*6)%5+1);
        int y = 7*z;
        System.out.println("random number is " + y);
    }
}
