package videogame.videogameCartridge;

import interfaces.VideoGame;

import java.util.Date;

public abstract class VideoGameCartridge  implements VideoGame {
    private String name;
    private String description;
    private Date releaseDate;

    public String toString(){
        return "";
    }
}
