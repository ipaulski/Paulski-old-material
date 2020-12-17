import javax.swing.*;
public class Problem1_Paulski
{
    JFrame f = new JFrame();
    public void problem1(){
        String num = JOptionPane.showInputDialog(f, "Enter a number");
        double numb = Double.parseDouble(num);
        if(numb>0){
            System.out.print("Positive");
        }
        else if(numb<0){
            System.out.print("Negative");
        }

}
}