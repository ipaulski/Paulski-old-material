//This is a DC
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator_Paulski implements ActionListener {
    JFrame frame, frameOL;
    JPanel contentPane;
    JLabel prompt1, prompt2, prompt3, result;
    JTextField first, second;
    JButton addButton, subtractButton, multiplyButton, divideButton, resButton;

    public Calculator_Paulski(){
        /* Create and set up the frame */
        frame = new JFrame("Paulski's Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Create a content pane with a GridLayout and empty borders */
        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(0, 2, 10, 5));
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        /* Create and add a prompt and then a text field */
        prompt1 = new JLabel("Enter the first number: ");
        contentPane.add(prompt1);

        first = new JTextField(10);
        contentPane.add(first);

        /* Create and add a second prompt and then a text field */
        prompt2 = new JLabel("Enter the second number: ");
        contentPane.add(prompt2);

        second = new JTextField(10);
        contentPane.add(second);

        /* Create and add button that will display the average of the grades */
        addButton = new JButton("+");
        addButton.setActionCommand("Add");
        addButton.addActionListener(this);
        contentPane.add(addButton);

        subtractButton = new JButton("-");
        subtractButton.setActionCommand("Subtract");
        subtractButton.addActionListener(this);
        contentPane.add(subtractButton);

        multiplyButton = new JButton("x");
        multiplyButton.setActionCommand("Multiply");
        multiplyButton.addActionListener(this);
        contentPane.add(multiplyButton);

        divideButton = new JButton("/");
        divideButton.setActionCommand("Divide");
        divideButton.addActionListener(this);
        contentPane.add(divideButton);

        prompt3 = new JLabel("The result is : ");
        contentPane.add(prompt3);

        result = new JLabel(" ");
        result.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        contentPane.add(result);

        /* Add content pane to frame */
        frame.setContentPane(contentPane);

        /* Size and then display the frame. */
        frame.pack();
        frame.setVisible(true);
    }

    public Calculator_Paulski(String s){
        /* Create and set up the frame */        
        frameOL = new JFrame(s);
        frameOL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Create a content pane with a GridLayout and empty borders */
        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(0, 2, 10, 5));
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        /* Create and add a prompt and then a text field */
        prompt1 = new JLabel("Enter the first number: ");
        contentPane.add(prompt1);

        first = new JTextField(10);
        contentPane.add(first);

        /* Create and add a second prompt and then a text field */
        prompt2 = new JLabel("Enter the second number: ");
        contentPane.add(prompt2);

        second = new JTextField(10);
        contentPane.add(second);

        /* Create and add button that will display the average of the grades */
        addButton = new JButton("+");
        addButton.setActionCommand("Add");
        addButton.addActionListener(this);
        contentPane.add(addButton);

        subtractButton = new JButton("-");
        subtractButton.setActionCommand("Subtract");
        subtractButton.addActionListener(this);
        contentPane.add(subtractButton);

        multiplyButton = new JButton("x");
        multiplyButton.setActionCommand("Multiply");
        multiplyButton.addActionListener(this);
        contentPane.add(multiplyButton);

        divideButton = new JButton("/");
        divideButton.setActionCommand("Divide");
        divideButton.addActionListener(this);
        contentPane.add(divideButton);

        prompt3 = new JLabel("The result is : ");
        contentPane.add(prompt3);

        result = new JLabel(" ");
        result.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        contentPane.add(result);

        /* Add content pane to frame */
        frameOL.setContentPane(contentPane);

        /* Size and then display the frame. */
        frameOL.pack();
        frameOL.setVisible(true);
    }

    public double asmd(String op, String s1, String s2){
        double result = 0.0;
        double d1= 0.0;
        double d2 = 0.0;
        if(s1.trim().length()==0){}
        else d1 = Double.parseDouble(s1);
        if(s2.trim().length()==0){}
        else d2 = Double.parseDouble(s2);
        if(op.equals("Add"))
            result = d1 + d2;
        if(op.equals("Subtract"))
            result = d1 - d2;
        if(op.equals("Divide"))
            result = d1 / d2;
        if(op.equals("Multiply"))
            result = d1 * d2;
        return result;
    }

    public void actionPerformed(ActionEvent event) {
        String eventName = event.getActionCommand();
        double dResult;
        String g1 = first.getText();
        String g2 = second.getText();
        if (eventName.equals("Add")) {

            //dResult = (Double.parseDouble(g1) + Double.parseDouble(g2));
            result.setText(Double.toString(asmd(eventName, g1, g2)));
        }
        if (eventName.equals("Subtract")) {

            //dResult = (Double.parseDouble(g1) - Double.parseDouble(g2));
            result.setText(Double.toString(asmd(eventName, g1, g2)));
        }
        if (eventName.equals("Multiply")) {

            //dResult = (Double.parseDouble(g1) * Double.parseDouble(g2));
            result.setText(Double.toString(asmd(eventName, g1, g2)));
        }
        if (eventName.equals("Divide")) {

            //dResult = (Double.parseDouble(g1) / Double.parseDouble(g2));
            result.setText(Double.toString(asmd(eventName, g1, g2)));
        }
    }

}