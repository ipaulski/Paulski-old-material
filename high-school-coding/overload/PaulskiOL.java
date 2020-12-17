
public class PaulskiOL
{
    private String name;
    //Constructor OL
    public PaulskiOL(){  //default
        name = "Paulski";
    }
    public PaulskiOL(String s){  //take user input
        name = s;
    }
    //method OL
    public void iSaid(){
        System.out.println(name+ " said \"Hello\"");
    }
    public void iSaid(int i){
        System.out.println(name+ " is " + "\"" + i + "\"" + " years old");
    }
    //Hybrid Main
    public static void main(String args[]){
        //instantiation of a new PaulskiOL
        PaulskiOL p = new PaulskiOL();
        p.iSaid();
        p.iSaid(50);
        PaulskiOL p1 = new PaulskiOL("Patel");
        p1.iSaid();
        p1.iSaid(17);
    }
}
