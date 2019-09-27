package apps;

import contextConfigs.HouseContextConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.interfaces.DomesticService;

public class DomesticApp {
    public static void main(String[] args) {
        try(ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(HouseContextConfig.class)){
            System.out.println("CONTAINER INITIALISED");
            System.out.println("----------------------------------------------------------");
            ctx.getBean("domesticService", DomesticService.class).runHousehold();
        }
    }
}
