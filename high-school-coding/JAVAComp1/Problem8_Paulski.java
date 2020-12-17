import javax.swing.*;
public class Problem8_Paulski
{
    JFrame g = new JFrame();
    public void given(){
        String inputt = JOptionPane.showInputDialog(g, "Enter a letter grade: ");
        String inputted = JOptionPane.showInputDialog(g, "Enter + or - or nothing");
        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        String f = "F";
        double x = 0;
        if(inputt.equals(a)){
            x = 4.0;
            if(inputted.equals("+")){
                JOptionPane.showMessageDialog(g, "Numeric value: "+x);
            }
            if(inputted.equals("-")){
                x-=.3;
                JOptionPane.showMessageDialog(g, "Numeric value: "+x);
            }
            if(inputted.equals("")){
                JOptionPane.showMessageDialog(g, "Numeric value: "+x);
            }
        }
        if(inputt.equals(b)){
            x = 3.0;
            if(inputted.equals("+")){
                x+=.3;
                JOptionPane.showMessageDialog(g, "Numeric value: "+x);
            }
            if(inputted.equals("-")){
                x-=.3;
                JOptionPane.showMessageDialog(g, "Numeric value: "+x);
            }
            if(inputted.equals("")){
                JOptionPane.showMessageDialog(g, "Numeric value: "+x);
            }
        }
        if(inputt.equals(c)){
            x = 2.0;
            if(inputted.equals("+")){
                x+=.3;
                JOptionPane.showMessageDialog(g, "Numeric value: "+x);
            }
            if(inputted.equals("-")){
                x-=.3;
                JOptionPane.showMessageDialog(g, "Numeric value: "+x);
            }
            if(inputted.equals("")){
                JOptionPane.showMessageDialog(g, "Numeric value: "+x);
            }
        }
        if(inputt.equals(d)){
            x = 1.0;
            if(inputted.equals("+")){
                x+=.3;
                JOptionPane.showMessageDialog(g, "Numeric value: "+x);
            }
            if(inputted.equals("-")){
                x-=.3;
                JOptionPane.showMessageDialog(g, "Numeric value: "+x);
            }
            if(inputted.equals("")){
                JOptionPane.showMessageDialog(g, "Numeric value: "+x);
            }
        }
        if(inputt.equals(f)){
            x = 0.0;
            if(inputted.equals("")){
                JOptionPane.showMessageDialog(g, "Numeric value: "+x);
            }
        }
    }
}