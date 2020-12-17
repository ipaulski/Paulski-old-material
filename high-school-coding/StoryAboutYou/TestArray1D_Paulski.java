
public class TestArray1D_Paulski
{
    public int[] intArray;
    public String strArray[];
    public TestArray1D_Paulski(){
        intArray = new int[100];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = (int)((Math.random()*100)+1);
        }
        strArray = new String[4];
    }

    public int[] getEven(){
        int count = 0;
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i]%2==0){
                count++;
            }
        }
        int newIntArray[] = new int[count];
        for(int k = 0; k < count; k++){
            if(intArray[k]%2==0){
                newIntArray[k] = intArray[k];
            }
        }
        return newIntArray;
    }

    public void getWord(){
        String r = "I have a dream";
        for(int i = 0; i <strArray.length; i++){
            strArray[i] = 7;
            if(r.charAt(" ")){
                
            }
        }
    }

    //public void replaceWord(){

    //}
    
    //public int getCountPrime(){
        
    //}

    //public int[] getASCIIString(String s){

    //}

    //public String byteShift(String s, int shift){

    //}

    //public String oddOrEven(String[] s){

    //}

    //public String[] Int2String(int[]a){

    //}
}
