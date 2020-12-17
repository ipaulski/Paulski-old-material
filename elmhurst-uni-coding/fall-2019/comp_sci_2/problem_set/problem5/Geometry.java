
public class Geometry
{
    public double radius, height;
    public Geometry(){}
    public double sphereVolume(double r){
        try{
            if(r<=0){
                String s = "Radius can't be less than or equal to 0.";
                IllegalArgumentException e = new IllegalArgumentException(s);
                throw e;
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
        radius = r;
        return 4.0*Math.PI*r*r*r/3.0;
    }

    public static double sphereSurface(double r){
        try{
            if(r<=0){
                String s = "Radius can't be less than or equal to 0.";
                IllegalArgumentException e = new IllegalArgumentException(s);
                throw e;
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
        return 4.0*Math.PI*r*r;
    }
    
    public double cylinderVolume(double r, double h){
        try{
            if(r<=0){
                String s = "Radius can't be less than or equal to 0.";
                IllegalArgumentException e = new IllegalArgumentException(s);
                throw e;
            }
            if(h<=0){
                String s = "Height can't be less than or equal to 0.";
                IllegalArgumentException e = new IllegalArgumentException(s);
                throw e;
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
        radius = r;
        height = h;
        return Math.PI*r*r*h;
    }
    
    public static double cylinderSurface(double r, double h){
        try{
            if(r<=0){
                String s = "Radius can't be less than or equal to 0.";
                IllegalArgumentException e = new IllegalArgumentException(s);
                throw e;
            }
            if(h<=0){
                String s = "Height can't be less than or equal to 0.";
                IllegalArgumentException e = new IllegalArgumentException(s);
                throw e;
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
        return 2.0*r*Math.PI*(r+h);
    }
    
    public static double coneSurface(double r, double h){
        try{
            if(r<=0){
                String s = "Radius can't be less than or equal to 0.";
                IllegalArgumentException e = new IllegalArgumentException(s);
                throw e;
            }
            if(h<=0){
                String s = "Height can't be less than or equal to 0.";
                IllegalArgumentException e = new IllegalArgumentException(s);
                throw e;
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
        return Math.PI*r*(r+h);
    }
}
