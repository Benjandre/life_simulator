package Items;

import Models.Item;

public class Bed extends Item {
    private String material;
    private String size; // e.g., "Single", "Double", "Queen", "King"
    private boolean hasBedding;

    public Bed(String material, String size, boolean hasBedding) {
        super("Bed", "A comfortable bed for resting and sleeping.", 50000, false);
        this.material = material;
        this.size = size;
        this.hasBedding = hasBedding;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public boolean hasBedding() {
        return hasBedding;
}
}
