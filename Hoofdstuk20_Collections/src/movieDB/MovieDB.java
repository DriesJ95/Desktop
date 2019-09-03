package movieDB;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MovieDB {
    private SortedMap<Integer,Movie> database;

    public MovieDB(SortedMap<Integer, Movie> database) {
        this.database = database;
    }

    public MovieDB(){
        this.database = new TreeMap<>();
    }

    public SortedMap<Integer,Movie> getDB(){
        return database;
    }

    public void setDB(SortedMap<Integer, Movie> database){
        this.database = database;
    }

    public void addMovieToDB(Movie movie){
        this.database.put(movie.getID(),movie);
        System.out.println("Movie: " + movie.toString() + " added to database");
    }

    public void loanMovie(int ID){
        Movie mov = getDB().get(ID);
        if (mov.isAvailable()){
            mov.setAvailability(false);
            System.out.println("The movie is available, enjoy");
            System.out.println(mov.toString());
        }else{
            System.out.println("The movie is unavailable, sorry");
        }
    }

    public void returnMovie(int ID){
        if(getDB().get(ID).isAvailable() == false){
            getDB().get(ID).setAvailability(true);
            System.out.println("The movie was returned and available once more");
        }else{
            System.out.println("The movie-ID entered doesn't correspond with our database");
        }
    }

    @Override
    public String toString() {
        String output = "------------------------\n CURRENT MOVIE DATABASE: \n-----------------------------------------------------------------------------------------------------------------\n";
        for (Map.Entry<Integer, Movie> entry : database.entrySet()) {
            Integer key = entry.getKey();
            Movie value = entry.getValue();
            output = output.concat(value.toString() + "\n");
        }
        output = output.concat("-----------------------------------------------------------------------------------------------------------------\n");
        return output;
    }
}
