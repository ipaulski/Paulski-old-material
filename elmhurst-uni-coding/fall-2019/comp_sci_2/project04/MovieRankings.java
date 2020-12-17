package main.java.hashing;
//Izabella Paulski

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieRankings {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Map<String, Integer> movieTitleMap = new HashMap<String, Integer>();
        Map<Integer, String> movieRankingMap = new HashMap<Integer, String>();

        readMovieInfoIntoMaps(movieTitleMap, movieRankingMap);

        displayTopTenMovies(movieRankingMap);

        movieLookUp(movieTitleMap, movieRankingMap);

        System.out.println("Exiting...");
        input.close();
    }

    static void readMovieInfoIntoMaps(Map<String, Integer> movieTitleMap,
                                      Map<Integer, String> movieRankingMap) {
        // ************ FINISH THIS ********************* //
        try {
            File file = new File(
                   MovieRankings.class.getClassLoader().getResource("listOfMovies.txt").getFile()
            );

            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                int num = sc.nextInt();
                String movie = sc.nextLine().trim();
                movieTitleMap.put(movie, num);
                movieRankingMap.put(num, movie);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }

    static void displayTopTenMovies(Map<Integer, String> movieRankingMap) {
        // ************ FINISH THIS ********************* //

        System.out.println("********* The TOP TEN Movies *********");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " " + movieRankingMap.get(i));
        }
    }

    static void movieLookUp(Map<String, Integer> movieTitleMap,
                            Map<Integer, String> movieRankingMap) {
        // ************ FINISH THIS ********************* //
        //	This method should get the Scanner and provide the
        //	option to select Rank or Title
        //
        //	Based on what is selected is should call one of the following methods
        //		which does the map lookup and display the information
        //
        //			findByRanking
        //			findByTitle
        //

        System.out.println("\nFind by Ranking (R) or Title (T): ");
        String command = input.next();

        if (command.toLowerCase().equals("r")) {
            findByRanking(movieRankingMap);
            movieLookUp(movieTitleMap, movieRankingMap);
        } else if (command.toLowerCase().equals("t")) {
            findByTitle(movieTitleMap);
            movieLookUp(movieTitleMap, movieRankingMap);
        }
    }

    static void findByRanking(Map<Integer, String> movieRankingMap) {
        // ************ FINISH THIS ********************* //
        System.out.println("Enter the ranking (1 through 90): ");
        int rank = input.nextInt();
        if (rank > 90 || rank < 1) {
            System.out.println("*** Ranking must be between 1 and 90 ***");
            findByRanking(movieRankingMap);
        }
        else System.out.println("The movie ranked #" + rank + " is \"" + movieRankingMap.get(rank) + "\"");
    }

    static void findByTitle(Map<String, Integer> movieTitleMap) {
        // ************ FINISH THIS ********************* //
        String movie = input.nextLine();
        System.out.println("Enter the movie title: ");
         movie = input.nextLine();
        if (movieTitleMap.containsKey(movie)) {
            System.out.println("The movie \"" + movie + "\" is ranked #" + movieTitleMap.get(movie));
        } else System.out.println("No movie exists with the title \"" + movie + "\"");
    }

}