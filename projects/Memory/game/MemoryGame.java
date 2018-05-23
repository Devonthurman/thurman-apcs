package game;

public class MemoryGame {
    public static int boardsize;
    public static int wordamount;
    public static int allowedfails;
    public String[][] board;
    public MemoryGame(int boardsize, int wordamount, int allowedfails){
        this.boardsize=boardsize;
        this.wordamount=wordamount;
        this.allowedfails=allowedfails;
        board=new String[boardsize][boardsize];
        MemoryPiece popboard= new MemoryPiece();
    }    
}