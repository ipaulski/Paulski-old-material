
public class HashNote
{
    private String note;
    private int note_length;
    public HashNote(){}

    public HashNote(String s, int i){
        note = s;
        note_length = i;
    }

    public void playNote(){
        for(int i = 0; i<note_length; i++){
            System.out.print("#");
        }
    }

    public void playRandom(int c){
        for(int i = 0; i < c; i++){
            note_length = (int)(Math.random()*9) + 1;
            playNote();
            System.out.println();
        }
    }

    public static void main(String args[]){
        HashNote h = new HashNote();
        h.playNote();
        HashNote h1 = new HashNote("G", 3);
        h1.playRandom(6);
    }
}
