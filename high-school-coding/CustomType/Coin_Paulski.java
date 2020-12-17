
public class Coin_Paulski
{
    private int value;
    public Coin_Paulski(String s){
        if(s.equals("Penny")){
            value = 1;
        }
        if(s.equals("Nickel")){
            value = 5;
        }
        if(s.equals("Dime")){
            value = 10;
        }
        if(s.equals("Quarter")){
            value = 25;
        }
        if(s.equals("Dollar")){
            value = 100;
        }
    }

    public int getValue(){
        return value;
    }
}
