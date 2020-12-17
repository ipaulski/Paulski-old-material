
public class Pet
{
    private int legs;
    public Pet(){
        System.out.println("Pet 2: Constructor");
        legs = 4;
    }

    public Pet(int i){
        legs = i;
        System.out.println("Pet: Constructor");
    }
    
    public void canMove(){
        System.out.println("Pet: can move");
    }
    
}
