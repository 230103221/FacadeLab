package task08;

public class Main {
    public static void main(String[] args) {
        Battery battery = new Battery();
        FuelPump fuelPump = new FuelPump();
        StarterMotor starter = new StarterMotor();
        DashboardDisplay dashboard = new DashboardDisplay();

        CarIgnitionFacade car = new CarIgnitionFacade(battery, fuelPump, starter, dashboard);

        car.startEngine();
        System.out.println("\n... Driving to the university ...\n");
        car.stopEngine();
    }
}