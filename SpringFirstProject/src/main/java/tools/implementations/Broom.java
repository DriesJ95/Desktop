package tools.implementations;

import tools.interfaces.CleaningTool;

public class Broom implements CleaningTool {

    private int timesUsed;

    public Broom (){
        System.out.println("Broom created");
    }

    @Override
    public void doCleanJob(){
        timesUsed++;
        System.out.println(" * Woosh woosh woosh - broomed for a total of: " + timesUsed + " time(s)");
    }
}
