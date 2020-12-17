public class MovieList_Paulski
{
    public String[] arrMovie = {"Two of a Kind",
            "Friday the 13th Part III",
            "Xanadu",
            "When Harry meets Sally",
            "The Empire Strikes Back",
            "Longtime Companion",
            "God father",
            "Just the Way You Are",
            "Gotcha",
            "Grease 2",
            "The Pirate Movie",
            "Clue"};
    public int MovieList(){
        int p = arrMovie.length;
        return p;
    }

    public int Longest_Title(){
        int x = 0;
        for(int i = 0; i<arrMovie.length; i++){
            if(arrMovie[i].length() > x){
                x = arrMovie[i].length();
            }
        }
        return x;
    }

    public int Short_Title(){
        int x = 10000;
        for(int i = 0; i<arrMovie.length; i++){
            if(arrMovie[i].length() < x){
                x = arrMovie[i].length();
            }
        }
        return x;
    }

    public int MovieCount(int n){
        int m = 0;
        for(int i = 0; i<arrMovie.length; i++){
            if(arrMovie[i].length()==n){
                m++;
            }
        }
        return m;
    }

    public String[] MovieCList(String[] arrMovie, int k){
        int h = 0;
        String s1[] = new String [MovieCount(k)];
        for(int i = 0; i<arrMovie.length; i++){
            if(arrMovie[i].length()==k){
                s1[h] = arrMovie[i];
                h++;
            }
        }
        return s1;
    }

    public int MovieWordCount(int k){
        int s = 0;
        for(int i = 0; i<arrMovie.length; i++){
            String[] words = arrMovie[i].split(" ");
            if(words.length==k){
                s++;
            }
        }
        return s;
    }
}

