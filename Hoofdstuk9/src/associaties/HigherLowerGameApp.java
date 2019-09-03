package associaties;

import java.util.Scanner;

public class HigherLowerGameApp {
    public static void main(String[] args) {
        System.out.println("Enter a maximum value: ");
        Scanner userInput = new Scanner(System.in);
        int max = userInput.nextInt();
        HigherLowerGame spel = new HigherLowerGame(max);
        boolean wrong = true;
        while(wrong){
            System.out.println("Enter a guess: ");
            int value = userInput.nextInt();
            if (spel.guess(value) > 0){
                System.out.println("Lager");
            }else if (spel.guess(value) < 0){
                System.out.println("Hoger");
            }else{
                System.out.println("Correct!");
                wrong = false;
            }
        }
    }
}
