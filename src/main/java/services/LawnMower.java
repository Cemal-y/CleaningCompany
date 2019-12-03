package services;

import org.springframework.stereotype.Component;

@Component
public class LawnMower implements GardeningTool{

    @Override
    public void doGardenJob() {
        System.out.println("Lawn Mower is Cleaning");
    }
}
