package videogame.videogameCD;

public class VideoGamePSOne extends VideoGameCD {
    public void readVideoGame(){
        System.out.println("PS one is reading the game");
    }
    public void startVideoGame(){
        System.out.println("PS one is starting the game");
    }
    public void saveVideoGame(){
        System.out.println("PS one is saving the game");
    }
    public void shutDownGame(){
        System.out.println("PS one is shutting the game down");
    }
    public String toString(){
        return super.toString() + "";
    }
}
