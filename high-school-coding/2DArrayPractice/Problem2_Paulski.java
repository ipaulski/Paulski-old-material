
public class Problem2_Paulski
{
    public int[][] oneToTwo(int[] a){
        int b[][] = new int [2][3], count = 0;
        for(int row = 0; row < b.length; row++){
            for(int col = 0; col < b[row].length; col++){
                b[row][col] = a[count];
                count++;
            }
        }
        return b;
    }
}
