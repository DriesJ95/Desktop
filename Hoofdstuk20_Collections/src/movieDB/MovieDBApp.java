package movieDB;


import java.time.LocalDate;

public class MovieDBApp {
    public static void main(String[] args) {
        MovieDB filmDB = new MovieDB();

        Movie film1 = new Movie("De Rode ridder","Fantasy comic book based story", LocalDate.of(1995, 10, 6));
        Movie film2 = new Movie("De Dode ridder","Fantasy comic book based story", LocalDate.of(1995, 9, 6));
        Movie film3 = new Movie("De Loze ridder","Fantasy comic book based story", LocalDate.of(1995, 8, 6));
        Movie film4 = new Movie("De Boze ridder","Fantasy comic book based story", LocalDate.of(1995, 7, 6));
        Movie film5 = new Movie("De Roze ridder","Fantasy comic book based story", LocalDate.of(1995, 6, 6));

        filmDB.addMovieToDB(film1);
        filmDB.addMovieToDB(film2);
        filmDB.addMovieToDB(film3);
        filmDB.addMovieToDB(film4);
        filmDB.addMovieToDB(film5);

        System.out.println(filmDB.toString());

        filmDB.loanMovie(4);

        System.out.println(filmDB.toString());
    }
}
