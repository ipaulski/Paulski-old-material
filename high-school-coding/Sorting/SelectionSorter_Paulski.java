import java.util.*;
public class SelectionSorter_Paulski
{
    private int[] a;
    public SelectionSorter_Paulski(int[] anArray){
        a = anArray;
    }

    private int minimumPosition(int from){
        int minPos = from;
        for(int i=from+1; i<a.length; i++)
            if(a[i]<a[minPos])minPos=i;
        return minPos;
    }

    private void swap(int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void sort(){
        for(int i=0; i<a.length; i++){
            int minPos = minimumPosition(i);
            swap(minPos, i);
        }
    }

    public static void main(String args[]){
        //ex
        int[] a = {20,2,0,13,45,22,8,1,3,12,0};
        System.out.println(Arrays.toString(a));
        SelectionSorter_Paulski sorter = new SelectionSorter_Paulski(a);
        SelectionSortA so = new SelectionSortA(11,a);
        sorter.sort();
        System.out.println(Arrays.toString(a));
        int[] af = so.sort();
        System.out.println(Arrays.toString(af));
        //no1
        int[] b = {1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(Arrays.toString(b));
        SelectionSorter_Paulski s = new SelectionSorter_Paulski(b);
        SelectionSortA sos = new SelectionSortA(11,b);
        s.sort();
        System.out.println(Arrays.toString(b));
        int[] aff = sos.sort();
        System.out.println(Arrays.toString(aff));
        //no2
        int[] c = {1,2,3,5,6,7,8,9,10,11};
        System.out.println(Arrays.toString(c));
        SelectionSorter_Paulski ss = new SelectionSorter_Paulski(c);
        SelectionSortA soss = new SelectionSortA(10,c);
        ss.sort();
        System.out.println(Arrays.toString(c));
        int[] afff = soss.sort();
        System.out.println(Arrays.toString(afff));
        //no3
        int[] d = {20,14,12,10,8,7,6,5,2,1};
        System.out.println(Arrays.toString(d));
        SelectionSorter_Paulski sss = new SelectionSorter_Paulski(d);
        SelectionSortA sosss = new SelectionSortA(10,d);
        sss.sort();
        System.out.println(Arrays.toString(d));
        int[] affff = sosss.sort();
        System.out.println(Arrays.toString(affff));
    }
}
