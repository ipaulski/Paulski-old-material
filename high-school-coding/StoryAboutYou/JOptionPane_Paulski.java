import javax.swing.*;
public class JOptionPane_Paulski
{
    JFrame f = new JFrame();
    public void given(){
        String first = JOptionPane.showInputDialog(f, "What is your first name?");
        String last = JOptionPane.showInputDialog(f, "What is your last name?");
        String age = JOptionPane.showInputDialog(f, "What is your age?");
        String math = JOptionPane.showInputDialog(f, "What is your grade % in math?");
        String sci = JOptionPane.showInputDialog(f, "What is your grade % in science?");
        String eng = JOptionPane.showInputDialog(f, "What is your grade % in English?");
        double mathnum = Double.parseDouble(math);
        double scinum = Double.parseDouble(sci);
        double engnum = Double.parseDouble(eng);
        double avg = (mathnum+scinum+engnum)/3;
        JOptionPane.showMessageDialog(f, "First Name: "+ first + "\nLast Name: "
        + last + "\nAge: " + age + "\nAverage: " + avg );
    }
}