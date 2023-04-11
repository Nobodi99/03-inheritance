package ohm.softa.a03;

public class HungryState extends State {

    public HungryState(int duration) {
        super(duration);
        logger.info("Yawn...I want food. (=^‥^=)");
    }

    @Override
    State successor(Cat cat) {
        return new DeathState();
    }

    State feed(Cat cat){
        logger.info("You offered food to the cat.");
        return new DigestingState(cat.getDigest() - GetTime());
    }
    
}
