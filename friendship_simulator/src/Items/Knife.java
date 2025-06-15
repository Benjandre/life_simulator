package Items;

import Models.Item;

public class Knife extends Item {

    private boolean isSharp;
    // Use counter to track how many times the knife has been used. If it reaches a certain threshold, the knife will become dull.
    private int useCounter;

    public Knife(itemType itemType, boolean isStationary) {
        super(itemType, isStationary);
        this.isSharp = true; // Knife is initially sharp
    }

    public boolean isSharp() {
        return isSharp;
    }

    public void sharpenKnife() {
        isSharp = true; // Set the knife as sharp
    }

    public void dull() {
        isSharp = false; // Set the knife as not sharp
    }
    
}
