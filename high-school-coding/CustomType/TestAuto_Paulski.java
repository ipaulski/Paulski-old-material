public class TestAuto_Paulski
{
   public static void main(String args[]){
    //instantiate an Auto object
    Auto_Paulski at = new Auto_Paulski("AMG", 73.5);
    //instantiate a	 Feature object
    Feature_Paulski fe = new Feature_Paulski("Leather Seat", 3000);
    //execute method addFeature with Feature object
    at.showFeature(fe);
    //prepare a new Feature object for receving information
    Feature_Paulski fe1 = new Feature_Paulski("", 0);
    //Run method discountValue with a feature and a new value
    fe1 = at.discountValue("GPS", 15000, 0.2);
    //print out the object
    System.out.println(fe1);
   }
}