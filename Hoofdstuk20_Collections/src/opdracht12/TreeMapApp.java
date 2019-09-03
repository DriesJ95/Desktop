package opdracht12;

import opdracht2.Person;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapApp {
    public static void main(String[] args) {
        SortedMap<String, Person> lijst = new TreeMap<>();

        Person persoon1 = new Person("Dries",75,23);
        Person persoon2 = new Person("Aries", 75,23);
        Person persoon3 = new Person("Zries", 75,22);

        lijst.put(persoon1.getFirstName(),persoon1);
        lijst.put(persoon2.getFirstName(),persoon2);
        lijst.put(persoon3.getFirstName(),persoon3);

        System.out.println(lijst.toString());

        System.out.println(lijst.get("Dries"));

        System.out.println("First: " + lijst.get(lijst.firstKey()));
        System.out.println("Last: " + lijst.get(lijst.lastKey()));
    }
}
