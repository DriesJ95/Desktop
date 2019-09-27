package tools.implementations;

import tools.interfaces.CleaningTool;

public class Sponge implements CleaningTool {

    public Sponge (){
        System.out.println("Sponge created");
    }
    @Override
    public void doCleanJob() {
        System.out.println(" * Scrub scrub scrub - sponged");
    }
}
