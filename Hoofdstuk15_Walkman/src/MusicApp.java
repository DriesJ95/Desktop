public class MusicApp {
    public static void main(String[] args) {
        CDPlayer player = new CDPlayer();
        player.pause();
        player.reverse();
        player.play();
        player.eject();
        player.stop();

        TapeRecorder tapey = new TapeRecorder();
        tapey.record();
        tapey.play();
        tapey.eject();
    }
}
