package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GardeningServiceImpl implements GardeningService{

    @Autowired
    private GardeningTool gardeningTool;


    @Override
    public void setGardeningTool(GardeningTool gardeningTool) {
        this.gardeningTool = gardeningTool;
    }

    @Override
    public void garden() {
        System.out.println("Working in the garden");
        gardeningTool.doGardenJob();
    }

    @Override
    public void init(){
        System.out.println("Gardening service is preparing for work. ");
    }

    @Override
    public void destroy() {
        System.out.println("Gardening service cleaning up. ");
    }

}
