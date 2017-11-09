import java.util.*;

/**
 * @author kamontat
 * @version 1.0
 * @since Thu 09/Nov/2017 - 20:09
 */
public class MatchView extends Observer {
    private GameBoard board;
    
    public MatchView(GameBoard board) {
        this.board = board;
        board.subscribe(this);
    }
    
    public void update() {
        System.out.println("(update) new state: " + board.getState());
    }
    
    @Override
    public void update(Observable o, Object arg) {
        update();
    }
}
