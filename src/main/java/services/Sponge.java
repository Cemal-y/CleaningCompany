package services;

public class Sponge implements CleaningTool{

    public Sponge() {
        System.out.println("Sponge constructor is called");
    }

    @Override
    public void doCleanjob() {
        System.out.println("Sponge is Cleaning");
    }
}
