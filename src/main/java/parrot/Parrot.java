package parrot;

public class Parrot {

    private final ParrotCreationProperties properties;
    private final ParrotTypeBehavior behavior;

    public Parrot(ParrotCreationProperties properties) {
        if (properties == null) {
            throw new IllegalArgumentException("As propriedades do papagaio não podem ser nulas.");
        }
        this.properties = properties;

        this.behavior = selectBehaviorForType(properties.type());
    }

    private ParrotTypeBehavior selectBehaviorForType(ParrotTypeEnum type) {
        return switch (type) {
            case EUROPEAN -> new EuropeanParrotBehavior();
            case AFRICAN -> new AfricanParrotBehavior();
            case NORWEGIAN_BLUE -> new NorwegianBlueParrotBehavior();
        };
    }

    public double getSpeed() {
        return behavior.calculateSpeed(this.properties);
    }

    public String getCry() {
        return behavior.getCry(this.properties);
    }
}
