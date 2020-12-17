
public class Date extends AccountPaulski
{
    public String week, month, timeZone;
    public int day, hour, min, sec, year;
    public Date(String w, String m, String tz, int d, int h, int mi, int s, int y){
        week = w;
        month = m;
        timeZone = tz;
        day = d; 
        hour = h;
        min = mi;
        sec = s;
        year = y;
    }
    
    public String toString(){
        return "This account was created at "+week +" "+ month+" "+
        day+" " +hour+":"+min+":"+sec+" "+timeZone+" "+year;
    }
}
