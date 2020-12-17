import javax.swing.*;
public class Greeting_Paulski
{
    JFrame f = new JFrame();
    public Greeting_Paulski(){}

    public void given(){
        String last = JOptionPane.showInputDialog(f, "Enter last name");
        String first = JOptionPane.showInputDialog(f, "Enter first name");
        JOptionPane.showMessageDialog(f, "Hello, "+first+" "+last);
    }
}
