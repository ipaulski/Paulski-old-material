
public class ch7_Paulski
{
    public void num1(){
        int[][] arr = new int[4][7];
        for(int row = 0; row<4; row++){
            for(int col = 0; col<7; col++){
                arr[row][col] = (int)(Math.random()*99+1);
            }
        }
        int sum = 0;
        for(int coll = 0; coll<7; coll++){
            for(int roww = 0; roww<4; roww++){
                sum += arr[roww][coll];
            }
            System.out.println("Column "+coll+" = "+sum);
        }
    }

    public void num2(){
        int[][] arr = new int[7][];
        for(int row = 0; row<7; row++){
            int x = (int)(Math.random()*7+1);
            arr[row] = new int[x];
            for(int col = 0; col<x; col++){
                arr[row][col] = (int)(Math.random()*99+1);
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }

    public int[] num3(int[][] arr){
        int size = arr.length;
        int[] m = new int[size];
        int w = 0;
        for(int row = 0; row<size; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row].length == 1){
                    w = arr[row][col];
                }
                else{
                    if (arr[row][col] > w){
                        w = arr[row][col];
                    }
                }
                m[row] = w;
            }
        }
        return m;
    }
}
