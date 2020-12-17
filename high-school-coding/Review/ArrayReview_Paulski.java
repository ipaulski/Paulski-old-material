
public class ArrayReview_Paulski
{
    public int[] getEven(int[] a){
        int count = 0;
        for(int x = 0; x<a.length; x++){
            if(a[x] % 2 == 0){
                count++;
            }
        }
        int[] b = new int[count];
        for(int x = 0; x<b.length; x++){
            if(a[x] % 2 == 0){
                b[x] = a[x];
            }
        }
        return b;
    }

    public int[] findZero(String d){
        int count = 0;
        for(int x = 0; x<d.length(); x++){
            if(d.charAt(x) == 0){
                count++;
            }
        }
        int[] b = new int[count];
        for(int x = 0; x<b.length; x++){
            if(d.charAt(x) == 0){
                b[x] = d.indexOf(x);
            }
        }
        return b;
    }

    public String[] findWordList(String[] s, String w){
        int count = 0;
        for(int x = 0; x<s.length; x++){
            if(s[x].equals(w)==true){
                count++;
            }
        }
        String[] b = new String[count];
        for(int x = 0; x<b.length; x++){
            if(s[x].equals(w)==true){
                b[x] = s[x];
            }
        }
        return b;
    }

    public int[][] multiTable(int n){
        int a[][] = new int[n][n];
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[0].length; col++){
                a[0][col] =1+col;
                a[1][col] = a[0][col]*2;
                a[2][col] = a[0][col]*3;
                System.out.print(a[row][col] + "\t");
            }
            System.out.println();
        }
        return a;
    }

    public int findFrequency(int[][]a, int k){
        int h = 0;
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[0].length; col++){
                if(a[row][col]==k){
                    h++;
                }
            }
        }
        return h;
    }

    //public static void main(String[] args){
    //    ArrayReview_Paulski som = new ArrayReview_Paulski();
    //    int[] arr = {6, 51, 77, 2, 12, 17};
    //    som.getEven(arr);
    //}
}
