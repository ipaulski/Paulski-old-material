
public class Car extends Vehicle
{
    private int passengers;
    private Boolean tow;
    private String engine;
    private Boolean electric;
    private float time;
    
    public Car(){
        passengers = 4;
        tow = false;
        engine = "V6";
        electric = true;
        time = 5;
        setTopSpeed(100);
    }
    
    public Car(int passengers, Boolean tow, String engine, Boolean electric, float time){
        this.passengers = passengers;
        this.tow = tow;
        this.engine = engine;
        this.electric = electric;
        this.time = time;
    }
    
    public Car(String color, int passengers, int topSpeed){
        setColor(color);
        this.passengers = passengers;
        setTopSpeed(topSpeed);
    }
    
    public void setPassengers(int passengers){
        this.passengers = passengers;
    }
    
    public void setTow(Boolean tow){
        this.tow = tow;
    }
    
    public void setEngine(String engine){
        this.engine = engine;
    }
    
    public void setElectric(Boolean electric){
        this.electric = electric;
    }
    
    public void setTime(float time){
        this.time = time;
    }
    
    public int getPassengers(){
        return passengers;
    }
    
    public Boolean getTow(){
        return tow;
    }
    
    public String getEngine(){
        return engine;
    }
    
    public Boolean getElectric(){
        return electric;
    }
    
    public float setTime(){
        return time;
    }
    
    public void print(){
        super.print();
        System.out.println("Passengers: " + passengers + "\nTow: " + tow +
        "\nEngine: " + engine + "\nElectric: " + electric + 
        "\nTime: " + time);
    }
    
    public static void main(String[] args){
        Car obj1 = new Car();
        obj1.print();
        Car obj2 = new Car(2, false, "ILX", false, 8);
        obj2.print();
        obj2.setTime(6);
        obj2.print();
        Car obj3 = new Car("white", 4, 160);
        obj3.print();
        obj3.setTow(false);
        obj3.setEngine("TL");
        obj3.setElectric(true);
        obj3.setTime(5);
        obj3.print();
    }
}
