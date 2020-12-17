
public class LoopsReview_Paulski
{
    public void buildSequence2(int n){
        for(int p = 0; p < n; p++){
            int m = (int)((Math.random()*100)+1);
            if(m%2==0){
                System.out.print("1");
            }
            else
                System.out.print("-1");
            System.out.print(", ");
        }
    }

    public void buildSequence3(int n){
        int count = 1;
        for(int m = 0; m<n; m++){
            System.out.print(count += m);
            System.out.print(" ");
        }
    }

    public String findNumber(String s){
        String a = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)>=(char)48 && s.charAt(i)<=(char)57){
                a += s.charAt(i);
            }
        }
        return a;
    }

    public int addNumber(String s){
        int a = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)>=(char)48 && s.charAt(i)<=(char)57){
                a += Integer.parseInt(s.substring(i,i+1));
            }
        }
        return a;
    }

    public int findThisLetter(String s, String c){
        int count = 0;
        char d = c.charAt(0);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)==d){
                count++;
            }
        }
        return count;
    }

    public void buildSequence4(String s){
        int st = 0;
        for(int i= 0; i < s.length(); i++){
            st = s.charAt(i);
            System.out.print(st +" ");
        }
    }

    public String buildWord(int[] a){
        int[] c = {101, 72, 108, 108, 111};
        a = c;
        String b = "";
        for(int m = 0; m < a.length; m++){
            b += (char)a[m];
        }
        return b;
    }
}
