package services;

import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Order(1)
public class Broom implements CleaningTool {

    public Broom() {
        System.out.println("Broom constructor is called");
    }

    @Override
    public void doCleanjob() {
        System.out.println("Broom is Cleaning");
    }
}
