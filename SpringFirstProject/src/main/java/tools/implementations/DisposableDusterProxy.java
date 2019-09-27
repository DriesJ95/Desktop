package tools.implementations;

import tools.interfaces.CleaningTool;

public class DisposableDusterProxy implements CleaningTool {

    @Override
    public void doCleanJob(){
        new DisposableDuster().doCleanJob();
    }

}
