
public class TestAnimal
{
    public static void main(String[] args){
        Dog dog1 = new Dog("Red","Rockie");
        System.out.println(dog1);
        dog1.move();
        
        Animal dog2 = new Dog("Blue", "King");//#4
        System.out.println(dog2);
        dog2.makeSound();
        dog2.move();
        
        Animal cat1 = new Cat("Orange");
        System.out.println(cat1);
        cat1.makeSound();
        cat1.move();
        
        Animal animal = new Dog("Tan","Shale");//#7
        //String hair = animal.showFriendHair(animal);
        //System.out.println("Friend has color "+hair);
        
        Animal dog3 = new Dog("Duke","black");
        System.out.println(dog3.getName() + "'s hair is "+ dog3.getHairColor());
    }
}
