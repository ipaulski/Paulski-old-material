
public class HsuGrade_Paulski
{
    private String[] scores;
    public HsuGrade_Paulski(String[] s){
        scores = s;
    }

    public int[] getScore(){
        int num = 0;
        int[] z = new int[scores.length];
        for(int row = 0; row < scores.length; row++){
            //z[row] = Integer.parseInt(scores[row]);
            
        }
        for(int t:z){
            
        }
        return z;
    }
    
    private int firstNum(){
        
    }
    
    private int secNum(){
        String s = firstNum().length;
    }
    
    public static void main(String args[]){
        String c[]= new String[]{"00","10","12","30"};
        HsuGrade_Paulski p = new HsuGrade_Paulski(c);
        p.getScore();
    }
}
