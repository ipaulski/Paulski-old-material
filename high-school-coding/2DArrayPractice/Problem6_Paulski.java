
public class Problem6_Paulski
{
    public String[][] fromCl2String(char[][] c){
        String b[][] = new String [3][3];
        for(int row = 0; row < b.length; row++){
            for(int col = 0; col < b[row].length; col++){
                b[row][col] = c[row][col] + " " + ((int)(c[row][col]));
            }
        }
        return b;
    }
}
