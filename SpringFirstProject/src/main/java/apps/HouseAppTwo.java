package apps;

import tools.HouseContextConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.interfaces.CleaningService;

public class HouseAppTwo {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(HouseContextConfig.class)){
            CleaningService broomService1 = ctx.getBean("broomService",CleaningService.class);
            CleaningService broomService2 = ctx.getBean("broomService",CleaningService.class);
            CleaningService broomService3 = ctx.getBean("broomService",CleaningService.class);
            broomService1.clean();
            broomService1.clean();
            broomService1.clean();

            broomService2.clean();
            broomService2.clean();
            broomService2.clean();

            broomService3.clean();
            broomService3.clean();
            broomService3.clean();

        }
    }
}
