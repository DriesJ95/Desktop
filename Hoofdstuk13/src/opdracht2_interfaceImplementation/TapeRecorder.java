package opdracht2_interfaceImplementation;

public class TapeRecorder implements Recorder{
    private boolean sound = false;
    private boolean recording = false;


    @Override
    public void Record() {
        sound = false;
        recording = true;
        System.out.println("TapeRecorder is silent and recording");
    }

    @Override
    public void Play() {
        sound = true;
        recording = false;
        System.out.println("TapeRecorder is playing and not recording");
    }

    @Override
    public void Stop() {
        sound = false;
        recording = false;
        System.out.println("TapeRecorder is silent and not recording");
    }

    @Override
    public void Pause() {
        sound = false;
        recording = false;
        System.out.println("TapeRecorder is paused");
    }

    @Override
    public void Reverse() {
        sound = true;
        recording = false;
        System.out.println("TapeRecorder is producing satanic mumbojumbo");
    }
}
