package opdracht_launchable;

public class TennisBall extends Ball implements Launchable {
    @Override
    void bounce() {
        System.out.println("Tennisball: Wow, such bounce!");
    }

    @Override
    public void launch() {
        System.out.println("Tennisball: Pew pew, and it's gone");
    }
}
