import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ComboLock_Paulski extends JFrame
{
    private final int WINDOW_WIDTH = 400;  // Width
    private final int WINDOW_HEIGHT = 400; // Height

    private JButton button_lock, button_unlock, button_set;
    private JButton letters[] = new JButton[26]; 

    private JTextField textbox;

    private JPanel panel1, panel2, panel3;
    
    private String c = "";

    /**
     *  Constructor
     */

    public ComboLock_Paulski(){
        // Set the title bar text.
        super("Combination Lock");
        // set initial values

        // Set the size of the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a GridLayout manager to the content pane.
        setLayout(new GridLayout(3, 1));

        button_lock = new JButton("Lock");
        button_unlock = new JButton("Unlock");
        button_set = new JButton("Set");

        textbox = new JTextField(20);

        // Add an action listener to the button.
        button_set.addActionListener(new CalcButtonListener());
        
        button_lock.addActionListener(new CalcButtonListener());
        button_unlock.addActionListener(new CalcButtonListener());

        // Create 3 panels.
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        
        for(int i = 0; i<letters.length; i++){
            letters[i] = new JButton(""+(char)(i + 65));
            panel1.add(letters[i]);
            letters[i].addActionListener(new CalcButtonListener());
        }
        
        // Add the buttons to the panels.
        panel2.add(button_lock);
        panel2.add(button_unlock);
        panel2.add(button_set);
        button_lock.setEnabled(false);
        button_unlock.setEnabled(false);
        panel3.add(textbox);
        // Add the panels to the content pane.
        add(panel1); // Goes into row 1, column 1
        add(panel2); // Goes into row 2, column 1
        add(panel3);

        // Display the window.
        setVisible(true);
    }
    
    private class CalcButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e){
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
        new ComboLock_Paulski();
    }
}