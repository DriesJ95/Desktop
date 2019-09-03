package opdracht2;

import java.util.*;
import java.util.stream.IntStream;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Set<Integer> setje = new HashSet<>();

        while(setje.size()<6){
            System.out.println("Geef een getal in tussen 1 en 45");
            int userInput = input.nextInt();
            if (userInput > 0 && userInput < 46){
                setje.add(userInput);
            }else{
                System.out.println("Foute range!");
            }
        }

        setje.forEach(System.out::println);

        Set<Integer> setje2 = new HashSet<>();

        while(setje2.size()<6){
            System.out.println("Generating...");
            int randomGenerated = rand.nextInt(46)+1;
            if (randomGenerated > 0 && randomGenerated < 46){
                setje2.add(randomGenerated);
            }else{
                System.out.println("Foute range!");
            }
        }

        setje2.forEach(System.out::println);

        setje.retainAll(setje2);

        System.out.println(setje);


    }
}
