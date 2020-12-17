
public class Dog extends Animal
{
    private String name;
    public Dog(String h, String n){
        super(n);
        name = h;
    }

    public void makeSound(){
        System.out.println("Dog barking..");
    }

    public String toString(){
        return "[Haircolor "+super.getHairColor()+"[Name "+name;
    }

    public String showFriendHair(Dog a){
        return a.getHairColor();
    }
    
    @Override
    public String getName(){
        return name;
    }
}
