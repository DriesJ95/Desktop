package opdracht2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainPerson {
    public static void main(String[] args) {
        Set<Person> setje = new TreeSet<>(Comparator.comparing(Person::getFirstName).thenComparing(Person::getAge));

        Person persoon1 = new Person("Dries",75,23);
        Person persoon2 = new Person("Aries", 75,23);
        Person persoon3 = new Person("Aries", 75,22);

        setje.add(persoon1);
        setje.add(persoon2);
        setje.add(persoon3);



        setje.forEach(System.out::println);
    }
}
