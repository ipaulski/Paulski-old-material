
public  class ssa  
{
    public boolean s(int a, int b, int c){
        if(a==0||b*b -4*a*c<=0)
        return false;
        else return true;
    }
    
    public boolean ss(int a, int b, int c){
        return a != 0 && b*b -4*a*c > 0;
    }
}
