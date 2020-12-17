//Izabella Paulski 

public class Parallelogram {
    private int length, width;
    private double angle;
    public Parallelogram() {
        length = 1;
        width = 1;
        angle = 90;
    }

    public Parallelogram(int len, int wid) {
        if(len <= 0) System.out.println("Set an in bounds length");
        else length = len;
        if(wid <= 0) System.out.println("Set an in bounds width");
        else width = wid;
        angle = 90;
    }

    public Parallelogram(int len, int wid, float ang) {
        if(len <= 0) System.out.println("Set an in bounds length");
        else length = len;
        if(wid <= 0) System.out.println("Set an in bounds width");
        else width = wid;
        if(ang <= 0 || ang >=180) System.out.println("Set an in bounds angle");
        else angle = ang;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public double getAngle() {
        return angle;
    }

    public void setLength(int l) {
        if(l <= 0) System.out.println("Set an in bounds length");
        else length = l;
    }

    public void setWidth(int w) {
        if(w <= 0) System.out.println("Set an in bounds width");
        else width = w;
    }

    public void setAngle(float a) {
        if(a <=0 || a>=180) System.out.println("Set an angle greater than 0, less than 180");
        else angle = a;
    }

    public int calcPerimeter() {
        int per = (length*2) + (width*2);
        return per;
    }

    public double calcArea() {
        double area = 0;
        angle = angle*3.14159/180;//turns into radians
        area = (int)length*width*(Math.sin(angle));
        return area;
    }

    public void printBasics() {
        System.out.println("The length of the parallelogram is " + length +
            "\nThe width of the parallelogram is "+ width + "\nThe angle of the parallelogram is "
            +angle);
    }

    public void printAreaPerim() {
        System.out.println("The area of the parallelogram is "+ calcArea() +
            "\nThe perimeter of the parallelogram is " + calcPerimeter());
    }

    public static void main(String[] args) {
        Parallelogram obj1 = new Parallelogram();
        obj1.printBasics();
        obj1.printAreaPerim();
        Parallelogram obj2 = new Parallelogram(2,5);
        obj2.printBasics();
        obj2.printAreaPerim();
        Parallelogram obj3 = new Parallelogram(3,5,45);
        obj3.printBasics();
        obj3.printAreaPerim();
    }
}