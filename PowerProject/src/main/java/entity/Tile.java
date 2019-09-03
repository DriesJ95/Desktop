package entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Tile {
    @Id
    @GeneratedValue
    private long id;

    public long getId() {
        return id;
    }
}
