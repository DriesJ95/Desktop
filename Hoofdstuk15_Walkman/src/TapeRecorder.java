public class TapeRecorder implements Recorder{
    private boolean sound = false;
    private boolean recording = false;


    @Override
    public void record() {
        sound = false;
        recording = true;
        System.out.println("TapeRecorder is silent and recording");
    }

    @Override
    public void play() {
        sound = true;
        recording = false;
        System.out.println("TapeRecorder is playing and not recording");
    }

    @Override
    public void stop() {
        sound = false;
        recording = false;
        System.out.println("TapeRecorder is silent and not recording");
    }

    @Override
    public void pause() {
        sound = false;
        recording = false;
        System.out.println("TapeRecorder is paused");
    }

    @Override
    public void reverse() {
        sound = true;
        recording = false;
        System.out.println("TapeRecorder is producing satanic mumbojumbo");
    }

    @Override
    public void eject(){
        sound = false;
        System.out.println("Tape ejected from Tape-player");
    }
}
