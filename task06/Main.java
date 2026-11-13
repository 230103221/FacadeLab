package task06;

public class Main {
    public static void main(String[] args) {
        WaterFilter filter = new WaterFilter();
        AquariumHeater heater = new AquariumHeater();
        AutoFeeder feeder = new AutoFeeder();
        LedHoodLight light = new LedHoodLight();

        AquariumFacade aquarium = new AquariumFacade(filter, heater, feeder, light);

        aquarium.runMorningRoutine();
        System.out.println();
        aquarium.prepareForNight();
    }
}