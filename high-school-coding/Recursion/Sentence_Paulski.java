
public class Sentence_Paulski
{
    private String phrase;
    public Sentence_Paulski(String aPhrase){
        phrase = aPhrase;
    }

    public boolean find(String text){
        if(text.length()>phrase.length())
            return false;
        else if(phrase.substring(0, text.length()).equals(text)) {
            return true;
        }
        else {
            Sentence_Paulski m = new Sentence_Paulski(phrase.substring(1));
            return m.find(text);
        }
    }
}
