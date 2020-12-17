
public class FR_Programming_Paulski
{
    private int[] myCode;
    private int size;
    public FR_Programming_Paulski(int[] a, int n){
        myCode = a;
        size = n;
    }
    
    public int[] getCode(int[] a){
        myCode = a;
        for(int i = 0; i < size; i++){
            myCode[i] += (2*i)+1;
        }
        return myCode;
    }
    
    public String getWord(int[] a){
        String word = "";
        for(int z: a){
            char c = (char)z;
            word += c;
        }
        return word;
    }
}
