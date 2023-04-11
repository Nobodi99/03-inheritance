package ohm.softa.a03;

public class DeathState extends State{

    public DeathState() {
        super(0);
        logger.info("I've got no food. I must go now. (╥_╥)");
    }

    @Override
    State successor(Cat cat) {
        return this;    
    }
    
}
