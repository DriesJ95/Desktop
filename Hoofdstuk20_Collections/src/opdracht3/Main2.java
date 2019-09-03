package opdracht3;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);

        System.out.println(numbers.floor(5));
    }
}
