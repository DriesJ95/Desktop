package sortingAlgoritmes;
import java.util.Scanner;

public class Opdracht3Strings {
    public static void main(String[] args) {
        System.out.println("Typ gerust een boodschap hieronder. Ik zal de boodschap herafdrukken en je de lengte ervan teruggeven.");
        Scanner keyboard = new Scanner(System.in);
        String text = keyboard.next();

        System.out.println(text);
        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        char a = 'a';
        char o = 'o';
        String replaced = text.replace(a, o);
        System.out.println(replaced);
        int counter = 0;
        for (int i = 0; i < text.length(); i++){
            String compare = Character.toString(text.charAt(i));
            if (compare.equals("e")){
                counter++;
            }
        }
        System.out.println("Er zijn " + counter + " e's gevonden.");
    }
}
