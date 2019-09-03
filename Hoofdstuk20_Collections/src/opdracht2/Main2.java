package opdracht2;

import org.w3c.dom.Node;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Geef een woord in, het programma stopt zodra een woord met een '.' eindigt");
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        Collection<String> lijst = new HashSet<>();

        while (!flag) {
            System.out.println("Geef een woord in:");
            String userChoice = input.next();
            lijst.add(userChoice);
            if(userChoice.endsWith(".")){
                flag = true;
            }
        }

        for (int i = lijst.size()-1; i >= 0; i--){
            Iterator it = lijst.iterator();
            //it.
        }

        System.out.println("Er zijn " + lijst.size() + " woorden in de zin.");

        lijst.stream().forEach(System.out::println);
    }
}