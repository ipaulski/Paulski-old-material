
public class Tester_Bubble
{
    //private int theArray[] = {4,2,5,1,3,18,0,9,6};
    //private int theArray[] = {0,1,2,3,4,5,6,9,18};
    private int theArray[] = {18, 9, 6, 5, 4, 3, 2, 1, 0 };
    public Tester_Bubble(){}

    public void sort_ascend(int a[]){
        int[] theArray=a;
        int count =0;
        for(int x=0; x < theArray.length-1; x++){
            for(int y = 0; y < theArray.length-x-1; y++){
                if(theArray[y] > theArray[y+1]){
                    int t = theArray[y];
                    theArray[y] = theArray[y+1];
                    theArray[y+1] = t;
                }
                count++;
            }
        }
        System.out.println(count);
    }

    public void sort_descend(int a[]){
        int[] theArray=a;
        int count =0;
        for(int x=0; x < theArray.length-1; x++){
            for(int y = 0; y < theArray.length-x-1; y++){
                if(theArray[y] < theArray[y+1]){
                    int t = theArray[y];
                    theArray[y] = theArray[y+1];
                    theArray[y+1] = t;
                }
                count++;
            }
        }
        System.out.println(count);
    }

    public int[] getArray(){
        return theArray;
    }

    public static void main(String args[]){
        Tester_Bubble b = new Tester_Bubble();
        b.sort_ascend(b.theArray);
        Tester_Bubble f = new Tester_Bubble();
        b.sort_descend(f.theArray);
        for(int j= 0; j < b.getArray().length; j++){
            System.out.print(b.getArray()[j]+" ");
        }
        System.out.println(" ");
        for(int j= 0; j < f.getArray().length; j++){
            System.out.print(f.getArray()[j]+" ");
        }
        System.out.println(" ");
    }
}
