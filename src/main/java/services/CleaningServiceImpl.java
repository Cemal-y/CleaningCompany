package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CleaningServiceImpl implements CleaningService {
    @Autowired
    CleaningTool cleaningTool;

    @Value("1")
    private int rate;

    public void setCleaningTool(@Qualifier ("vacuum") CleaningTool cleaningTool) {

        this.cleaningTool = cleaningTool;
    }

    @Override
    public void clean() {
        System.out.println("Cleaning is ongoing");
        cleaningTool.doCleanjob();
    }
}
