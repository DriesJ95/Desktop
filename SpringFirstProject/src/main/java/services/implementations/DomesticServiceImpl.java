package services.implementations;

import services.interfaces.CleaningService;
import services.interfaces.DomesticService;
import services.interfaces.GardeningService;

public class DomesticServiceImpl implements DomesticService {
    private CleaningService cs;
    private GardeningService gs;

    public void setCs(CleaningService cs) {
        this.cs = cs;
    }

    public void setGs(GardeningService gs) {
        this.gs = gs;
    }

    @Override
    public void runHousehold() {
        System.out.println("DOMESTIC SERVICE *buffering*");
        gs.garden();
        cs.clean();
    }

    public void init(){
        System.out.println("DOMESTIC SERVICE INITIATED");
    }

    public void destroy(){
        System.out.println("DOMESTIC SERVICE COMPLETED");
    }
}
