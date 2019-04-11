package ohm.softa.a03;

public class DigestingState extends State
{
    private int hungry;
    DigestingState(int duration, int hungry){
        super(duration);
        this.hungry = hungry;
    }

    public State successor(Cat cat)
    {
        logger.info("Cat has digested completely");
        return new PlayfulState(cat.getAwake() - hungry - getTime());
    }
}
