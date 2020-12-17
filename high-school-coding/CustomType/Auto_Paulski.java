public class Auto_Paulski
{
    public String name;
    public double size;
    private Feature_Paulski f;
    public Auto_Paulski(String s, double sz){
        name = s;
        size = sz;
    }
    
    public void showFeature(Feature_Paulski m){
        System.out.println("The feature " + m.name + " costs: " + m.cost);
    }

    public Feature_Paulski discountValue(String s, double c, double d){
        //Step 3: method to give discount on cost
        Feature_Paulski m = new Feature_Paulski(s,c-(c*d));
        return m;
    }
}