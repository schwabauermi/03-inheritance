package ohm.softa.a03;

public class HungryState extends State
{
    public HungryState(int duration){
        super(duration);
    }

    public State successor(Cat cat)
    {
        logger.info("Cat has starved too long");
        return new DeathState();
    }

    public State feed(Cat cat){
        logger.info("You fed the cat!");
        return new DigestingState(cat.getDigest(), getTime());
    }
}
