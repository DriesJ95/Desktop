import java.util.Random;
import java.util.Scanner;

public class Game {
    private final int MAX_ATTEMPTS = 4;
    private Random rand;

    private int guess;
    public int toGuess;

    public void start(Game spel) throws Exception {
        rand = new Random();
        toGuess = rand.nextInt(50) + 1;
        System.out.println("A random number has been generated, you can start guessing: ");
        spel.MakeAGuess();
        if (guess != toGuess) {
            spel.stop();
        }

    }

    public void stop() {
        System.out.println("\nThe game is finished.");
    }

    public int getGuess() {
        return guess;
    }

    public void MakeAGuess() throws Exception {
        for (int i = MAX_ATTEMPTS; i > 0; i--) {
            System.out.println("Input your guess: ");
            Scanner keyboard = new Scanner(System.in);
            try{
                guess = keyboard.nextInt();
                if (guess > 50 || guess < 1) {
                    throw new Exception("Input between 50 and 0 please");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

            if (toGuess == guess) {
                System.out.println("Correct!");
                i = 0;
                stop();
            } else if (toGuess > guess) {
                System.out.print("Hoger!");
                if (i > 1) {
                    System.out.print(" Je hebt nog " + (i - 1) + " kans(en)\n");
                }
            } else {
                System.out.print("Lager!");
                if (i > 1) {
                    System.out.print(" Je hebt nog " + (i - 1) + " kans(en)\n");
                }
            }
        }
    }
}
