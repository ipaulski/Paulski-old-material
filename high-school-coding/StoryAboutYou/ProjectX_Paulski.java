
public class ProjectX_Paulski
{
    public ProjectX_Paulski(){}

    public double[] growArray(double[] d, int growth){
        d = new double[10];
        int size = d.length;
        double[] newArray = new double[size];
        System.arraycopy(d,3,newArray,0,growth);
        /*if(growth > 0){
            System.arraycopy(d,3,newArray,0,growth);
        }
        if(growth < 0){
            System.arraycopy(d,3,newArray,0,growth);
        }*/
        return newArray;
    }
}
