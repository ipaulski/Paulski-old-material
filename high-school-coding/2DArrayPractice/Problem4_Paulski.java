
public class Problem4_Paulski
{
    public int[][] twoToThree(int[][] a){
        int b[] = new int [6], c[][] = new int[3][2], count = 0;
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[row].length; col++){
                b[count] = a[row][col];
                count++;
            }
        }
        count = 0;
        for(int row = 0; row < c.length; row++){
            for(int col = 0; col < c[row].length; col++){
                c[row][col] = a[row][col];
                count++;
            }
        }
        return c;
    }
}
