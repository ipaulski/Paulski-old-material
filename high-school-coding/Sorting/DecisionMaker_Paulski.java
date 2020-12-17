import javax.swing.*;
public class DecisionMaker_Paulski
{
    JFrame f = new JFrame();
    private int num2;
    public DecisionMaker_Paulski(){}

    public String getQuestion(){
        String num = JOptionPane.showInputDialog(f, "Enter an integer between 1 and 10");
        num2 = Integer.parseInt(num);
        String s = "";
        if(num2 > generateNo()){
            s= "big";
        }
        else if(num2 == generateNo()){
            s= "sm";
        }
        else if(num2 < generateNo()){
            s= "eq";
        }
        else {
            s= "no";
        }
        return s;
    }

    public void checkPlay(){
        //for(int i = 0; i < 10; i++){
        int a = JOptionPane.showConfirmDialog(null,
                num2+" "+getSign()+" the number computer generated?", "GUESS THE ANSWER",
                JOptionPane.YES_NO_CANCEL_OPTION);
        //}
        if(a==JOptionPane.YES_OPTION){
            a.compareTo(getQuestion());
        }
        else if(a==JOptionPane.NO_OPTION){
            a.compareTo(getQuestion());
        }
    }

    public int getScore(){
        int score = 0;
        for(int i = 0; i < 10; i++){
            checkPlay();
            if(getQuestion()=="big"){
                score++;
            }
            else if(getQuestion()=="eq"){
                score++;
            }
            else if(getQuestion()=="sm"){
                score++;
            }
        }
        return score;
    }

    public int generateNo(){
        int guess = (int)(Math.random()*10)+1;
        return guess;
    }

    public String getSign(){
        int rand = (int)(Math.random()*3)+1;
        if(rand == 1)return "is smaller than";
        else if(rand == 2)return "is equal to";
        else return "is greater than";
    }
}
