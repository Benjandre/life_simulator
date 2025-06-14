package Items;

import gameAssets.Places_Rooms_Items.Items.Item;

public class Refrigerator extends Item {

    private String brand;
    private String model;
    private int capacity; // in liters
    private boolean hasFreezer;

    public Refrigerator(String brand, String model, int capacity, boolean hasFreezer) {
        super("Refrigerator", "A kitchen appliance for keeping food and drinks cold.", 80000, false);
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.hasFreezer = hasFreezer;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean hasFreezer() {
        return hasFreezer;
    }
    
}
