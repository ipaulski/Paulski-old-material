
public class LinearEquation_Paulski
{
    private double a, b, c, d, e, f;
    public LinearEquation_Paulski(double aa, double bb, double cc, double dd, double ee, double ff){
        a = aa;
        b = bb; 
        c = cc;
        d = dd;
        e = ee;
        f = ff;
    }
    
    public double getA(){
        return a;
    }
    
    public double getB(){
        return b;
    }
    
    public double getC(){
        return c;
    }
    
    public double getD(){
        return d;
    }
    
    public double getE(){
        return e;
    }
    
    public double getF(){
        return f;
    }
    
    public boolean isSolvable(){
        if(a*d-b*c != 0) return true;
        else return false;
    }
    
    public double getX(){
        double x = 0;
        x = ((e*d)-(b*f))/((a*d)-(b*c));
        return x;
    }
    
    public double getY(){
        double y = 0;
        y = ((a*f)-(e*c))/((a*d)-(b*c));
        return y;
    }
    
    public String toString(){
        if(isSolvable()==true) return "x is "+getX()+" and y is "+getY();
        else return "The equation has no solution";
    }
}
