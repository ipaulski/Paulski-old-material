public class ProjectSentence_Paulski
{
    private String sentence;
    public ProjectSentence_Paulski(String s){
        sentence = s;
    }

    public String reverse(){
        if(sentence.length()==0)return"";
        else{
            ProjectSentence_Paulski m = new ProjectSentence_Paulski(sentence.substring(0,sentence.length()-1));
            return(sentence.substring(sentence.length()-1,sentence.length())+m.reverse());
        }
    }

    public String noX(){
        String z = "";
        if(sentence.length()==0)return"";
        else if(sentence.substring(0,1).equals("X")!=true){
            z = sentence.substring(0,1);
        }
        ProjectSentence_Paulski m = new ProjectSentence_Paulski(sentence.substring(1));
        return(z+m.noX());
    }

    public String endX(){
        String x = "";
        String y = "";
        if(sentence.length()==0) {
            return "";
        }
        if(sentence.indexOf("X") == 0) { 
            x = "X";
        } else { 
            y = sentence.substring(0,1);
        }
        ProjectSentence_Paulski m = new ProjectSentence_Paulski(sentence.substring(1)); 
        return y + m.endX() + x;
    }

    public String zipper(String s1, String s2){
        if(s1.length() == 0 || s2.length() == 0)return "";
        return(s1.substring(0,1) + s2.substring(0,1) + zipper(s1.substring(1), s2.substring(1)));
    }

    public static void main(String[] args)
    {
        ProjectSentence_Paulski a = new ProjectSentence_Paulski("Hello");
        System.out.println(a.reverse());
        ProjectSentence_Paulski b = new ProjectSentence_Paulski("FXffyX");
        System.out.println(b.noX());
        ProjectSentence_Paulski c = new ProjectSentence_Paulski("FXffyX");
        System.out.println(c.endX());
        System.out.println(a.zipper("ABCD","1234"));
    }
}