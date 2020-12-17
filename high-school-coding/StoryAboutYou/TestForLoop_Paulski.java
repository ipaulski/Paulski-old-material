
public class TestForLoop_Paulski
{
    public TestForLoop_Paulski(){}

    public void problem1(){
        for(int j = 5; j < 26; j++){
            System.out.println(j);
        }
    }

    public void problem2(){
        for(int k = 0; k < 101; k = k+2){
            System.out.println(k);
        }
    }

    public void problem3(){
        for(int g = 1; g < 6; g++){
            int h = (int)(((Math.random())*100)+1);
            System.out.println(h);
        }
    }

    public void problem4(){
        for(int s = 0; s < 5; s++){
            int a = (int)((Math.random())*2);
            System.out.println(a);
        }
    }
    
    public void problem5(){
        for(int x = 0; x < 5; x++){
            for(int z = 0; z < 5; z++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}