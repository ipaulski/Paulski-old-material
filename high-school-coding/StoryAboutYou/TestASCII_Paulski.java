import javax.swing.*;
public class TestASCII_Paulski
{
    JFrame f = new JFrame();
    public TestASCII_Paulski(){}
    
    public void userInput(){
         String input = JOptionPane.showInputDialog(f, "Please enter a sentence");
         int characters = 0;
         System.out.print("The codes for your words are: ");
         for(int i= 0; i < input.length(); i++){
             characters = input.charAt(i);
             System.out.print(characters +" ");
            }
    }
}
