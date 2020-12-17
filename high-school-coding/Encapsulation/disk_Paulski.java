
public class disk_Paulski extends Circle_Paulski
{
    private double thickness;
    public disk_Paulski(double r, double t){
        super(r);
        thickness = t;
    }

    public void setThickness(double v){
        thickness = v;
    }

    public double volume(){
        double v;
        
        v = super.area()*thickness;
        return(v);
    }

    public boolean equals(Object obj){
        Circle_Paulski testObj = (Circle_Paulski)obj;
        
        if(testObj.getRadius()==thickness){
            return(true);
        }
        else return(false);
    }

    public String toString() {
        String circleThickness;
        
        circleThickness = "Circle has thickness "+thickness;
        return circleThickness;
    }
}
