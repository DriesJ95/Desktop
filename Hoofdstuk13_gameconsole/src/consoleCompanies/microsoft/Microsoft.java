package consoleCompanies.microsoft;
import interfaces.VideoGameConsole;
import consoleCompanies.enums.*;

public abstract class Microsoft implements VideoGameConsole {
    public String description;
    public boolean deviceWorking;
    public Controller contrl;
    public OutputCable outCable;
    public String nameConsole;
    public String manFactor;
    public AdapterCable adpCable;
}
