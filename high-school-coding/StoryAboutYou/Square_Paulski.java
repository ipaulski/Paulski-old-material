
public class Square_Paulski
{
    private int size;
    public Square_Paulski(int n){
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

}
