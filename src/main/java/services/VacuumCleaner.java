package services;

public class VacuumCleaner implements CleaningTool {
    public VacuumCleaner() {
        System.out.println("Vacuum Cleaner constructor is called");
    }

    public void doCleanjob(){
        System.out.println("Vacuum Cleaner is Cleaning");
    }

}
