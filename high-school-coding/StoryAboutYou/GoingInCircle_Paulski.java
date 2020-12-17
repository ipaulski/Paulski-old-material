
public class GoingInCircle_Paulski
{
    private double radius = 0.0;
    private double area = 0.0;
    public GoingInCircle_Paulski(double a){
        area = a;
    }
    public double getRadius(){
        radius = Math.sqrt(area/(Math.PI));
        return radius;
    }
}
