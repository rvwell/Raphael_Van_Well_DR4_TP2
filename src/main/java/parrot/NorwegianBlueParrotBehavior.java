package parrot;

public class NorwegianBlueParrotBehavior implements ParrotTypeBehavior{

    private static final double NORWEGIAN_BLUE_MAX_SPEED_CAP = 24.0;

    @Override
    public double calculateSpeed(ParrotCreationProperties properties) {
        if (properties.isNailed()) {
            return 0.0;
        }
        return Math.min(NORWEGIAN_BLUE_MAX_SPEED_CAP, properties.voltage() * ParrotTypeBehavior.BASE_SPEED);
    }

    @Override
    public String getCry(ParrotCreationProperties properties) {
        return properties.voltage() > 0 ? "Bzzzzzz" : "...";
    }
}
