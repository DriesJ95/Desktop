package videogame.videogameCD;

public class VideoGameXbox extends VideoGameCD {
    public void readVideoGame(){
        System.out.println("Xbox is reading the game");
    }
    public void startVideoGame(){
        System.out.println("Xbox is starting the game");
    }
    public void saveVideoGame(){
        System.out.println("Xbox is saving the game");
    }
    public void shutDownGame(){
        System.out.println("Xbox is shutting the game down");
    }
    public String toString(){
        return super.toString() + "";
    }
}
