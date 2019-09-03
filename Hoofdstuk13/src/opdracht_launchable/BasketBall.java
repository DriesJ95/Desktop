package opdracht_launchable;

public class BasketBall extends Ball implements Launchable{

    @Override
    void bounce() {
        System.out.println("Basketball: This ball bounces really well");
    }

    @Override
    public void launch() {
        System.out.println("Basketball: flies well enough, requires more power input though");
    }
}
