
public class BTester
{
    public static void main(String args[]){
        Bicycle b1, b2, b3;
        b1 = new Bicycle();
        b2 = new RoadBike();
        b3 = new MountainBike();

        b1.run();
        b2.run();
        b3.run();
        
        //b2.run(3);
        
        System.out.println("Protected: " +b3.seeMe);
    }
}
