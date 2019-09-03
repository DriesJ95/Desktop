package opdracht4;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
//duplicaten zijn niet toegestaan in dit soort set
public class TreeSetApp {
    public static void main(String[] args) {
        System.out.println("Geef een woord in, het programma stopt zodra een woord met een '.' eindigt");
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        Set<String> lijst = new TreeSet();

        while (!flag) {
            System.out.println("Geef een woord in:");
            String userChoice = input.next();
            lijst.add(userChoice);
            if(userChoice.endsWith(".")){
                flag = true;
            }
        }

        System.out.println(((TreeSet<String>) lijst).first());
        System.out.println(((TreeSet<String>) lijst).last());

        System.out.println("-----------------------------------");

        lijst.forEach(System.out::println);
    }
}
