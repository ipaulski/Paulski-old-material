import javax.swing.*;
public class Problem12_Paulski
{
    JFrame g = new JFrame();
    public void gi(){
        String inputt = JOptionPane.showInputDialog(g, "Enter at least 15 characters (no special characters");
        String replaceString = inputt.replace(" ","*");
        
    }
}