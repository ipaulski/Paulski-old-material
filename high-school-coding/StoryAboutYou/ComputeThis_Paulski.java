
public class ComputeThis_Paulski
{
    public double d1, d2, x, y, z, a, b;
    public ComputeThis_Paulski(){
        x = 187;
        y = 122;
        z = 14.72;
        a = 72;
        b = 3.801;
        d1 = (3*Math.PI*Math.sin(Math.toRadians(x)) + Math.abs(Math.cos(Math.toRadians(y))));
        d2 = (Math.pow((z), b) + Math.log(a));
        System.out.println(d1);
        System.out.println(d2);
    }
}
