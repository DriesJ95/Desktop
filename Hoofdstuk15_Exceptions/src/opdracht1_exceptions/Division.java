package opdracht1_exceptions;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Voer een cijfer in:");
            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.format("%d/%d=%d", num, den, div);
            keyboard.close();
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Invalid input");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("\nAlways");
        }
    }
}
