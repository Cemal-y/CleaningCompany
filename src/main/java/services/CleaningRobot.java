package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CleaningRobot {

    @Autowired
    CleaningTool cleaningTool;
    @Autowired
    GardeningTool gardeningTool;

    public void doCleaning(){
        cleaningTool.doCleanjob();
        cleaningTool.doCleanjob();
        gardeningTool.doGardenJob();
    }

}
