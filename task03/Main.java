package task03;

public class Main {
    public static void main(String[] args) {

        PowerSupply psu = new PowerSupply();
        BIOS bios = new BIOS();
        HardDrive hdd = new HardDrive();
        OperatingSystem os = new OperatingSystem();


        ComputerFacade computer = new ComputerFacade(psu, bios, hdd, os);


        computer.startComputer();
        System.out.println();
        computer.shutDownComputer();
    }
}