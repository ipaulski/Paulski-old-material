import javax.swing.*;
public class Problem4_Paulski
{
    JFrame f = new JFrame();
    public void problem4(){
        String yr = JOptionPane.showInputDialog(f, "Enter a year");
        double year = Double.parseDouble(yr);
        int okay = (int)year/4;
        double better = year/4;
        if(okay==better){
            System.out.print("Yes");
        }
        else 
            System.out.print("No");
        } 
}
