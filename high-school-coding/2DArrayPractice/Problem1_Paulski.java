
public class Problem1_Paulski
{
    public int[][] random2D(int n){
        int a[][] = new int[3][3];
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[0].length; col++){
                a[row][col] = (int)((Math.random()*n)+1);
                System.out.print(a[row][col] + "\t");
            }
            System.out.println();
        }
        return a;
    }
}
