package consoleCompanies;
import consoleCompanies.enums.*;
import interfaces.VideoGame;
import interfaces.VideoGameConsole;

public class Emulator implements VideoGameConsole {
    private boolean deviceWorking;
    //these should be fields
    private String description;
    private Controller contrl;
    private OutputCable outCable;
    private String nameConsole;
    private String manFactor;
    private AdapterCable adpCable;
    private VideoGame game;

    public Emulator(String description, AdapterCable adpCable, OutputCable outCable, Controller contrl, String nameConsole,String manFactor){
        this.description = description;
        this.adpCable = adpCable;
        this.outCable = outCable;
        this.contrl = contrl;
        this.nameConsole = nameConsole;
        this.manFactor = manFactor;
    }

    @Override
    public void insertGame(VideoGame game) {

    }

    @Override
    public void startConsole() {

    }

    @Override
    public void saveGame() {

    }

    @Override
    public void closeGame() {

    }

    @Override
    public void playGame() {

    }

    @Override
    public boolean turnOffConsole() {
        return false;
    }

    @Override
    public boolean consoleWorking() {
        return false;
    }

    public Emulator downloadEmulator(){
        return null;
    }

}
