import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
public class CheckerBoardComponent_Paulski extends JComponent
{
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        //for(int i = 0; i < 9; i++){
        Rectangle box1 = new Rectangle(0, 0, 100, 100);
        g2.setColor(Color.RED);
        g2.fill(box1);
        //}
        Rectangle box2 = new Rectangle(200, 0, 100, 100);
        g2.setColor(Color.RED);
        g2.fill(box2);
        Rectangle box3 = new Rectangle(0, 200, 100, 100);
        g2.setColor(Color.RED);
        g2.fill(box3);
        Rectangle box4 = new Rectangle(200, 200, 100, 100);
        g2.setColor(Color.RED);
        g2.fill(box4);
        Rectangle box5 = new Rectangle(100, 100, 100, 100);
        g2.setColor(Color.RED);
        g2.fill(box5);
        Rectangle box6 = new Rectangle(0, 100, 100, 100);
        g2.setColor(Color.WHITE);
        g2.fill(box6);
        Rectangle box7 = new Rectangle(100, 0, 100, 100);
        g2.setColor(Color.WHITE);
        g2.fill(box7);
        Rectangle box8 = new Rectangle(100, 200, 100, 100);
        g2.setColor(Color.WHITE);
        g2.fill(box8);
        Rectangle box9 = new Rectangle(200, 100, 100, 100);
        g2.setColor(Color.WHITE);
        g2.fill(box9);
    }
}
