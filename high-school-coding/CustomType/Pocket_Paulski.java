import javax.swing.*;
public class Pocket_Paulski
{
    JFrame f = new JFrame();
    private Coin_Paulski value;
    private int currentValue;
    private int totalValue;
    private int dl, cent, cents;
    public Pocket_Paulski(){
        totalValue = 0;
        currentValue = 0;
    }
    
    public void addCoin(String s, int i){
        Coin_Paulski coins = new Coin_Paulski(s);
        currentValue = coins.getValue()*i;
    }
    
    public int getValue(){
        return totalValue;
    }
    
    public void printTotal(){
        JOptionPane.showMessageDialog(f, getValue() + " cents\n" + dl + " dollars and " + cent + " cents");
    }
}
