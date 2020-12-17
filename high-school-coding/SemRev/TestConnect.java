
public class TestConnect
{
    public TestConnect(){
        Plane_Paulski airlineObj = new Plane_Paulski("Bob Smith", 2);
        Airport_Paulski LAXObj = new Airport_Paulski(775, "American", 23, "LAX");
        LAXObj.setPassenger(airlineObj.getPassenger());
        LAXObj.setLuggage(airlineObj.getLuggage());
        Plane_Paulski United2Paris = new Plane_Paulski();
        United2Paris.setPassenger(airlineObj.getPassenger());
        United2Paris.setLuggage(airlineObj.getLuggage());
        City_Paulski Paris = new City_Paulski("Paris");
        Paris.setPassenger(airlineObj.getPassenger());
        Paris.setLuggage(airlineObj.getLuggage());
    }
}
