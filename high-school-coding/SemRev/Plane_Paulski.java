
public class Plane_Paulski
{
    private int luggage;   
    private String passenger;
    public Plane_Paulski(){}

    public Plane_Paulski(String p, int l){
        passenger = p;
        luggage = l;       
    }

    public String getPassenger(){
        return passenger;
    }

    public int getLuggage(){
        return luggage;
    }
    
    public void setPassenger(String pa){
        passenger = pa;
    }

    public void setLuggage(int lu){
        luggage = lu;
    }
}
