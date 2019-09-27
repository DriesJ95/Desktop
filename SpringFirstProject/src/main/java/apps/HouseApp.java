package apps;

import tools.HouseContextConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.interfaces.CleaningService;

public class HouseApp {

    public static void main(String[] args) {

        try(ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(HouseContextConfig.class)) {
            CleaningService broomie = applicationContext.getBean("broomService", CleaningService.class);
            broomie.clean();
            System.out.println("\n");
            CleaningService spongie = applicationContext.getBean("spongeService", CleaningService.class);
            spongie.clean();
            System.out.println("\n");
            CleaningService vacuumie = applicationContext.getBean("vacuumService", CleaningService.class);
            vacuumie.clean();
            System.out.println("\n");
            CleaningService dustie = applicationContext.getBean("dustService", CleaningService.class);
            dustie.clean();
            System.out.println("\n");
            dustie.clean();
        }
    }
}
