//Izabella Paulski
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class RightTriangleDriver
{
    public static void main(String[] args){
        ComparableRightTriangle obj1 = new ComparableRightTriangle();
        System.out.println("Perimeter is " + obj1.getPerimeter());
        System.out.println("Angle is " + obj1.getAngle());
        System.out.println("Base is " + obj1.getBase());
        System.out.println("Color is " + obj1.getColor());
        System.out.println("Area is " + obj1.getArea());

        ComparableRightTriangle obj2 = new ComparableRightTriangle(8,15,90.0);
        System.out.println("Perimeter is " + obj2.getPerimeter());
        System.out.println("Angle is " + obj2.getAngle());
        System.out.println("Base " + obj2.getBase());
        System.out.println("Color " + obj2.getColor());
        System.out.println("Area " + obj2.getArea());

        List<ComparableRightTriangle> lst = new ArrayList<>();
        lst.add(obj2);
        lst.add(obj1);
        Collections.sort(lst);

        for (ComparableRightTriangle c : lst){
            System.out.println(c.toString());
        }
    }
}
