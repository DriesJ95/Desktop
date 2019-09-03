package entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ALBUMS")
public class Album {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "AUTHOR")
    private String author;
    @Column(name = "TITLE")
    private String title;
    @ElementCollection
    private List<String> tracks;

    public Album(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Album() {
    }

    public long getId() {
        return id;
    }

    public Album setId(long id) {
        this.id = id;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Album setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Album setTitle(String title) {
        this.title = title;
        return this;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public Album setTracks(List<String> tracks) {
        this.tracks = tracks;
        return this;
    }

    @Override
    public String toString() {
        return String.format("Album{id=%d, author='%s', title='%s', tracks=%s}", id, author, title, tracks);
    }
}
