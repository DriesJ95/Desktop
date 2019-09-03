package movieDB;

import java.time.LocalDate;

public class Movie {
    private String title;
    private String description;
    private LocalDate releasedatum;
    private int ID;
    private static int totalNumberOfMoviesCreated = 0;
    private boolean available;

    public Movie(String title, String description, LocalDate releasedatum){
        this.title = title;
        this.description = description;
        this.releasedatum = releasedatum;
        this.ID = ++totalNumberOfMoviesCreated;
        available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailability(boolean available){
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public int getID(){
        return this.ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getReleasedatum() {
        return releasedatum;
    }

    public void setReleasedatum(LocalDate releasedatum) {
        this.releasedatum = releasedatum;
    }

    @Override
    public String toString() {
        return "{" +
                "'" + title + '\'' +
                ", description='" + description + '\'' +
                ", releasedatum=" + releasedatum +
                ", available=" + available +
                ", ID= " + ID +
                '}';
    }
}
