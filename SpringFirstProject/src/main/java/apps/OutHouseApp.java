package apps;

import tools.HouseContextConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.interfaces.GardeningService;

public class OutHouseApp {
    public static void main(String[] args) {
        try(ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(HouseContextConfig.class)){
            ctx.getBean("gardeningService", GardeningService.class).garden();
        }
    }
}
