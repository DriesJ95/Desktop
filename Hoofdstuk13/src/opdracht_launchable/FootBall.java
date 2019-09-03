package opdracht_launchable;

public class FootBall extends Ball implements Launchable {
    @Override
    void bounce() {
        System.out.println("Football: this isn't meant to bounce well");
    }

    @Override
    public void launch() {
        System.out.println("Football: soars through the sky");
    }
}
