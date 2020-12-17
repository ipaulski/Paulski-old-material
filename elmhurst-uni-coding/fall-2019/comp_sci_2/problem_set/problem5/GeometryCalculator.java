import java.util.*;
public class GeometryCalculator
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        double r = in.nextDouble();

        System.out.println("Please enter the height: ");
        double h = in.nextDouble();
        
        Geometry myGeo = new Geometry();
        System.out.println(myGeo.sphereVolume(1.0));
        System.out.println(Geometry.sphereSurface(1.0));
        
        System.out.println(myGeo.cylinderVolume(1.0,1.0));
        System.out.println(Geometry.cylinderSurface(1.0,1.0));
        System.out.println(Geometry.coneSurface(1.0,1.0));
    }
}
