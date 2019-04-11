package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    private int t = 0;
    private final int duration;
    static final Logger logger = LogManager.getLogger();

    final State tick(Cat cat)
    {
        if(duration < 0)
        {
            return this;
        }

        t = t + 1;
        if(t < duration){
            return this;
        }
        else{
            return successor(cat);
        }
    }

    public abstract State successor(Cat cat);

    public int getTime()
    {
        return t;
    }

    public int getDuration()
    {
        return duration;
    }

    public State(int duration){
        this.duration = duration;
    }
}

