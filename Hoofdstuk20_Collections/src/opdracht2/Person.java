package opdracht2;

import java.util.Objects;

public class Person{
    private String firstName;
    private int weight;
    private int age;

    public Person(String firstName, int weight, int age) {
        this.firstName = firstName;
        this.weight = weight;
        this.age = age;
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
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

}
