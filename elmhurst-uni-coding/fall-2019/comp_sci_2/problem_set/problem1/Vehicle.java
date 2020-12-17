
public class Vehicle
{
    private String color;
    private int topSpeed;
    
    public Vehicle(){
        color = "red";
        topSpeed = 15;
    }
    
    public Vehicle(String color, int topSpeed){
        this.color = color;
        this.topSpeed = topSpeed;
    }
    
    public String getColor(){
        return color;
    }
    
    public int getTopSpeed(){
        return topSpeed;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }
    
    public void print(){
        System.out.println("Color: " + color + "\nTop Speed: " 
        + topSpeed);
    }
    
    public static void main(String[] args){
        Vehicle obj1 = new Vehicle();
        obj1.print();
        Vehicle obj2 = new Vehicle("blue", 160);
        obj2.print();
        obj2.setColor("silver");
        obj2.print();
    }
}
