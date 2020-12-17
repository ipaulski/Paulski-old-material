//Izabella Paulski
public class RightTriangle extends GeometricObject
{
    private int base, height, hyp;
    private double angle;
    public RightTriangle(){
        this(3,4,90.0);
    }
    
    public RightTriangle(int base, int height, double angle){
        this.base = base;
        this.height = height;
        this.angle = angle;
    }
    
    public RightTriangle(int base, int height, double angle, String color, boolean filled){
        this.base = base;
        this.height = height;
        this.angle = angle;
        this.setColor(color);
        this.setFilled(filled);
    }
    
    public int getBase(){
        return base;
    }
    
    public void setBase(int b){
        base = b;
    }
    
    public int getHeight(){
        return height;
    }
    
    public void setHeight(int h){
        height = h;
    }
    
    public double getAngle(){
        return angle;
    }
    
    public void setAngle(double a){
        angle = a;
    }
    
    public double getPerimeter(){
        int perim = 0;
        hyp = (height*height) + (base*base);
        hyp = (int)Math.sqrt(hyp);
        return height + base + hyp;
    }
    
    public double getArea(){
        return base*height/2;
    }
    
    public String toString(){
        return "The sides of the right triangle are: " + base + ", " + height
        + ", " + hyp + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
