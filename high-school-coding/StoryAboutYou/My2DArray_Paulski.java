
public class My2DArray_Paulski
{
    public void print2(){//int[][] a){
        int a[][] = new int[][]{{22,23},{24,25},{26,27}};
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[0].length; col++){
                System.out.print(a[row][col] + "\t");
            }
            System.out.println();
        }
    }

    public void print(){
        int a[][] = {{5,-16,9,21},{22,19,-101,36},{18,17,64,-2}};
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[0].length; col++){
                System.out.print(a[row][col] + "\t");
            }
            System.out.println();
        }
    }
    
    public void printNegative(){
        int a[][] = {{5,-16,9,21},{22,19,-101,36},{18,17,64,-2}};
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[0].length; col++){
                if(a[row][col]<0)
                System.out.print(a[row][col] + "\t");
            }
        }
    }
}
