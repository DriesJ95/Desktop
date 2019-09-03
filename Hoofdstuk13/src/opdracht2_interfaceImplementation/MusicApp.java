package opdracht2_interfaceImplementation;

public class MusicApp {
    public static void main(String[] args) {
        CDPlayer player = new CDPlayer();
        player.Pause();
        player.Reverse();

        TapeRecorder tapey = new TapeRecorder();
        tapey.Record();
        tapey.Play();
    }
}
