
public class TicTacToe_Paulski
{
    //instance field for theh game
    private String[][] board;
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;
    /**
    Constructs an empty board that looks like this
    |    |
    |    |
    |    |
     */
    public TicTacToe_Paulski(){
        board = new String[ROWS][COLUMNS];

        // fill with spaces : empty board
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS; j++)
                board[i][j] = " ";
    }

    /**
    Sets a field in the board. The field must be unoccupied.
    @param i the row index 
    @param j the column index 
    @param player the player ("x" or "o")
     */
    public void set(int i, int j, String player) {
        if (board[i][j].equals(" "))
            board[i][j] = player;
    }

    /**
    Creates a string representation of the board such as
    |x  o|
    |  x |
    |   o|
    @return the string representation
     */
    public String toString()
    {
        String r = "";
        for (int i = 0; i < ROWS; i++)
        {
            r = r + "|";
            for (int j = 0; j < COLUMNS; j++)         
                r = r + board[i][j];
            r = r + "|\n";
        }
        return r;
    }
    //check if the board position is taken
    public boolean checkPos(int r, int c){
        return (board[r][c].equals(" "));
    }

    /**
    Gets the winner
    @return the winner
     */
    public boolean getWinner()
    {  

        return false;
    }   

    public String checkWinning(){
        String s = "";
        if((checkPos(0,0)&&checkPos(0,1)&&checkPos(0,2)||
            checkPos(1,0)&&checkPos(1,1)&&checkPos(1,2)||
            checkPos(2,0)&&checkPos(2,1)&&checkPos(2,2)||
            checkPos(0,0)&&checkPos(1,0)&&checkPos(2,0)||
            checkPos(0,1)&&checkPos(1,1)&&checkPos(2,1)||
            checkPos(0,2)&&checkPos(1,2)&&checkPos(2,2)||
            checkPos(0,0)&&checkPos(1,1)&&checkPos(2,2)||
            checkPos(2,0)&&checkPos(1,1)&&checkPos(0,2))==true){
            s = "Winner!";
        }
        
        return s;
    }
}