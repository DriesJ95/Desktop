package main;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamApp03 {
    public static void main(String[] args) {
        Person persoon1 = new Person("Pedro","Gonzalez", 37,84,186);
        Person persoon2 = new Person("Pedra","Gonzalez", 32,84,186);
        Person persoon3 = new Person("Pedre","Gonzalez", 31,84,186);

        Person[] personen = new Person[] {persoon1, persoon2, persoon3};
        Stream<Person> stroompje = Arrays.stream(personen);
//standaard sysout van een object is zijn toString, dus gewoon sysouten! Person::toString zal in de leegte gesmeten worden
        Stream.of(personen).forEach(System.out::println);

        System.out.println("------------------");

        stroompje.forEach(System.out::println);
    }
}
