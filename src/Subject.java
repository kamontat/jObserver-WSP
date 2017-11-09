import java.util.*;

/**
 * @author kamontat
 * @version 1.0
 * @since Thu 09/Nov/2017 - 20:09
 */
public class Subject extends Observable {
    public void subscribe(Observer obs) {
        this.addObserver(obs);
    }
    
    public void unsubscribe(Observer obs) {
        this.deleteObserver(obs);
    }
}
