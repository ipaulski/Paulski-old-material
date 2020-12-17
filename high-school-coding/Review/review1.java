
public class review1
{
    public String[] fh;
    public String[] filterWord(String[] t, String s){
        int count = 0;
        String[] fh = new String[count];
        for(int i = 0; i < t.length; i++){
            if(t[i].equals(s)){
            }
            else{
                fh[i] = t[i];
                count++;
            }
        }
        
        for(int y = 0; y<fh.length; y++){
            System.out.print(fh[y] + " ");
        }
        return fh;
    }

    public static void main(String[] args){
        review1 som = new review1();
        String[] Bd = {"aa", "bb", "bb", "cc", "cc"};
        String p = "bb";
        som.filterWord(Bd, p);
    }
}
