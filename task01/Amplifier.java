package task01;
public class Amplifier {
    public void on() {
        System.out.println("[Amplifier] Powering on.");
    }
    public void setSurroundSound() {
        System.out.println("[Amplifier] Surround sound mode enabled.");
    }
    public void setVolume(int level) {
        System.out.println("[Amplifier] Volume set to " + level + ".");
    }
    public void off() {
        System.out.println("[Amplifier] Powering off.");
    }
}