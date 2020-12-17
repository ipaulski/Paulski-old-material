
public class City_Paulski
{
    private String passenger, city;
    private int luggage;
    private Airport_Paulski airport;
    public City_Paulski(String c){
        city = c;
    }

    public void setPassenger(String p){
        passenger = p;
    }

    public void setLuggage(int l){
        luggage = l;
    }

    public void setAirport(Airport_Paulski a){
        airport = a;
    }
}
