
public class Triangle_Paulski
{
    private int width;
    public Triangle_Paulski(int w){
        width = w;
    }

    public int getVolume(){
        if(width ==1) return 1;
        Triangle_Paulski smallerTriangle = new Triangle_Paulski(width-1);
        int smallerArea = smallerTriangle.getVolume();
        return smallerArea + width;
    }
}
