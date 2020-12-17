
public class Problem5_Paulski
{
    public int[][] fromChar2Int(char[][] c){
        int b[][] = new int [3][3];
        for(int row = 0; row < b.length; row++){
            for(int col = 0; col < b[row].length; col++){
                b[row][col] = c[row][col];
            }
        }
        return b;
    }
}
