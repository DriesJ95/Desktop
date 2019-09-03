package videogame.videogameCartridge;

public class VideoGameCartridgeSNES extends VideoGameCartridge {
    public void readVideoGame(){
        System.out.println("SNES is reading the game");
    }
    public void startVideoGame(){
        System.out.println("SNES is starting the game");
    }
    public void saveVideoGame(){
        System.out.println("SNES is saving the game");
    }
    public void shutDownGame(){
        System.out.println("SNES is shutting the game down");
    }
    public String toString(){
        return super.toString() + "";
    }
}
