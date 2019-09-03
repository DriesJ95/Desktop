package videogame.videogameCD;

public class VideoGamePlaystation2 extends VideoGameCD {
    public void readVideoGame(){
        System.out.println("PS2 is reading the game");
    }
    public void startVideoGame(){
        System.out.println("PS2 is starting the game");
    }
    public void saveVideoGame(){
        System.out.println("PS2 is saving the game");
    }
    public void shutDownGame(){
        System.out.println("PS2 is shutting the game down");
    }
    public String toString(){
        return super.toString() + "";
    }
}
