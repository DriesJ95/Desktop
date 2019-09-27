package tools.implementations;

import tools.interfaces.CleaningTool;

public class DisposableDuster implements CleaningTool {
    private boolean alreadyUsed = false;

    public DisposableDuster(){
        System.out.println("Duster created");
    }
    @Override
    public void doCleanJob() {
        if (alreadyUsed){
            System.out.println(" * I've already been used, throw me away!");
        }else{
            System.out.println(" * BANG! and the dust is gone - duster self-destruct : 3 2 1 ... BOOM!");
            alreadyUsed = true;
        }
    }
}
