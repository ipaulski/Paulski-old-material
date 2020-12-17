import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        for(int m = 0; m < p; m++){
            Scanner input2 = new Scanner(System.in);
            String S = input2.nextLine();
            int N = S.length();
            for(int i = 0; i < N; i=i+2){
                System.out.print(S.substring(i,i+1));
            }
            System.out.print(" ");
            for(int i = 1; i < N; i=i+2){
                System.out.print(S.substring(i,i+1));
            }
        } 
        input.close();
    }
}
