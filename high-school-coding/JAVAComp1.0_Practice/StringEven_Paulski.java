import javax.swing.*;
public class StringEven_Paulski
{
    JFrame f = new JFrame();
    public StringEven_Paulski(){}

    public void given(){
        String inputt = JOptionPane.showInputDialog(f, "Enter string");
        for(int i=0; i<inputt.length(); i++){
            System.out.print(inputt.charAt(i));
            i++;
        }
    }
}