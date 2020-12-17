//Izabella Paulski
public class ComparableRightTriangle extends RightTriangle implements Comparable<RightTriangle>
{
    public ComparableRightTriangle(){
        super();
    }

    public ComparableRightTriangle(int base, int height, double angle){
        super(base,height,angle);
    }

    public ComparableRightTriangle(int base, int height, double angle, String color, boolean filled){
        super(base,height,angle,color,filled);
    }

    public int compareTo(RightTriangle obj){
        if(this.getArea() == obj.getArea())
            return 0;
        else if(this.getArea() > obj.getArea())
            return 1;
        else
           return -1;
    }
}

