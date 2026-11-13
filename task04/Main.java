package task04;

public class Main {
    public static void main(String[] args) {
        CeilingLight light = new CeilingLight();
        Thermostat thermostat = new Thermostat();
        WindowBlinds blinds = new WindowBlinds();
        DoorLock doorLock = new DoorLock();

        SmartRoomFacade smartRoom = new SmartRoomFacade(light, thermostat, blinds, doorLock);

        smartRoom.activateNightMode();
        System.out.println();
        smartRoom.activateMorningMode();
    }
}