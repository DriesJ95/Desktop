package autoOef;

public class Engine {
    private Boolean engineRunning;

    public Engine (){
        this.engineRunning = false;
    }

    public void startEngine(){
        engineRunning = true;
    }
    public void stopEngine(){
        engineRunning = false;
    }
    public boolean isEngineRunning(){
        return this.engineRunning;
    }
}
