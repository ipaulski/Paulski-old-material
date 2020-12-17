
public class Cat extends Animal
{
    public Cat(String h){
        super(h);
    }

    public String toString(){
        return "[hair color "+getHairColor();
    }
}
