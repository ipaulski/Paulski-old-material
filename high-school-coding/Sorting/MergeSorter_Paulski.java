import java.util.*;
public class MergeSorter_Paulski
{
    private int[] a;
    /**
    Constructs a merge sorter.
    @param anArray the array to sort
     */
    public MergeSorter_Paulski(int[] anArray)
    {
        a = anArray;
    }

    /**
    Sorts the array managed by this merge sorter.
     */
    public void sort()
    {  
        if (a.length <= 1) return;
        int[] first = new int[a.length / 2];
        int[] second = new int[a.length - first.length];
        System.arraycopy(a, 0, first, 0, first.length);
        System.arraycopy(a, first.length, second, 0, second.length);
        MergeSorter_Paulski firstSorter = new MergeSorter_Paulski(first);
        MergeSorter_Paulski secondSorter = new MergeSorter_Paulski(second);
        firstSorter.sort();
        secondSorter.sort();
        sort_descend(first, second);
    }

    /**
    Merges two sorted arrays into the array managed by this
    merge sorter. 
    @param first the first sorted array
    @param second the second sorted array
     */
    private void merge(int[] first, int[] second)
    {  
        // Merge both halves into the temporary array

        int iFirst = 0;
        // Next element to consider in the first array
        int iSecond = 0;
        // Next element to consider in the second array
        int j = 0; 
        // Next open position in a

        // As long as neither iFirst nor iSecond past the end, move
        // the smaller element into a
        int count=0;
        while (iFirst < first.length && iSecond < second.length)
        {  
            if (first[iFirst] < second[iSecond])
            {  
                a[j] = first[iFirst];
                iFirst++;
            }
            else
            {  
                a[j] = second[iSecond];
                iSecond++;
            }
            j++;
            count++;
        }
        System.out.println(count);

        // Note that only one of the two calls to arraycopy below
        // copies entries

        // Copy any remaining entries of the first array
        System.arraycopy(first, iFirst, a, j, first.length - iFirst);

        // Copy any remaining entries of the second half
        System.arraycopy(second, iSecond, a, j, second.length - iSecond);
    }

    public int[] getArray(){
        return a;
    }

    public void sort_descend(int[] first, int[] second){
        int iFirst = 0;
        int iSecond = 0;
        int j = 0; 
        int count=0;
        while (iFirst < first.length && iSecond < second.length)
        {  
            if (first[iFirst] > second[iSecond])
            {  
                a[j] = first[iFirst];
                iFirst++;
            }
            else
            {  
                a[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        System.arraycopy(first, iFirst, a, j, first.length - iFirst);
        System.arraycopy(second, iSecond, a, j, second.length - iSecond);
    }

    public static void main (String args[]){
        int[] a = {20, 2, 0, 13, 45, 22, 8, 1, 3, 12, 0};
        System.out.println(Arrays.toString(a));
        MergeSorter_Paulski ms = new MergeSorter_Paulski(a);
        ms.sort();
        int[] mi = ms.getArray();
        System.out.println(Arrays.toString(mi));

        //         int[] no1 = {1,1,1,1,1,1,1,1,1,1,1};
        //         System.out.println(Arrays.toString(no1));
        //         MergeSorter a1 = new MergeSorter(no1);
        //         a1.sort();
        //         int[] b1 = a1.getArray();
        //         System.out.println(Arrays.toString(b1));
        //         int[] no2 = {1,2,3,5,6,7,8,9,10,11};
        //         System.out.println(Arrays.toString(no2));
        //         MergeSorter a2 = new MergeSorter(no2);
        //         a2.sort();
        //         int[] b2 = a2.getArray();
        //         System.out.println(Arrays.toString(b2));
        //         int[] no3 = {20,14,12,10,8,7,6,5,2,1};
        //         System.out.println(Arrays.toString(no3));
        //         MergeSorter a3 = new MergeSorter(no3);
        //         a3.sort();
        //         int[] b3 = a3.getArray();
        //         System.out.println(Arrays.toString(b3));
    }
}
