package parrot;

public record ParrotCreationProperties(
        ParrotTypeEnum type,
        int numberOfCoconuts,
        double voltage,
        boolean isNailed
) {

}
