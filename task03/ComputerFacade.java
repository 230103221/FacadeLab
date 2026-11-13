package task03;

public class ComputerFacade {
    private PowerSupply powerSupply;
    private BIOS bios;
    private HardDrive hardDrive;
    private OperatingSystem os;

    public ComputerFacade(PowerSupply powerSupply, BIOS bios, HardDrive hardDrive, OperatingSystem os) {
        this.powerSupply = powerSupply;
        this.bios = bios;
        this.hardDrive = hardDrive;
        this.os = os;
    }


    public void startComputer() {
        System.out.println("--- Starting Computer ---");
        powerSupply.supplyPower();
        bios.runPostDiagnostics();
        hardDrive.spinUp();
        hardDrive.readBootSector();
        os.loadKernel();
        System.out.println("Computer is ready to use!");
    }

    public void shutDownComputer() {
        System.out.println("--- Shutting Down Computer ---");
        os.shutDownOs();
        hardDrive.stopDisk();
        bios.shutDown();
        powerSupply.cutPower();
        System.out.println("Computer is turned off.");
    }
}