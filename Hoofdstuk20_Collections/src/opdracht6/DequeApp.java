package opdracht6;

import java.util.ArrayDeque;
import java.util.Queue;

public class DequeApp {
    public static void main(String[] args) {
        Queue<Person> lijn = new ArrayDeque<>();

        Person persoon1 = new Person("Francisco",85,27,Gender.MAN);
        Person persoon2 = new Person("Franco",85,27,Gender.VROUW);
        Person persoon3 = new Person("Francesca",85,27,Gender.MAN);
        Person persoon4 = new Person("Francard",85,27,Gender.VROUW);
        Person persoon5 = new Person("Franko",85,27,Gender.MAN);
        Person persoon6 = new Person("Franques",85,27,Gender.VROUW);
        Person persoon7 = new Person("Franck",85,27,Gender.MAN);
        Person persoon8 = new Person("Frances",85,27,Gender.VROUW);

        Person[] verzameling = new Person[]{persoon1,persoon2,persoon3,persoon4,persoon5,persoon6,persoon7,persoon8};

        for (int i = 0; i < verzameling.length; i++){
            if (verzameling[i].getGender() == Gender.MAN){
                ((ArrayDeque<Person>) lijn).offerFirst(verzameling[i]);
            }else{
                ((ArrayDeque<Person>) lijn).offerLast(verzameling[i]);
            }
        }

        System.out.println("Currently in the line:");
        System.out.println("----------------------------------------------------------------------");
        lijn.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------");

        System.out.println("\nNumber of uncoupled people is currently " + lijn.size());
        System.out.println("----------------------------------------------------------------------");
        while (lijn.size() > 0){
            Person male = ((ArrayDeque<Person>) lijn).removeFirst();
            Person female = ((ArrayDeque<Person>) lijn).removeLast();
            System.out.println("Koppel:\n " + male + " \nEN\n " + female + "\n");
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Number of uncoupled people is currently " + lijn.size());
    }
}
