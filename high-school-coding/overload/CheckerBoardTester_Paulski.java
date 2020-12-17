import javax.swing.JFrame;
public class CheckerBoardTester_Paulski
{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(315,339);
        frame.setTitle("CheckerBoardViewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CheckerBoardComponent_Paulski component = new CheckerBoardComponent_Paulski();
        frame.add(component);
        frame.setVisible(true);        
    }
}
