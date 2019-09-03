package opdracht6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsStreamsApp {
    public static void main(String[] args) {
        List<Person> lijst = new ArrayList<>();

        Person persoon1 = new Person("Francisco", 85, 27, Gender.MAN);
        Person persoon2 = new Person("Franco", 85, 27, Gender.VROUW);
        Person persoon3 = new Person("Francesca", 85, 27, Gender.MAN);
        Person persoon4 = new Person("Francard", 85, 23, Gender.VROUW);
        Person persoon5 = new Person("Franko", 85, 27, Gender.MAN);
        Person persoon6 = new Person("Franques", 85, 16, Gender.VROUW);
        Person persoon7 = new Person("Franck", 85, 27, Gender.MAN);
        Person persoon8 = new Person("Frances", 85, 19, Gender.VROUW);


        lijst.add(persoon1);
        lijst.add(persoon2);
        lijst.add(persoon3);
        lijst.add(persoon4);
        lijst.add(persoon5);
        lijst.add(persoon6);
        lijst.add(persoon7);
        lijst.add(persoon8);

        List<Person> lijstV = lijst.stream().filter(a -> a.getAge() > 20 && a.getGender() == Gender.VROUW )
                .sorted()
                .collect(Collectors.toList());

        lijstV.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("Lijst met vrouwen boven de 20, sorted");
        System.out.println("----------------------------------------------------------");
        lijstV.forEach(System.out::println);

        System.out.println("----------------------------------------------------------");
        System.out.println("Originele lijst");
        System.out.println("----------------------------------------------------------");
        lijst.forEach(System.out::println);



    }
}
