package services;

public class Broom implements CleaningTool {

    public Broom() {
        System.out.println("Broom constructor is called");
    }

    @Override
    public void doCleanjob() {
        System.out.println("Broom is Cleaning");
    }
}
