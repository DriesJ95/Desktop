package videogame.videogameDigital;

public class DigitalVideoGame extends VideoGameDigital {
    public void readVideoGame(){
        System.out.println("DigitalVideoGame is reading the game");
    }
    public void startVideoGame(){
        System.out.println("DigitalVideoGame is starting the game");
    }
    public void saveVideoGame(){
        System.out.println("DigitalVideoGame is saving the game");
    }
    public void shutDownGame(){
        System.out.println("DigitalVideoGame is shutting the game down");
    }
    public String toString(){
        return super.toString() + "";
    }
}
