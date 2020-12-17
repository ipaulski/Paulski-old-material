
public class Problem3_Paulski
{
    public int[][] oneToThree(int[] a){
        int b[][] = new int [3][2], count = 0;
        for(int row = 0; row < b.length; row++){
            for(int col = 0; col < b[row].length; col++){
                b[row][col] = a[count];
                count++;
            }
        }
        return b;
    }
}
