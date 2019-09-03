package opdracht1_wrappers;
import java.util.Scanner;

public class WrapperApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type an integer");
        String input = keyboard.next();
        Integer i = Integer.valueOf(input);
        i = Integer.sum(i,5);
        System.out.println("The value of your input + " +5 + " adds up to " + i);
        System.out.println("Number of bits in an integer: " + Integer.SIZE);
        System.out.println("Number of bytes in an integer: " + Integer.BYTES);
        System.out.println("Number of bytes in a double: " + Double.BYTES);
    }
}
