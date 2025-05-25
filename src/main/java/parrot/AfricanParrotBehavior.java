package parrot;

public class AfricanParrotBehavior implements ParrotTypeBehavior {

    private static final double AFRICAN_PARROT_LOAD_FACTOR = 9.0;

    @Override
    public double calculateSpeed(ParrotCreationProperties properties) {
        double speedReductionDueToCoconuts = AFRICAN_PARROT_LOAD_FACTOR * properties.numberOfCoconuts();
        return Math.max(0, ParrotTypeBehavior.BASE_SPEED - speedReductionDueToCoconuts);
    }

    @Override
    public String getCry(ParrotCreationProperties properties) {
        return "Sqaark!";
    }
}
