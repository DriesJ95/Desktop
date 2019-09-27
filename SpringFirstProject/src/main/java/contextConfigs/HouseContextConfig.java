package contextConfigs;

import org.springframework.context.annotation.*;
import services.implementations.CleaningServiceImpl;
import services.implementations.DomesticServiceImpl;
import services.implementations.GardeningServiceImpl;
import services.interfaces.CleaningService;
import services.interfaces.DomesticService;
import services.interfaces.GardeningService;
import tools.implementations.*;
import tools.interfaces.CleaningTool;
import tools.interfaces.GardeningTool;

@Configuration public class HouseContextConfig {

    @Bean
    @Scope("prototype")
    @Primary
    public CleaningTool broom(){
        return new Broom();
    }

    @Bean
    @Scope("prototype")
    public CleaningTool sponge() { return new Sponge(); }

    @Bean
    @Scope("prototype")
    public CleaningTool vacuum() { return new Vacuum(); }

    @Bean
    @Lazy
    @Scope(value="prototype",proxyMode = ScopedProxyMode.INTERFACES)
    public CleaningTool duster() { return new DisposableDuster(); }


    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Lazy
    public CleaningService cleaningService(CleaningTool cTool){
        CleaningServiceImpl cleaningService = new CleaningServiceImpl();
        cleaningService.setCleaningTool(cTool);
        return cleaningService;
    }

    @Bean
    @Lazy
    public CleaningService spongeService(){
        CleaningServiceImpl cleaningService = new CleaningServiceImpl();
        cleaningService.setCleaningTool(sponge());
        return cleaningService;
    }

    @Bean
    @Lazy
    public CleaningService vacuumService(){
        CleaningServiceImpl cleaningService = new CleaningServiceImpl();
        cleaningService.setCleaningTool(vacuum());
        return cleaningService;
    }

    @Bean
    @Lazy
    public CleaningService dustService(){
        CleaningServiceImpl cleaningService = new CleaningServiceImpl();
        cleaningService.setCleaningTool(duster());
        return cleaningService;
    }

    @Bean
    @Lazy
    public GardeningTool lawnMower(){
        return new LawnMower();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Lazy
    public GardeningService gardeningService(GardeningTool gardeningTool){
        GardeningServiceImpl gardeningService = new GardeningServiceImpl();
        gardeningService.setGardeningTool(gardeningTool);
        return gardeningService;
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Lazy
    public DomesticService domesticService(GardeningTool gTool, CleaningTool cTool){
        DomesticServiceImpl domesticService = new DomesticServiceImpl();
        domesticService.setCs(cleaningService(cTool));
        domesticService.setGs(gardeningService(gTool));
        return domesticService;
    }
}
