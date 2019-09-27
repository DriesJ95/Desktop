package tools.implementations;

import tools.interfaces.CleaningTool;

public class Vacuum implements CleaningTool {

    public Vacuum(){
        System.out.println("Vacuum created");
    }

    @Override
    public void doCleanJob() {
        System.out.println(" * Vacuuuuuuuuum - vacuumed");
    }
}
