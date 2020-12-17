
public abstract class myHeight_Paulski implements myInterface_Paulski
{
    public int inches;
    public int feet;
    public double cm;
    public double meters;
    private double height;
    public myHeight_Paulski(){}

    public String calculateHeight(int x){
        inches = x;
        feet = inches/12;
        double remainder = ((double)inches/12) - feet;
        return feet +" feet and "+Math.ceil(remainder*10) +" inches.";
    }

    public String calculateHeight(int x, int y){
        feet = x;
        inches = y;
        return feet +" feet and "+inches +" inches.";
    }

    public String calculateHeight(double x){
        cm = x;
        feet = (int)cm/(int)(30.48);
        double remainder = ((double)cm/30.48) - feet;
        remainder = Math.ceil((remainder)/.0833);
        return feet +" feet and "+remainder +" inches.";
    }

    public String calculateHeight(double x, double y){
        meters = x;
        cm = y;
        double total = meters*100 + cm;
        feet = (int)total/(int)(30.48);
        double remainder = ((double)total/30.48) - feet;
        remainder = Math.ceil((remainder)/.0833);
        return feet +" feet and "+remainder +" inches.";
    }

    public double getHeight(){
        return height;
    }
}
