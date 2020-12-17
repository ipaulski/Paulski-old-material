import java.util.Scanner;

/**
This program runs a TicTacToe game. It prompts the
user to set positions on the board and prints out the
result. Your job is to complete the game with 2 goals
(1) correct the logic for two players
(2) check the winner, display the result and stop the game
 */
public class TicTacToeRunner_Paulski{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String player = "x";
        TicTacToe_Paulski game = new TicTacToe_Paulski();
        boolean done = false;
        //make sure to set done to true when the game is completed
        int counter = 0;

        while (!done){
            System.out.print(game.toString()); 
            if(counter%2==0||counter==0){
                player = "x";
            }
            else
                player = "o";
            System.out.print(
                "Row for " + player + " (-1 to exit): ");
            int row = in.nextInt();
            while(row > 2){
                System.out.println("Please type in a number 0, 1, or 2");
                System.out.print(
                    "Row for " + player + " (-1 to exit): ");
                row = in.nextInt();
            }
            if (row < 0) done = true;
            else
            {
                System.out.print("Column for " + player + ": ");
                int column = in.nextInt();
                while(column > 2){
                    System.out.println("Please type in a number 0, 1, or 2");
                    System.out.print("Column for " + player + ": ");
                    column = in.nextInt();
                }
                while(game.checkPos(row,column)==false){
                    System.out.println("Wrong move, do it again");
                    System.out.print(game.toString());
                    System.out.print(
                        "Row for " + player + " (-1 to exit): ");
                    row = in.nextInt();
                    if (row < 0) done = true;
                    else
                    {
                        System.out.print("Column for " + player + ": ");
                        column = in.nextInt();
                    }
                }
                game.set(row,column,player);
            }
            game.checkWinning();
            counter++;
        }
    }
}