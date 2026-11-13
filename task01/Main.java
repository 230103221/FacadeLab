package task01;

public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Projector projector = new Projector();
        StreamingPlayer player = new StreamingPlayer();
        TheaterLights lights = new TheaterLights();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, projector, player, lights);
        homeTheater.watchMovie("Intersteller");
        System.out.println();
        homeTheater.endMovie();

        System.out.println("\n==============================\n");

        homeTheater.watchMovie("Matrix");
        System.out.println();
        homeTheater.endMovie();
    }
}