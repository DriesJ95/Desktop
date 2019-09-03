package opdracht_launchable;

public class LaunchApp {
    public static void main(String[] args) {

        FootBall voetbal = new FootBall();
        voetbal.launch();
        voetbal.bounce();
        BasketBall basket = new BasketBall();
        basket.launch();
        basket.bounce();
        TennisBall tennisbal = new TennisBall();
        tennisbal.launch();
        tennisbal.bounce();

        Rock pierre = new Rock();
        pierre.launch();

        Rocket raket = new Rocket();
        raket.launch();
    }
}
