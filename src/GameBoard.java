/**
 * @author kamontat
 * @version 1.0
 * @since Thu 09/Nov/2017 - 20:08
 */
public class GameBoard extends Subject {
    private int state;
    
    public GameBoard() {
        state = 0;
    }
    
    public GameBoard(int state) {
        this.state = state;
    }
    
    public int getState() {
        return state;
    }
    
    public void playMove() {
        System.out.printf("(move) state %d -> %d\n", state, ++state);
        setChanged();
        notifyObservers(getState()); // notify
    }
}
