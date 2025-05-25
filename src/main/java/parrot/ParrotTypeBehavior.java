package parrot;

public interface ParrotTypeBehavior {
    double BASE_SPEED = 12.0;
    double calculateSpeed(ParrotCreationProperties properties);
    String getCry(ParrotCreationProperties properties);
}
