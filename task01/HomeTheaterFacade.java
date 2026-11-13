package task01;

public class HomeTheaterFacade {
    private Amplifier amp;
    private Projector projector;
    private StreamingPlayer player;
    private TheaterLights lights;

    public HomeTheaterFacade(Amplifier amp, Projector projector, StreamingPlayer player, TheaterLights lights) {
        this.amp = amp;
        this.projector = projector;
        this.player = player;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("=== Preparing Home Theater ===");
        lights.dim(15);
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setSurroundSound();
        amp.setVolume(65);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("=== Shutting Down Home Theater ===");
        player.stop();
        player.off();
        amp.off();
        projector.off();
        lights.on();
    }
}