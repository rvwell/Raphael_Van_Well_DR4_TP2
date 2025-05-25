package parrot;

public class Parrot {

    private final ParrotTypeEnum type;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    private static final double BASE_SPEED = 12.0;
    private static final double AFRICAN_PARROT_LOAD_FACTOR = 9.0;
    private static final double NORWEGIAN_BLUE_MAX_SPEED_CAP = 24.0;

    public Parrot(ParrotCreationProperties properties) {
        if (properties == null) {
            throw new IllegalArgumentException("As propriedades do papagaio não podem ser nulas.");
        }
        this.type = properties.type();
        this.numberOfCoconuts = properties.numberOfCoconuts();
        this.voltage = properties.voltage();
        this.isNailed = properties.isNailed();
    }

    public double getSpeed() {
        return switch (type) {
            case EUROPEAN -> getEuropeanParrotSpeed();
            case AFRICAN -> getAfricanParrotSpeed();
            case NORWEGIAN_BLUE -> getNorwegianBlueParrotSpeed();
        };
    }

    private double getEuropeanParrotSpeed() {
        return BASE_SPEED;
    }

    private double getAfricanParrotSpeed() {
        double speedReductionDueToCoconuts = AFRICAN_PARROT_LOAD_FACTOR * numberOfCoconuts;
        return Math.max(0, BASE_SPEED - speedReductionDueToCoconuts);
    }

    private double getNorwegianBlueParrotSpeed() {
        if (isNailed) {
            return 0;
        }
        return Math.min(NORWEGIAN_BLUE_MAX_SPEED_CAP, voltage * BASE_SPEED);
    }

    public String getCry() {
        return switch (type) {
            case EUROPEAN -> "Sqoork!";
            case AFRICAN -> "Sqaark!";
            case NORWEGIAN_BLUE -> voltage > 0 ? "Bzzzzzz" : "...";
        };
    }
}
