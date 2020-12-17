import javax.swing.*;
public class Problem9_Paulski
{
    JFrame g = new JFrame();
    public void given(){
        String input = JOptionPane.showInputDialog(g, "Enter an amount of bags");
        double j = Double.parseDouble(input);
        double x = Math.ceil(j/50);
        double y = Math.floor(j/50);
        double z = x-y;
        JOptionPane.showMessageDialog(g, x+ " carton total, "+y+" filled, "+z+" NF");
    }
}