package services;

import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public CleaningTool broom(){
        return new Broom();
    }

    @Bean
    @Scope("prototype")
    public CleaningTool sponge(){
        return new Sponge();
    }

    @Bean
    @Scope("prototype")
    public CleaningTool vacuum(){
        return new VacuumCleaner();
    }

    @Bean
    @Scope(value = "prototype",proxyMode = ScopedProxyMode.INTERFACES)
    @Primary
    public CleaningTool duster(){
        return new DisposibleDuster();
    }

    @Bean
    @Primary
    public CleaningService jill(){
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(broom());
        return cs;
    }

    @Bean
    public CleaningService bob(){
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(vacuum());
        return cs;
    }

    @Bean
    public CleaningService jane(){
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(sponge());
        return cs;
    }

    @Bean
    public CleaningService scott(CleaningTool tool){
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(tool);
        return cs;
    }

    @Bean
    public GardeningTool lawnMover(){
        return new LawnMower();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public GardeningService service(GardeningTool gardeningTool){
           GardeningService gs = new GardeningServiceImpl();
           gs.setGardeningTool(gardeningTool);
           return gs;
    }

    @Bean
    public DomesticService domesticService(GardeningService gardeningService, CleaningService cleaningService){
        DomesticService ds = new DomesticServiceImpl();
        ds.setCleaningService(cleaningService);
        ds.setGardeningService(gardeningService);
        return ds;
    }
}
