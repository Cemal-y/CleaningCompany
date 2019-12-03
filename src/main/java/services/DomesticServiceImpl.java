package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DomesticServiceImpl implements DomesticService {

    @Autowired
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
