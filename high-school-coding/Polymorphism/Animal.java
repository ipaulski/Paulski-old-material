
public class Animal
{
    private String hairColor;
    public Animal(String hairColor){
        this.hairColor = hairColor;
    }

    public void makeSound(){
        System.out.println("animal noise...");
    }

    public void move(){
        System.out.println("animal moves...");
    }

    public String getHairColor(){
        return hairColor;
    }

    public String toString(){
        return "["+super.toString()+"[hair color "+hairColor;
    }
    
    public String getName(){
        return null;
    }
}
