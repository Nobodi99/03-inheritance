package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    protected static final Logger logger = LogManager.getLogger();
    protected int time;
    protected final int duration;

    public State(int duration) {
        // Set duration until a state change
        this.duration = duration;
    }

    State tick(Cat cat){
        // Increment time elapsed
        time++;
        
        // When a cycle finishes go to next state
        if (time >= duration){
            return successor(cat);
        }

        // Stay in state until cycle finishes
        return this;
    }

    abstract State successor(Cat cat);

    int GetTime(){
        return time;
    }

    int getDuration(){
        return duration;
    }
}