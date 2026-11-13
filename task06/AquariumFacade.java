package task06;

public class AquariumFacade {
    private WaterFilter filter;
    private AquariumHeater heater;
    private AutoFeeder feeder;
    private LedHoodLight light;

    public AquariumFacade(WaterFilter filter, AquariumHeater heater, AutoFeeder feeder, LedHoodLight light) {
        this.filter = filter;
        this.heater = heater;
        this.feeder = feeder;
        this.light = light;
    }

    public void runMorningRoutine() {
        System.out.println("--- Starting Aquarium Morning Routine ---");
        light.setDaylightMode();
        filter.cycleFilter();
        heater.regulateTemperature(25);
        feeder.dispenseFood();
        System.out.println("Morning routine complete! Fish are fed and happy.");
    }


    public void prepareForNight() {
        System.out.println("--- Preparing Aquarium for Night ---");
        light.setMoonlightMode();
        heater.regulateTemperature(23);
        filter.cycleFilter();
        System.out.println("Aquarium is set for the night.");
    }
}