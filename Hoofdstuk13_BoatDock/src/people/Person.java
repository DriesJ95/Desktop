package people;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age){
        setName(name);
        setAge(age);
    }

    public Person(){
        this("",0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "| " + this.getName() + " aged " + this.getAge() + " |";
    }
}
