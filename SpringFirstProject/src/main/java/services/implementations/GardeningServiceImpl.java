package services.implementations;

import services.interfaces.GardeningService;
import tools.interfaces.GardeningTool;

public class GardeningServiceImpl implements GardeningService {
    private GardeningTool gardeningTool;

    public void setGardeningTool(GardeningTool gardeningTool){
        this.gardeningTool = gardeningTool;
    }

    @Override
    public void garden() {
        System.out.println("GARDENING SERVICE *buffering*");
        gardeningTool.doGardenJob();
    }

    public void init(){
        System.out.println("GARDENING SERVICE INITIATED");
    }

    public void destroy(){
        System.out.println("GARDENING SERVICE COMPLETED");
    }
}
