package services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Primary
@Qualifier("vacuum")
public class VacuumCleaner implements CleaningTool {

    public VacuumCleaner() {
        System.out.println("Vacuum Cleaner constructor is called");
    }

    public void doCleanjob(){
        System.out.println("Vacuum Cleaner is Cleaning");
    }

}
