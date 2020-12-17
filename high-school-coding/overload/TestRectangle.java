import java.awt.Rectangle;
public class TestRectangle
{
    public static void main(String[] args){
        Rectangle box1 = new Rectangle(5, 10, 20, 30);
        Rectangle box2 = new Rectangle(10, 15, 20,30);
        //now translate box2
        box2.translate(5,15);
        Rectangle box = box1.intersection(box2);
        double area = box.getWidth()*box.getHeight();
        System.out.println(area);
        System.out.println("Expected: 100");
    }
}
