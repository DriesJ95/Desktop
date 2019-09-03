package interfaces;

public interface VideoGameConsole {
    void insertGame(VideoGame game);
    void startConsole();
    void saveGame();
    void closeGame();
    void playGame();
    boolean turnOffConsole();
    boolean consoleWorking();

}
