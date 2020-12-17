import javax.swing.*;
public class Guess_Paulski
{
    JFrame f = new JFrame();
    public void guess(){
        int actual = (int)(((Math.random())*10)%10);
        String guessed = JOptionPane.showInputDialog(f, "Enter an integer 0 to 9");
        int guess = Integer.parseInt(guessed);
        if(guess!=actual){
            if(guess<actual){
                System.out.println("Actual integer is bigger");
            }else
                System.out.println("Actual integer is smaller");
            String guessed2 = JOptionPane.showInputDialog(f, "Enter an integer 0 to 9");
            int guess2 = Integer.parseInt(guessed2);
            if(guess2!=actual){
                if(guess<actual){
                    System.out.println("Actual integer is bigger");
                }else
                    System.out.println("Actual integer is smaller");
                String guessed3 = JOptionPane.showInputDialog(f, "Enter an integer 0 to 9");
                int guess3 = Integer.parseInt(guessed3);
                if(guess3!=actual){
                    if(guess<actual){
                        System.out.println("Actual integer is bigger");
                    }else
                        System.out.println("Actual integer is smaller");
                    String guessed4 = JOptionPane.showInputDialog(f, "Enter an integer 0 to 9");
                    int guess4 = Integer.parseInt(guessed4);
                    if(guess4!=actual){
                        if(guess<actual){
                            System.out.println("Actual integer is bigger");
                        }else
                            System.out.println("Actual integer is smaller");
                        String guessed5 = JOptionPane.showInputDialog(f, "Enter an integer 0 to 9");
                        int guess5 = Integer.parseInt(guessed5);
                        if(guess5!=actual){
                            System.out.println("Wrong, actual answer is " + actual);
                        }
                        else          
                            System.out.println("Correct, "+guess5+ " = " +actual);
                    } 
                    else
                        System.out.println("Correct, "+guess4 +" = " +actual);
                }
                else
                    System.out.println("Correct, "+guess3+ " = " +actual);
            }
            else
                System.out.println("Correct, "+guess2 +" = " +actual);
        }
        else 
            System.out.println("Correct, "+guess+ " = " +actual);
    }
}