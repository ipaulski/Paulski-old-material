
public class SFSM_Paulski
{
    private int size;
    public SFSM_Paulski(int n){
        size = n;
    }
    
    public void printSquare(){
        for(int k = 0; k < size; k++){
            for(int j = 0; j < size; j++){
                System.out.print("$");
            }
            System.out.println();
        }
    }

    public void printTriangle(){
        for(int k = 0; k <= size; k++){
            for(int j = 0; j < k; j++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        Square_Paulski st = new Square_Paulski(4);
        st.printSquare();
        st.printTriangle();
    }
}