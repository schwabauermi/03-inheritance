package ohm.softa.a03;

public class SleepingState extends State
{

    public SleepingState(int duration){
        super(duration);
    }

    public State successor(Cat cat)
    {
        logger.info("Cat is sleeping");
        return new HungryState(cat.getAwake());
    }
}
