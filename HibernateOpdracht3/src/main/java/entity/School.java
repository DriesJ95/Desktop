package entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class School {
    @Id
    @GeneratedValue
    private long id;
    private String schoolName;
    @OneToMany(cascade = CascadeType.PERSIST)
    @OrderBy("name ASC")
    private List<Student> students;

    @Override
    public String toString() {
        return schoolName;
    }

    public List<Student> getStudents(){
        return students;
    }

    public long getId() {
        return id;
    }

    public School setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return schoolName;
    }

    public School setName(String name) {
        this.schoolName = name;
        return this;
    }

    public School setStudents(List<Student> students) {
        this.students = students;
        return this;
    }
}
