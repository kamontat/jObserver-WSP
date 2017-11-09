public class Main {
    
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        MatchView view = new MatchView(board);
        
        board.playMove();
        System.out.println(board.getState());
    }
}
