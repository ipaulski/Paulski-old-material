
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ComboLock__ extends JFrame
{
    private final int WINDOW_WIDTH = 400;
    private final int WINDOW_HEIGHT = 400; 

    private JButton button_lock, button_unlock, button_set;

    private JTextField textbox;
    private JPanel panel1, panel2, panel3;
    private JButton[] butt = new JButton[26];
    private String c = "";

    public ComboLock__()
    {

        super("Combination Lock");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 1));
      
        button_lock = new JButton("Lock");
        button_unlock = new JButton("Unlock");
        button_set = new JButton("Set");
        textbox = new JTextField(20);

        button_set.addActionListener(new CalcButtonListener());
        button_lock.addActionListener(new CalcButtonListener());
        button_unlock.addActionListener(new CalcButtonListener());

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        for(int x = 0;x<butt.length;x++){
            butt[x] = new JButton(""+(char)(65+x));
            panel1.add(butt[x]);
            butt[x].addActionListener(new CalcButtonListener());
        }

        panel2.add(button_lock);
        panel2.add(button_unlock);
        panel2.add(button_set);
        button_lock.setEnabled(false);
        button_unlock.setEnabled(false);
        panel3.add(textbox);

        add(panel1);
        add(panel2); 
        add(panel3);

        setVisible(true);
    }
    private class CalcButtonListener implements ActionListener
    {
        
        public void actionPerformed(ActionEvent e)
        {
            
            String eventName = e.getActionCommand();
            if(eventName == "Set"){
                c = textbox.getText();
                textbox.setText("New code is "+textbox.getText());
                button_lock.setEnabled(true);
                button_set.setEnabled(false);
            }
            else if(eventName == "Unlock"){
                if(textbox.getText().equals(c)){
                textbox.setText("Correct");
                button_set.setEnabled(true);}
                else
                textbox.setText("Incorrect");
            }
            else if(eventName == "Lock"){
                textbox.setText("");
                button_set.setEnabled(false);
                button_unlock.setEnabled(true);
            }
            else
            textbox.setText(textbox.getText()+eventName);
        }
    }
    public static void main(String[] args)
    {
        new ComboLock__();
    }
}