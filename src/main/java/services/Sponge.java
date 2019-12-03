package services;

import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Order(2)
public class Sponge implements CleaningTool{

    public Sponge() {
        System.out.println("Sponge constructor is called");
    }

    @Override
    public void doCleanjob() {
        System.out.println("Sponge is Cleaning");
    }
}
