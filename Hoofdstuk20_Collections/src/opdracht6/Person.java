package opdracht6;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String firstName;
    private int weight;
    private int age;
    private Gender gender;

    public Person(String firstName, int weight, int age,Gender gender) {
        this.firstName = firstName;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    public Gender getGender(){
        return this.gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getWeight() == person.getWeight() &&
                getAge() == person.getAge() &&
                Objects.equals(getFirstName(), person.getFirstName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getWeight(), getAge());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "" +
                "firstName='" + firstName + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", gender=" + gender;
    }
}
