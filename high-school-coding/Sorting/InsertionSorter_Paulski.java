import java.util.*; 
public class InsertionSorter_Paulski
{
    private int[] a = {20,2,0,13,45,22,8,1,3,12,0};

    public InsertionSorter_Paulski(int[] arr){
        a=arr;
    }

    public void sort(){
        int count = 0;
        for(int i=1; i<a.length; i++){
            int next = a[i];
            //move all larger elements up
            int j = i;
            while(j>0 && a[j-1] > next){
                a[j] = a[j-1];
                j--;
            }
            //insert element
            a[j] = next;
            count++;
        }
        System.out.println(count);
    }
    
    public void sort_descend(){
        int count = 0;
        for(int i=1; i<a.length; i++){
            int next = a[i];
            //move all larger elements up
            int j = i;
            while(j>0 && a[j-1] < next){
                a[j] = a[j-1];
                j--;
            }
            //insert element
            a[j] = next;
            count++;
        }
        System.out.println(count);
    }

    public int[] getArray(){
        return a;
    }

    public static void main(String args[]){
        int[] a = {20,2,0,13,45,22,8,1,3,12,0};
        System.out.println(Arrays.toString(a));
        InsertionSorter_Paulski is = new InsertionSorter_Paulski(a);
        is.sort();
        int[] ai = is.getArray();
        System.out.println(Arrays.toString(ai));
        //examples
        int[] no1 = {1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(Arrays.toString(no1));
        InsertionSorter_Paulski a1 = new InsertionSorter_Paulski(no1);
        a1.sort();
        int[] b1 = a1.getArray();
        System.out.println(Arrays.toString(b1));
        int[] no2 = {1,2,3,5,6,7,8,9,10,11};
        System.out.println(Arrays.toString(no2));
        InsertionSorter_Paulski a2 = new InsertionSorter_Paulski(no2);
        a2.sort();
        int[] b2 = a2.getArray();
        System.out.println(Arrays.toString(b2));
        int[] no3 = {20,14,12,10,8,7,6,5,2,1};
        System.out.println(Arrays.toString(no3));
        InsertionSorter_Paulski a3 = new InsertionSorter_Paulski(no3);
        a3.sort();
        int[] b3 = a3.getArray();
        System.out.println(Arrays.toString(b3));
        //sort descend
        int[] a4 = {20,2,0,13,45,22,8,1,3,12,0};
        System.out.println(Arrays.toString(a4));
        InsertionSorter_Paulski mm = new InsertionSorter_Paulski(a4);
        mm.sort_descend();
        int[] a5 = mm.getArray();
        System.out.println(Arrays.toString(a5));
    }
}
