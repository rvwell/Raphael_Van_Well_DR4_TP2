package parrot;

public class EuropeanParrotBehavior implements ParrotTypeBehavior{
    @Override
    public double calculateSpeed(ParrotCreationProperties properties) {
        return ParrotTypeBehavior.BASE_SPEED;
    }

    @Override
    public String getCry(ParrotCreationProperties properties) {
        return "Sqoork!";
    }
}
