package services.implementations;

import services.interfaces.CleaningService;
import tools.interfaces.CleaningTool;

public class CleaningServiceImpl implements CleaningService {

    private CleaningTool cleaningTool;

    public CleaningServiceImpl(){}

    public void setCleaningTool(CleaningTool cleaningTool){
        this.cleaningTool = cleaningTool;
    }

    @Override
    public void clean(){
        System.out.println("CLEANING SERVICE *buffering*");
        cleaningTool.doCleanJob();
    }

    public void init(){
        System.out.println("CLEANING SERVICE INITIATED");
    }

    public void destroy(){
        System.out.println("CLEANING SERVICE COMPLETED");
    }
}
