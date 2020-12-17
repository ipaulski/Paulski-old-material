
public class Problem14_Paulski
{
    public void given(){
        String s1 = "-";
        String s2 = "|";
        for(int i = 0; i < 22; i++){

            if(i%7==0){
                System.out.print(s2);
            }
            else
                System.out.print(s1);
        }
    }
}
