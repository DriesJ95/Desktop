import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {

        //drukken van alle elementen in een array via StreamAPI
        System.out.println("******* Opdracht 1.1 ********");
        String[] array = {"Maarten","Mathias","Brecht","Dries","Hannes","Jamie"};
        Stream<String> stream = Stream.of(array);
        stream.forEach(System.out::println);

        //Drukken van alle  geheele getallen tussen 0 en 100
        System.out.println("********** Opdracht 1.2 *********");
        IntStream.range(0,100)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        //maak een programma dat een aantal personen toevoegt aan een array en vervolgens deze personen afdrukt met een stream
        System.out.println("********* Opdracht 1.3 *********");

        Person[] personArray = {
                new Person("Maarten","Reygaerts","Man",21,72,187),
                new Person("Mathias","Limbourg",GeslachtClass.Geslacht.VROUW,22,95,182)
                };

        Stream.of(personArray).forEach(System.out::println);

    }
}
