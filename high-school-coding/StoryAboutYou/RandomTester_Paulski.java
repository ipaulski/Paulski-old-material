
public class RandomTester_Paulski
{
    public RandomTester_Paulski(){
        //No.1
        for(int i = 0; i < 10; i++){
            int k = (int)(((Math.random())*26)%21+5);
            System.out.println("random number is " + k);
        }

        //No.2
        String r = "Universal";
        int x = (int)(((Math.random())*9)%8);
        int a = (int)(((Math.random())*9)%8);
        System.out.println(""+r.charAt(a) + r.charAt(x)+"\n");

        //No.3: pick 2 random #s then switch and have for loop to repeat that statement
        for(int i = 0; i < 10; i++){
            String s = "BabaDoo";
            int ran;
            s = s.substring(i)+s.substring(0,i);
            
            //int w = (int)(((Math.random())*7)%7);
            //int w1 = (int)(((Math.random())*7)%7);
            //int temp = w;
            //w = w1;
            //w1 = temp;
            //System.out.print(s.charAt(w)+s.charAt(w1));
            System.out.println(s);
        }
    }
}