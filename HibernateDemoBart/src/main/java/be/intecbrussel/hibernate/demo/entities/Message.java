package be.intecbrussel.hibernate.demo.entities;

import java.sql.Blob;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "MESSAGES")
public class Message {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "TEXT", length = 60,nullable = false)
    private String text;
    @Column(name = "TIME_CREATED")
    private LocalDateTime timeStampCreated;
    @Lob
    @Column(name = "IMAGES")
    private Blob image;


    public int getId() {
        return id;
    }

    public Message() {
        timeStampCreated = LocalDateTime.now();
    }

    public Message(String text) {
        this();
        this.text = text;
    }

    public Message setId(int id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return text;
    }

    public Message setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public String toString() {
        return String.format("Message{id=%d, text='%s'}", id, text);
    }
}
