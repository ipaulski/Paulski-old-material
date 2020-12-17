import javax.swing.*;
public class PocketTester_Paulski
{
    JFrame f = new JFrame();
    public static void main(String args[]){
        Pocket_Paulski myPocket = new Pocket_Paulski();
        askQuestion(myPocket);
        //myPocket.addCoin("Quarter", 5);
        //myPocket.addCoin("Dime", 2);
        myPocket.printTotal();
    }

    private static Pocket_Paulski askQuestion(Pocket_Paulski oldPocket){
        String fir = "", sec = "", u = "";
     
        JOptionPane.showConfirmDialog(null,
            "Do you have a coin", "Choose one", JOptionPane.YES_NO_OPTION);
       
            u = JOptionPane.showInputDialog("What kind of coin?");
            Coin_Paulski coin = new Coin_Paulski(u);
            sec = JOptionPane.showInputDialog("How many?");
            int sec2 = Integer.parseInt(sec);
            int tot = coin.getValue()*sec2;
            oldPocket.addCoin(fir,sec2);
            askQuestion(oldPocket);
        
        return oldPocket;
    }

}
