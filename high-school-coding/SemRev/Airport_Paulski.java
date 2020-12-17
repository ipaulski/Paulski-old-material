
public class Airport_Paulski
{
    private int luggage, flightNo, terminal;
    private String passenger, airportName, airline;
    public Airport_Paulski(int num, String air, int ter, String name){
        flightNo = num;
        airline = air;
        terminal = ter; 
        airportName = name;
    }

    public void setPassenger(String p){
        passenger = p;
    }

    public void setLuggage(int l){
        luggage = l; 
    }
}
