package services;

public class DisposibleDuster implements CleaningTool {
    private boolean used = false;

    @Override
    public void doCleanjob() {
        if (used) {
            System.out.println("I am already used, please throw me away");
        } else {
            System.out.println("Wipe the dust away");
            used = true;
        }

    }
}
