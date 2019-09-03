package entity;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @ManyToOne
    private School school;

    @Override
    public String toString() {
        return "|Student" +
                ",id " + id +
                ", " + name +
                ", " + school +
                "|" + "\n";
    }

    public long getId() {
        return id;
    }

    public Student setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public School getSchool() {
        return school;
    }

    public Student setSchool(School school) {
        this.school = school;
        return this;
    }
}
