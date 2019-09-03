package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patient {
    @Id
    @GeneratedValue
    private long id;
    private float weight;
    private float height;

    public Patient() {
    }

    public Patient(float weight, float height) {
        this();
        this.weight = weight;
        this.height = height;
    }

    public long getId() {
        return id;
    }

    public Patient setId(long id) {
        this.id = id;
        return this;
    }

    public float getWeight() {
        return weight;
    }

    public Patient setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public float getHeight() {
        return height;
    }

    public Patient setHeight(float height) {
        this.height = height;
        return this;
    }
}
