package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Board {
    @Column(length = 20)
    private String name;
    @Id
    @GeneratedValue
    private long id;
    @Column(length = 20)
    private String status;

    public String getName() {
        return name;
    }

    public Board setName(String name) {
        if (name.length() > 20){
            throw new IllegalArgumentException("This name is too long");
        }
        this.name = name;
        return this;
    }

    public long getId() {
        return id;
    }
}
