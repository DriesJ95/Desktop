package main;

public class Person {
    private String name;
    private String lastname;
    private int age;
    private float weight;
    private float length;

    public Person(String name, String lastname, int age, float weight, float length){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.weight = weight;
        this.length = length;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", length=" + length +
                '}';
    }
}
