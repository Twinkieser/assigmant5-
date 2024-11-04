package EighthTask;

import javax.naming.Context;

public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }


    public String toString() {
        return "Stop State";
    }
}

