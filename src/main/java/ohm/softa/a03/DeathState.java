package ohm.softa.a03;

public class DeathState extends State
{

    public DeathState() {
        super(-1);
    }

    public State successor(Cat cat)
    {
        return this;
    }
}
