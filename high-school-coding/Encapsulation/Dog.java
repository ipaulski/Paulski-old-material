
public class Dog extends Pet
{
    private String hairStyle;
    private int legs;
    public Dog(){
        System.out.println("Dog: constructor: No parameter");
    }

    public Dog(int i, String s){
        super(i);
        legs = i;
        hairStyle = s;
       // System.out.println("Dog: constructor -> leg " + super.getLegs());
    }
}
