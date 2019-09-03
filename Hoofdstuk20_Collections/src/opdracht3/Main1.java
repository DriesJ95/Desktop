package opdracht3;

import java.util.*;
//Ongeordend t.o.v hashset
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> setje = new LinkedHashSet<>();

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
    }
}
