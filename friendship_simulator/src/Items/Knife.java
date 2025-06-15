package Items;

import Models.Item;

public class Knife extends Item {

    private String bladeMaterial; // e.g., "Stainless Steel", "Ceramic"
    private String handleMaterial; // e.g., "Wood", "Plastic"
    private double bladeLength; // in centimeters
    private boolean isSharp;

    public Knife(String name, String description, int weight, boolean isUsable, String bladeMaterial, String handleMaterial, double bladeLength) {
        super(name, description, weight, isUsable);
        this.bladeMaterial = bladeMaterial;
        this.handleMaterial = handleMaterial;
        this.bladeLength = bladeLength;
        this.isSharp = true; // Knife is initially sharp
    }

    public String getBladeMaterial() {
        return bladeMaterial;
    }

    public String getHandleMaterial() {
        return handleMaterial;
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public boolean isSharp() {
        return isSharp;
    }

    public void sharpen() {
        isSharp = true; // Set the knife as sharp
    }

    public void dull() {
        isSharp = false; // Set the knife as not sharp
    }
    
}
