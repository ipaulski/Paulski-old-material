
public class Sentence
{
    private String sentence;
    public Sentence(String s){
        sentence = s;
    }

    public String reverse(){
        if(sentence.length()==0)return "";
        else{
            return (sentence.substring(sentence.length()-1,sentence.length())+reverse());
        }
    }

    public String noX(){
        if(sentence.length()==0)return "";
        else{
            return (sentence.charAt(sentence.length()-1).equals(char(88))+noX());
        }
    }

    public String endX(){
        if(sentence.length()==0)return "";
        else{
            return (sentence.charAt(sentence.length()-1).equals(char(88))+noX());
        }
    }

    public String zipper(String s1, String s2){
        if(s2.length()==0)return "";
    }
}
