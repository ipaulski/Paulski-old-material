import java.io.*;
import java.util.*;
public class SFMO_Paulski
{
    private int size;
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter parameter");
        int size =  sk.nextInt();
        for(int k = 0; k < size; k++){
            for(int j = 0; j < size; j++){
                System.out.print("$");
            }
            System.out.println();
        }
        for(int k = 0; k <= size; k++){
            for(int j = 0; j < k; j++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
}