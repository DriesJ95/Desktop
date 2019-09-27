package tools.implementations;

import tools.interfaces.GardeningTool;

public class LawnMower implements GardeningTool {

    public LawnMower(){
        System.out.println("LawnMower created");
    }

    @Override
    public void doGardenJob() {
        System.out.println(" * mow mow mow your lawn, gentle sea of greeeeeeen!");
    }
}
