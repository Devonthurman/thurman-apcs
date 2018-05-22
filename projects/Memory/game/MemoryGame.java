package game;

public class MemoryGame {
    public static int unknown;
    public static int wordamount;
    public static int allowedfails;
    public MemoryGame(int unknown, int wordamount, int allowedfails){
        this.unknown=unknown;
        this.wordamount=wordamount;
        this.allowedfails=allowedfails;
        System.out.println(unknown+wordamount+allowedfails);   
    }    
}