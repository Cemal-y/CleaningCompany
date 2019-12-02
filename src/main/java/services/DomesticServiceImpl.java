package services;

public class DomesticServiceImpl implements DomesticService {
    GardeningService gardeningService;
    CleaningService cleaningService;


    public void setCleaningService(CleaningService cleaningService){
        this.cleaningService = cleaningService;
    }

    public void setGardeningService(GardeningService gardeningService){
        this.gardeningService = gardeningService;
    }

    @Override
    public void runHousehold() {
        cleaningService.clean();
        gardeningService.garden();
    }
}
