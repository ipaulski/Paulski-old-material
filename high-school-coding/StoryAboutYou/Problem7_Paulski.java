import javax.swing.*;
public class Problem7_Paulski
{
    JFrame f = new JFrame();
    public void problem7(){
        String yr = JOptionPane.showInputDialog(f, "Enter an integer");
        double year = Double.parseDouble(yr);
        int okay = (int)year/5;
        double okayer = year/5;
        int okayish = (int)year/7;
        double okayest = year/7;
        if(okay==okayer&&okayish==okayest){
            System.out.print("Yes");
        }
        else 
            System.out.print("No");
        } 
}
