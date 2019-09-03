package videogame.videogameCartridge;

public class VideoGameCartridgeNES extends VideoGameCartridge {
    public void readVideoGame(){
        System.out.println("NES is reading the game");
    }
    public void startVideoGame(){
        System.out.println("NES is starting the game");
    }
    public void saveVideoGame(){
        System.out.println("NES is saving the game");
    }
    public void shutDownGame(){
        System.out.println("NES is shutting the game down");
    }
    public String toString(){
        return super.toString() + "";
    }
}
