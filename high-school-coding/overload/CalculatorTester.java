//This is a IC 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
public class CalculatorTester
{
    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {public void run() {runGUI();} });
    }

    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        Calculator_Paulski mycal = new Calculator_Paulski("OVERLOADED");
    }

}
