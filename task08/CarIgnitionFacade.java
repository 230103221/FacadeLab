package task08;
public class CarIgnitionFacade {
    private Battery battery;
    private FuelPump fuelPump;
    private StarterMotor starterMotor;
    private DashboardDisplay dashboard;

    public CarIgnitionFacade(Battery battery, FuelPump fuelPump, StarterMotor starterMotor, DashboardDisplay dashboard) {
        this.battery = battery;
        this.fuelPump = fuelPump;
        this.starterMotor = starterMotor;
        this.dashboard = dashboard;
    }

    public void startEngine() {
        System.out.println("--- Starting Car Engine ---");
        battery.checkVoltage();
        fuelPump.primeFuelLine();
        starterMotor.crankEngine();
        dashboard.illuminateGauges();
        System.out.println("Car is ready to drive!");
    }

    public void stopEngine() {
        System.out.println("--- Stopping Car Engine ---");
        fuelPump.stopPump();
        starterMotor.disengage();
        dashboard.turnOffGauges();
        battery.cutPower();
        System.out.println("Engine turned off safely.");
    }
}