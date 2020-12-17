
public class Feature_Paulski
{
    public String name;
    public double cost;
    public Feature_Paulski(String s, double d){
        name = s;
        cost = d;
    }
    //step 4
    public String toString(){
        return "name: " + name + "\ncost: " + cost;
    }
}