package opdracht2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        Collection<Integer> lijst = new HashSet<>();

        while (!flag) {
            System.out.println("Geef een keuze in");
            System.out.println("1. om een getal toe te voegen");
            System.out.println("2. om de getallen af te drukken");
            System.out.println("3. om som en gemiddelde af te drukken");
            int userChoice = input.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("Geef een getal in: ");
                    lijst.add(input.nextInt());
                    break;
                case 2:
                    lijst.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("De som is " + lijst.stream().mapToInt(Integer::intValue).sum() + " en het gemiddelde is " + lijst.stream().mapToInt(Integer::intValue).average().getAsDouble());break;
                default:
                    flag = true;
            }
        }
    }
}
