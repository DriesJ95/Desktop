package apps;

import services.implementations.CleaningServiceImpl;
import tools.implementations.DisposableDusterProxy;

public class HouseAppThree {

    public static void main(String[] args) {
        CleaningServiceImpl cleaningService = new CleaningServiceImpl();
        cleaningService.setCleaningTool(new DisposableDusterProxy());
        cleaningService.clean();
        System.out.println("\n");
        cleaningService.clean();
        System.out.println("\n");
        cleaningService.clean();
    }
}
