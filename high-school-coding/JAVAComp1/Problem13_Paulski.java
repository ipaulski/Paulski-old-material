import javax.swing.*;
public class Problem13_Paulski
{
    JFrame g = new JFrame();
    public void given(){
        String input = JOptionPane.showInputDialog(g, "Enter a starting integer");
        String inputt = JOptionPane.showInputDialog(g, "Enter an ending integer");
        int j = Integer.parseInt(input);
        int jk = Integer.parseInt(inputt);
        for(int i = j; i<=jk; i=i+2){
            System.out.println(i + ", " + (i+1));
        }
    }
}