package task04;

public class SmartRoomFacade {
    private CeilingLight light;
    private Thermostat thermostat;
    private WindowBlinds blinds;
    private DoorLock doorLock;

    public SmartRoomFacade(CeilingLight light, Thermostat thermostat, WindowBlinds blinds, DoorLock doorLock) {
        this.light = light;
        this.thermostat = thermostat;
        this.blinds = blinds;
        this.doorLock = doorLock;
    }

    public void activateNightMode() {
        System.out.println("--- Activating Night Mode ---");
        light.turnOff();
        blinds.close();
        doorLock.lock();
        thermostat.setTemperature(19);
        System.out.println("Room is ready for sleep. Good night!");
    }

    public void activateMorningMode() {
        System.out.println("--- Activating Morning Mode ---");
        blinds.open();
        light.turnOn();
        thermostat.setTemperature(22);
        System.out.println("Good morning! Room is warmed up and bright.");
    }
}