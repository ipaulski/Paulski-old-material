//Izabella Paulski
public class MyInteger
{
    private int value;
    
    public MyInteger(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public boolean isEven(){
        boolean val = false;
        if(value%2 == 0){
            val = true;
        }
        return val;
    }

    public boolean isOdd(){
        boolean val = false;
        if(value%2 != 0){
            val = true;
        }
        return val;
    }

    public boolean isPrime(){
        boolean val = false;
        if(value%2 != 0 && value%3 != 0 && value%5 != 0 && value%7 != 0){
            val = true;
        }
        return val;
    }

    public static boolean isEven(int val){
        boolean num = false;
        if(val%2 == 0){
            num = true;
        }
        return num;
    }

    public static boolean isOdd(int val){
        boolean num = false;
        if(val%2 != 0){
            num = true;
        }
        return num;
    }

    public static boolean isPrime(int val){
        boolean num = false;
        if(val%2 != 0 && val%3 != 0 && val%5 != 0 && val%7 != 0){
            num = true;
        }
        return num;
    }

    public static boolean isEven(MyInteger obj){
        boolean num = false;
        if(obj.isEven()){
            num = true;
        }
        return num;
    }

    public static boolean isOdd(MyInteger obj){
        boolean num = false;
        if(obj.isOdd()){
            num = true;
        }
        return num;
    }

    public static boolean isPrime(MyInteger obj){
        boolean num = false;
        if(obj.isPrime()){
            num = true;
        }
        return num;
    }

    public boolean equals(int val){
        boolean num = false;
        if(value == val){
            num = true;
        }
        return num;
    }

    public boolean equals(MyInteger obj){
        boolean num = false;
        if(obj.equals(value)){
            num = true;
        }
        return num;
    }

    public static Integer parseInt(char[] arr){
        String val = "";
        try{
            for(int i = 0; i < arr.length; i++){
                val += arr[i];
            }
            return Integer.parseInt(val);
        }
        catch(Exception e){
            System.out.println("error: non integer found, returning null");
            return null;
        }
    }

    public static Integer parseInt(String s){
        try{
            return Integer.parseInt(s);
        }
        catch (Exception e){
            System.out.println("error: non-integer found, returning null");
            return null;
        }
    }
}
