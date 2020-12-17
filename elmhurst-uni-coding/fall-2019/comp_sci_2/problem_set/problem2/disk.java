
public class disk extends Circle
{
    private double thickness;
    public disk(double r, double t){
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
        Circle testObj = (Circle)obj;
        
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
