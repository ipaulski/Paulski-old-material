
public class Test2D_Paulski
{
    public int a[][] = new int[3][3];
    public int b[] = new int[9];
    public Test2D_Paulski(){

    }

    public int[][] genCode(){
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[0].length; col++){
                a[row][col] = (int)(Math.random()*2);
                System.out.print(a[row][col] + "\t");
            }
            System.out.println();
        }
        return a;
    }

    public int[] getSequence(){
        int count = 0;
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[row].length; col++){
                b[count] = a[row][col];
                System.out.print(b[count] + "\t");
                count++;
            }
            System.out.println();
        }
        return b;
    }

    public int getNumber(int[] a){
        int m =0, d =0;
        for(int k = 0; k < a.length; k++){
            m = (a[k]*2^k);
            d = m+=m;
        }
        return d;
    }
}

