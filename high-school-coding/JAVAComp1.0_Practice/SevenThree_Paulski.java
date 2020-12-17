
public class SevenThree_Paulski
{
    public SevenThree_Paulski(){}

    public void odd(){
        for(int i = 1; i<200; i=i+2){
            if (i%3==0 || i%7==0){
                System.out.println(i);
            }
        }
    }
}
